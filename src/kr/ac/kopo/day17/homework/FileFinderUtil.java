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
	
	public File dirFile(String dirName) {
		File dirObj = new File(dirName);
		return dirObj;
	}
	

	public void view(String dirName) {
		File dirObj = dirFile(dirName);
		fileList(dirObj);
		String input = input("[M]새폴더\t\t[R]이름변경\t[D]삭제\t[.]상위폴더이동\t[MOVE]하위폴더이동");

		switch (input) {
		case "M":
			String newDirName = input("새폴더 명을 입력하세요 : ");
			
			System.out.println(dirFile(dirName+"/"+newDirName).mkdirs() ? "생성 성공": "생성실패");;
			
			break;
		case "R":
			String nowDirName = input("기존 파일명을 입력하세요 ");
			String updateDirName = input("변경할 파일명을 입력하세요 ");
			System.out.println(dirFile(nowDirName));
			
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
		System.out.print(msg);
		String input = sc.nextLine();
		return input;
	}

}
