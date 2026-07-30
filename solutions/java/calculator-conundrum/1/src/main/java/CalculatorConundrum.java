class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int solution=0;
    switch(operation){
        case "/":
        try{solution= operand1 / operand2;}
           catch(ArithmeticException e){ throw new  IllegalOperationException("Division by zero is not allowed",e);}
         break; 
        case "*": solution=operand1 * operand2;break;
        case "+": solution=operand1+operand2;break;
        case null: throw new IllegalArgumentException("Operation cannot be null");
        case "":throw new IllegalArgumentException("Operation cannot be empty");
        default: throw new IllegalOperationException("Operation '" + operation + "' does not exist");
    }
      String res= operand1 + " " + operation + " "+operand2+" = " + solution ;
        return res;
    }
}
