package methodreference.assignment02;

public class Main {

	public static void main(String[] args) {
		
		// 5 + 2 - 3 * 7 + 2 / 3
		int onScreenNumber = 5;
		onScreenNumber = calculate(onScreenNumber, MathOperation.add(), 2);
		onScreenNumber = calculate(onScreenNumber, MathOperation.substract(), 3);
		onScreenNumber = calculate(onScreenNumber, MathOperation.multiply(), 7);
		onScreenNumber = calculate(onScreenNumber, MathOperation.add(), 2);
		onScreenNumber = calculate(onScreenNumber, MathOperation.divide(), 3);
		
		System.out.println(onScreenNumber);

	}
	
	// Here, we can change the behavior on the flight.
	static Integer calculate(int onScreenNumber, MathOperation operation, int enteredNumber) {
		return operation.operate(onScreenNumber, enteredNumber);
	}

}
