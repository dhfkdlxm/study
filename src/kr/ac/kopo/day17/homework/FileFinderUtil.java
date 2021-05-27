package kr.ac.kopo.day17.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileFinderUtil {

	public void fileList(File dirObj) {
		File[] fileList = dirObj.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t" + dirObj.getName() + "폴더 정보");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.printf("%-28s%-10s%-20s%-10s", "이름", "종류", "크기", "마지막 수정일자");
		System.out.println();
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		for (File fl : dirObj.listFiles()) {
			System.out.printf("%-28s%-10s%-20s%-10s", fl.getName(), fl.isFile() ? "파일" : "폴더", fl.length() + "byte(s)",
					sdf.format(new Date(fl.lastModified())));
			System.out.println();
		}
		System.out.println(
				"----------------------------------------------------------------------------------------------");
	}

	public void view(String dirName) {
		File dirObj = new File(dirName);
		fileList(dirObj);
		String input = input("[M]새폴더\t\t[R]이름변경\t[D]삭제\t[.]상위폴더이동\t[MOVE]하위폴더이동");

		switch (input) {
		case "M":
			System.out.println(dirObj.mkdirs()?"생성성공": "생성실패");
			break;
		case "R":

			break;
		case "D":

			break;
		case ".":

			break;
		case "MOVE":

			break;
		default:
			break;
		}

	}

	public String input(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String input = sc.nextLine();
		return input;
	}

}
