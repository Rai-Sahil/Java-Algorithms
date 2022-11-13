package StackAndQueues;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Queues allows us to access the first person inserted in the array
 */
public class TheQueues {

    private String[] queueArray;

    private int queueSize;

    private int front, rear, numberOfItems = 0;

    TheQueues(int size){
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    public void insert(String input){
        if(numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("INSERT " + input + " was added to the queue");
        } else System.out.println("Sorry cannot add the input");
    }

    public void removeItems(){
        if (numberOfItems > 0){
            System.out.println("REMOVE " + queueArray[front]);
            queueArray[front] = "-1";
            front--;
            numberOfItems--;
        } else{
            System.out.println("Sorry Queue is empty");
        }
    }

    public String peek(){
        System.out.println("The first item is " + queueArray[front]);
        return queueArray[front];
    }

    public void priorityInsert(String input){
        int i;
        if(numberOfItems == 0){
            insert(input);
        } else{
            for(i = numberOfItems -1; i >= 0; i--){
                if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])){
                    queueArray[i+1] = queueArray[i];
                } else break;
            }
            queueArray[i+1] = input;
            rear++;
            numberOfItems++;
        }
    }

    public void displayTheStack(){
        for (int n = 0; n < 61; n++){System.out.print("-");}
        System.out.println();

        for (int n = 0; n < queueSize; n++){
            System.out.format("| %2s " + " ", n);
        }

        System.out.println("|");
        for (int n = 0; n < 61; n++){System.out.print("-");}
        System.out.println();

        for (int n = 0; n < queueSize; n++){
            if(queueArray[n].equals("-1")) System.out.print("|     ");
            else System.out.print(String.format("| %2s " + " ", queueArray[n]));
        }

        System.out.println("|");
        for (int n = 0; n < 61; n++){System.out.print("-");}
        System.out.println();
    }

    public static void main(String[] args){
        TheQueues queue = new TheQueues(10);
        queue.priorityInsert("10");
        queue.priorityInsert("11");
        queue.priorityInsert("12");
        queue.priorityInsert("9");

        queue.displayTheStack();
        queue.removeItems();
        queue.displayTheStack();
    }
}
