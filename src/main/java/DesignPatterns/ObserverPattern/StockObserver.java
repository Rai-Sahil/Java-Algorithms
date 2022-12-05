package DesignPatterns.ObserverPattern;

public class StockObserver implements Observer{

    private double ibmPrice, googPrice, aaplPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++ observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);
    }
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.googPrice = googPrice;
        this.aaplPrice = aaplPrice;

        printThePrices();
    }

    void printThePrices(){
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPrice +
                "\nGoog: " + googPrice + "\n");
    }

    public static void main(String[] args){
        StockGrabber so = new StockGrabber();
        
        StockObserver observer = new StockObserver(so);
        so.setIbmPrice(119);
        so.setAaplPrice(130);
        so.unRegister(observer);
        so.setGoogPrice(43);
    }
}
