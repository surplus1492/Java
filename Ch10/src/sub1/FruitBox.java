package sub1;

public class FruitBox<T> {//<T> 제네릭 선언
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
