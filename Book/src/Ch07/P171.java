package Ch07;

public class P171 {

	public static void main(String[] args) {
		Student3 stu1=new Student3();
		Student3 stu2=new Student3("ȫ�浿");
		Student3 stu3=new Student3("ȫ�浿",4);
		Student3 stu4=new Student3("ȫ�浿",4,"����Ʈ�������");
	}
}
class Student3{
	String name;
	int grade;
	String department;
	
	Student3() {
	}
	
	Student3(String n){
		name=n;
	}
	
	Student3(String n,int g){
		name=n;
		grade=g;
	}
	
	Student3(String n,int g,String d){
		name=n;
		grade=g;
		department=d;
	}
	
	
}