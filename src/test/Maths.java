package test;

public class Maths {
    int addTwoNumbers(int one, int two){
        return one + two;
    }
    boolean primeNumbers(int number){
        boolean flag = true;
        for (int i = 2; i < number/2; i++){
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
