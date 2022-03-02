package methods;

public class MethodsExercises {
    public static double addition(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }
    public static double subtract(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }
    public static double multiplication(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }
    public static double multiplication2(double firstNum, double secondNum) {
        double result = 0;
        for (double i = 1; i <= secondNum; i++) {
            result += firstNum;
        }
        return result;
    }
    public static double division(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }
    public static double modulus(double firstNum, double secondNum){
        return firstNum % secondNum;
    }

    public static void main(String[] args) {
        System.out.println(multiplication(2, 2));
        System.out.println(multiplication2(2, 6));
    }

}
