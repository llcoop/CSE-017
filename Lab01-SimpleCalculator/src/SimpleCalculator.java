
/**
 * @author Logan Cooper
 * @version 2017.2.1
 */
public class SimpleCalculator {
    /**
     * the first operator
     */
    double operand1;
    /**
     * the second operator
     */
    double operand2;
    /**
     * the operation performed
     */
    char operator;
    
    /**
     * @param operand1
     *     the first operator
     * @param operand2
     *     the second operator
     * @param operator
     *     the operator
     */
    public SimpleCalculator(double operand1, double operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    /**
     * @param operand1
     *     the first operator
     */
    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    /**
     * @return operand1
     */
    public double getOperand1() {
        return operand1;
    }

    /**
     * @return operand2
     */
    public double getOperand2() {
        return operand2;
    }

    /**
     * @param operand2
     *     the second operator
     */
    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    /**
     * @return operator
     */
    public char getOperator() {
        return operator;
    }

    /**
     * @param operator
     *     the operator
     */
    public void setOperator(char operator) {
        this.operator = operator;
    }

    /**
     * @return operation between operand1 & operand2
     */
    public double computeOperation() {
        if (operator == '+') 
        {
            return operand1 + operand2;
        } 
        else if (operator == '-') 
        {
            return operand1 - operand2;
        } 
        else if (operator == '/') 
        {
            return operand1 / operand2;
        } 
        else if (operator == '*') 
        {
            return operand1 * operand2;
        } 
        else 
        {
            return 0;
        }
    }
}