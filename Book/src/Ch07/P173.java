package Ch07;

public class P173 {

}
class Car2{
	String color;
	String company;
	String type;
	
	Car2(){
		this("whtie","���","����");
	}
	
	Car2(String color,String company,String type){
		this.color=color;
		this.company=company;
		this.type=type;
	}
	
	Car2(String com,String t){
		this("white",com,t);
	}
	
	Car2(String t){
		this("white","���",t);
	}
	
	public String toString() {
		return color+"-"+company+"-"+type;
	}
	
}