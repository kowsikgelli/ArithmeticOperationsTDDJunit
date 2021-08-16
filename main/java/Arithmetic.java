public class Arithmetic {

    public int sum(int num1,int num2){
        return num1+num2;
    }
    public int difference(int num1,int num2){
        return num1-num2;
    }
    public int multiply(int num1,int num2){
        return  num1*num2;
    }

    public int divide(int num1,int num2){
        if(num2==0){
            throw new ArithmeticException("Division by zero not supported");
        }
        return num1/num2;
    }
}
