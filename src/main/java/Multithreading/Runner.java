package Multithreading;

public class Runner extends Thread{
    myHashMap<Integer, String> hash;
    public int index;
    public String value;

    Runner(myHashMap<Integer, String> hashMap, int index, String value) {
        hash = hashMap;
        this.index = index;
        this.value = value;
    }

    @Override
    public void run(){
        hash.put(index, value);
        System.out.println(index);
    }


    public static void main(String[] args) throws InterruptedException {
        myHashMap<Integer, String> hash = new myHashMap<>();
        Runner runner = new Runner(hash, 1, "Hello");
        runner.start();
        Runner runner1 = new Runner(hash, 2, "World");
        runner1.start();
        Runner runner2 = new Runner(hash, 3, "Sahil");
        runner2.start();
        Runner runner3 = new Runner(hash, 4, "SUIIIIII");
        runner3.start();
        Thread.sleep(1000);
        System.out.println(hash.get(4));
    }
}
