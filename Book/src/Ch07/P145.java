package Ch07;

public class P145 {

	public static void main(String[] args) {
		P144[] cars=new P144[3];
		
		P144 tico=new P144();
		
		tico.color="ȭ��Ʈ";
		tico.company="���";
		tico.type="����";
		
		for (int i = 0; i < cars.length; i++) {
			cars[i]=tico;
		}
		
		System.out.println("2�� �ε��� color :"+cars[2].color);
		
		cars[0].color="�ҷ�";
		
		System.out.println("2�� �ε��� color :"+cars[2].color);
	}
}
