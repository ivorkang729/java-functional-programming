package methodreference.assignment01;

public class Main2 {

	public static void main(String[] args) {
		
		// I don't have data. They have data. I give them the behavior.
		System.out.println(calculate(MathOperation.add()));
		System.out.println(calculate(MathOperation.substract()));
		System.out.println(calculate(MathOperation.multiply()));
		System.out.println(calculate(MathOperation.divide()));

	}
	
	static Integer calculate(MathOperation operation) {
		// I have data.
		Integer a = 10;
		Integer b = 2;
		return operation.operate(a, b);
	}

}
