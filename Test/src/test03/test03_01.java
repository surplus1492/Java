package test03;

public class test03_01 {

	private String name;
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
		test03_01 obj=new test03_01();
		obj.setName("ȫ?浿");
		
		System.out.println(obj.getName());
	}
}
