package DesignPatterns.ObserverPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observer;
    private double ibmPrice, googPrice, aaplPrice;

    StockGrabber(){
        observer = new ArrayList<>();
    }

    /**
     * Add it in the array list
     * @param newObserver
     */
    @Override
    public void register(Observer newObserver) {
        observer.add(newObserver);
    }

    /**
     * remove them from the arrayList
     * @param deleteObserver
     */
    @Override
    public void unRegister(Observer deleteObserver) {
        int observerIndex = observer.indexOf(deleteObserver); // Get the index of that observer.
        System.out.println("Observer " + (observerIndex + 1) +  " deleted");
        observer.remove(observerIndex);
    }

    /**
     * Notify them by cycling through everyone
     */
    @Override
    public void notifyObserver() {
        for (Observer observers : observer){
            observers.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIbmPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAaplPrice(double newAaplPrice){
        this.aaplPrice = newAaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double newGoogPrice){
        this.googPrice = newGoogPrice;
        notifyObserver();
    }
}
