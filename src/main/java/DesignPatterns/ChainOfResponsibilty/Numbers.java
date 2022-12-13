package DesignPatterns.ChainOfResponsibilty;

public class Numbers {

    private final int number1;
    private final int number2;

    private final String calculationWanted;

    Numbers(int num1, int num2, String calculationWanted){
        number1 = num1;
        number2 = num2;
        this.calculationWanted = calculationWanted;
    }

    int getNum1() { return number1; }
    int getNum2() { return number2; }
    String getWanted() { return calculationWanted; }

}
