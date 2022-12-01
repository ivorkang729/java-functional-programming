package methodreference.assignment01;

@FunctionalInterface
public interface MathOperation {
	
	// 抽象 ----------------------------------
	Integer operate(Integer a, Integer b);
	
	// 實作 ----------------------------------
	static MathOperation add() {
		return (a, b) -> a + b;
	}
	
	// 實作 ----------------------------------
	static MathOperation substract() {
		return (a, b) -> a - b;
	}
	
	// 實作 ----------------------------------
	static MathOperation multiply() {
		return (a, b) -> a * b;
	}
	
	// 實作 ----------------------------------
	static MathOperation divide() {
		return (a, b) -> a / b;
	}
}
