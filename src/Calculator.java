public class Calculator {
    private char operation;
    private double operandOne;
    private double operandTwo;


    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setOperation(char operation) {
        if (operation == '+' || operation == '-') {
            this.operation = operation;
        } else {
            System.out.println("Invalid operation. Please use '+' for addition or '-' for subtraction.");
        }
    }

    public void performOperation() {
        double result = 0.0;
        if (operation == '+') {
            result = operandOne + operandTwo;
        } else if (operation == '-') {
            result = operandOne - operandTwo;
        } else {
            System.out.println("No valid operation set.");
        }
        // Print the result
        System.out.println("Result: " + result);
    }

    public double getResults() {
        if (operation == '+' || operation == '-') {
            return operandOne + operandTwo;
        } else {
            System.out.println("No valid operation set.");
            return 0.0;
        }
    }
}
