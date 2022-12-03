package Multithreading.ExtendingThreadClassWay;

public class MultiThreadThing extends Thread{

    //To make this class multi threadable is to overwrite thread class run method...
    //Thats All

    private int threadNumber;

    public MultiThreadThing(int threadNumber){
        this.threadNumber = threadNumber;
    }

    /**
     * What ever code you want to have multi thread just put it here...
     */
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++){
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(1000);//Take one sec to print other number.
                if(threadNumber == 2) throw new RuntimeException();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
