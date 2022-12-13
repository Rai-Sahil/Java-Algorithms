package DesignPatterns.ChainOfResponsibilty;

public class Sub implements Chain{

    Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculation(Numbers request) {
        System.out.println("Second was Sub");
        if(request.getWanted().equals("sub")){
            System.out.println(request.getNum1() - request.getNum2());
        } else {
            System.out.println("Can't Find A shit");
        }
    }
}
