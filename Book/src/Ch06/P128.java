package Ch06;

public class P128 {
	public static void main(String[] args) {
		String[] names= {"ȫ�浿","�̼���","������"};
		
		int[] scores= {90,80,100};
		
		int i=0;
		for(String name:names) {
			System.out.println(name+" : "+scores[i]);
			i++;
		}
			
	}
}
