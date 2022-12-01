package methodreference.assignment01;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(MathOperation.add().operate(15, 3));
		System.out.println(MathOperation.substract().operate(15, 3));
		System.out.println(MathOperation.multiply().operate(15, 3));
		System.out.println(MathOperation.divide().operate(15, 3));

	}

}
