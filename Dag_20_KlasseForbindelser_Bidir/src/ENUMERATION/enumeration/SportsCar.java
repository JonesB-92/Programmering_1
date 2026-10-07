package ENUMERATION.enumeration;

public class SportsCar {
	private CarType make;
	private CarColor color;
	private int price;
	
	public SportsCar(CarType make, CarColor color, int price) {
		this.make = make;
		this.color = color;
		this.price = price;
	}
	
	public CarType getMake() {
		return make;
	}
	public CarColor getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}
	public String toString(){
		String str = "Make:  " + make +
			"\nColor: " + color +
			"\nPrice: " + price;
		return str;
	}

}
