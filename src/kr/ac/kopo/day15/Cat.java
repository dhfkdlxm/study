package kr.ac.kopo.day15;

public class Cat {

	private String name;
	private int age;
	private String kind; // (코리온 숏헤어)

	public Cat() {
		super();
	}
	/**
	 * @param name
	 * @param age
	 * @param kind
	 */
	public Cat(String name, int age, String kind) {
		super();
		this.name = name;
		this.age = age;
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", kind=" + kind + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	

}
