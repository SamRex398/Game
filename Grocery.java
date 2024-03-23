package Game;

public class Grocery {
	public double weight;
	
	public Grocery() {
		this.weight= 0.0;
	}
	
	public void weightNow( double weight) {
		this.weight = weight;
	}
	
	public void checkWeight()  {
		System.out.print(weight + "Kg");
	}
	
	public static void main(String[] args) {
		
		Grocery Gy = new Grocery();
		
		Gy.weightNow(50.43);
		
		Gy.checkWeight();
	}

}
