package service;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("Juris", "Aborggens", "123456-45321");
		Student student3 = new Student("423532", "124 s", "1sfafsg");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

	}

}
