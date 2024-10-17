package src;

public class MyGenericClass <T, T2>{
	
	T x;
	T2 y;
	
	MyGenericClass (T x, T2 y){
		this.x = x;
		this.y = y;
	}
	
	public T getValue() {
		return x;
	}
	

}
