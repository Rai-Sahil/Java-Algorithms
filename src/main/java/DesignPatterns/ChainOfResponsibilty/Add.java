package DesignPatterns.ChainOfResponsibilty;

public class Add implements Chain{

    Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculation(Numbers request) {
        System.out.println("First was add");
        if(request.getWanted().equals("add")){
            System.out.println(request.getNum1() + request.getNum2());
        } else {
            nextInChain.calculation(request);
        }
    }
}
