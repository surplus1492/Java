package test03;

public class test03_04 {
	public static void main(String[] args) {
		Student.studentId=20201000;
		
		Student kim=new Student("������", "������", 1);
		kim.studentInfo();
		
		Student lee=new Student("�̼���", "�����а�", 1);
		lee.studentInfo();
		
		Student lim=new Student("�ϲ���", "�濵�а�", 1);
		lim.studentInfo();
	}
}
class Student{
	public static int studentId;
	private String stduentName;
	private String major;
	private int grade;
	
	public Student(String studentName,String major,int grade) {
		++studentId;
		this.stduentName=studentName;
		this.major=major;
		this.grade=grade;
	}
	
	public void studentInfo() {
		System.out.println("================");
		System.out.println("�й� :"+studentId);
		System.out.println("�̸� :"+stduentName);
		System.out.println("���� :"+major);
		System.out.println("�г� :"+grade);
	}
}