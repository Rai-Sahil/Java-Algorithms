package Multithreading.ExtendingThreadClassWay;

public class Multithreading {

    public static void main(String[] args){

        //TODO lets say we want to 5 threads at one time inside a for loop
        //* If one thread blows up due to some reason it doesn't stop other


        for (int i = 0; i < 3; i++){
            MultiThreadThing myThing = new MultiThreadThing(i);
            //To run the code in multithreading we need
            myThing.start();//If we use run function here it will not be multithreading
            //Try replacing start with run
        }
    }
}
