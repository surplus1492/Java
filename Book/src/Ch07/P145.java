package Ch07;

public class P145 {

	public static void main(String[] args) {
		P144[] cars=new P144[3];
		
		P144 tico=new P144();
		
		tico.color="화이트";
		tico.company="대우";
		tico.type="경차";
		
		for (int i = 0; i < cars.length; i++) {
			cars[i]=tico;
		}
		
		System.out.println("2번 인덱스 color :"+cars[2].color);
		
		cars[0].color="불랙";
		
		System.out.println("2번 인덱스 color :"+cars[2].color);
	}
}
