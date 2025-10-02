package CalculatorOverloading;

public class Calculator {
    public void multiple(int a, int b){
        int result = a+b;
        System.out.println("Result 1:"+result);
    }
    public void multiple(int a, int b, int c){
        int result = a+b+c;
        System.out.println("Result 2:"+result);
    }

    public void multiple(double a, double b){
        double result = a+b;
        System.out.println("Result 3:"+result);
    }

    public void multiple(int... numbers){
        int sum = 0;
        for (int n : numbers){
             sum += n;
        }
        System.out.println(sum);
    }
}

class Main{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiple(5,6);
        calculator.multiple(5,6,7);
        calculator.multiple(5.5, 6.6);
        calculator.multiple(1,2,3,4,5);
    }
}