package Multithreading.ImplementRunnable;

public class MultiThreadThing {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++){
            MultiThreading mutli = new MultiThreading(i);
            Thread thread = new Thread(mutli);
            thread.start();

            //todo if you want one of the thread to finish first just use join method.
//            thread.join();

            //todo if you want to know if one of the thread is still running.
            thread.isAlive();
        }
    }
}
