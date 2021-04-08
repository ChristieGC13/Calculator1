public class Calculator {
	private double OperandOne;
	private String Operation;
	private double OperandTwo;
	
	public Calculator() {
		
	}
	
	public double performOperation() {
		double sum = OperandOne + OperandTwo;
		double minus = OperandOne - OperandTwo;
		if (Operation.equals("+")) {
			return sum;
		} else {
			return minus;
		}
	}
	
	public void getResults() {
		double sum = OperandOne + OperandTwo;
		double minus = OperandOne - OperandTwo;
		if (Operation.equals("+")) {
			System.out.println(sum);
		} else {
			System.out.println(minus);
		}
	}
	
	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}
	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}
	
}
