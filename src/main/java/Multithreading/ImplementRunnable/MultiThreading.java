package Multithreading.ImplementRunnable;

//* implementing runnable is just same as extending thread but in this case you'll be calling a thread class.
public class MultiThreading implements Runnable{
    private int threadNumber;

    public MultiThreading(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 5; i++)System.out.println(i + " from thread " + threadNumber);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
