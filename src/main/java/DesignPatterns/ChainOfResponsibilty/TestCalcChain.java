package DesignPatterns.ChainOfResponsibilty;

public class TestCalcChain {

    public static void main(String[] args){

        Chain chainCalc = new Add();
        Chain chainCalc2 = new Sub();

        chainCalc.setNextChain(chainCalc2);

        Numbers number = new Numbers(4, 2, "sub");

        chainCalc.calculation(number);
    }
}
