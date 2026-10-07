package ENUMERATION.enumeration;



public class SportsCarDemo2 {

	public static void main(String[] args) {
	
		
		SportsCar newCar = new SportsCar(CarType.FERRARI, CarColor.RED, 1000000);
		
		
		System.out.println(newCar);

		if (newCar.getMake().equals(CarType.PORSCHE)) {
			System.out.println("Bilen er lavet i Tyskland");
		} else if (newCar.getMake() == CarType.FERRARI) {
			System.out.println("Bilen er lavet i Italien");
		} else if (newCar.getMake().equals(CarType.JAGUAR)) {
			System.out.println("Bilen er lavet i England");

		} else
			System.out.println("Jeg ved ikke hvor bilen er lavet");
	
		
	}
	

}
