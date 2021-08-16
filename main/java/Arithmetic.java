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
        try{
            return num1/num2;
        }catch(ArithmeticException exception){
            System.out.println(exception);
        }
        return Integer.MAX_VALUE;
    }
}
