package Ch07;

public class P170 {

	public static void main(String[] args) {
		
		Student2 stu=new Student2("ȫ�浿", 4, "����Ʈ�������");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student2 stu2=new Student2("�̼���", 3, "������");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		Student2 stu0=new Student2();
	}
}
class Student2{
	String name;
	int grade;
	String department;
	
	Student2(String n,int g,String d){
		name=n;
		grade=g;
		department=d;
	}
	
	Student2() {
	}
}