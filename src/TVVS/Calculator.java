package TVVS;

public class Calculator {
    private double lhs, rhs;
    private String operator;

    public Calculator(){}

    public void setLhs(double lhs) { this.lhs = lhs; }

    public void setRhs(double rhs) { this.rhs = rhs; }

    public void setOperator(String operator) { this.operator = operator; }

    public double result(){
        switch (operator){
            case "+": return lhs + rhs;
            case "-": return lhs - rhs;
            case "*": return lhs * rhs;
            case "/": return lhs / rhs;
            case "^": return Math.pow(lhs,rhs);
            default: return 0;
        }
    }


}