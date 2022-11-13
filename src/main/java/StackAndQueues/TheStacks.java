package StackAndQueues;

import java.util.Arrays;

public class TheStacks {

    private String[] stackArray;

    private int stackSize;

    private int topOfStack = -1;

    TheStacks(int size){
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }

    public void push(String input){
        if(topOfStack + 1 < stackSize){
            topOfStack++;
            stackArray[topOfStack] = input;
        } else System.out.println("Sorry");

        displayTheStack();

        System.out.println("PUSH " + input + " was added to the stack");
    }

    public String pop(){
        if(topOfStack >= 0){
            displayTheStack();
            System.out.println("POP " + stackArray[topOfStack] + " was removed from the stack");
            stackArray[topOfStack] = "-1";

            return stackArray[topOfStack--];
        } else{
            displayTheStack();
            System.out.println("Sorry the stack is empty");
            return "-1";
        }
    }

    public void popAt(int index){
        if(topOfStack >= 0){
                stackArray[index] ="-1";
            displayTheStack();
        }else{
            displayTheStack();
            System.out.println("Sorry the stack is empty");
        }
    }

    public String peek(){
        displayTheStack();
        System.out.println("PEEK " + stackArray[topOfStack] + " is at the top of the stack");
        return stackArray[topOfStack];
    }

    public void pushMany(String multi){
        String[] tempString = multi.split(" ");

        for (int i = 0; i< tempString.length; i++){
            push(tempString[i]);
        }
    }

    public void popAll(){
        for (int i = topOfStack; i >= 0; i--){
            pop();
        }
    }
    public void displayTheStack(){
        for (int n = 0; n < 61; n++){System.out.print("-");}
        System.out.println();

        for (int n = 0; n < stackSize; n++){
            System.out.format("| %2s " + " ", n);
        }

        System.out.println("|");
        for (int n = 0; n < 61; n++){System.out.print("-");}
        System.out.println();

        for (int n = 0; n < stackSize; n++){
            if(stackArray[n].equals("-1")) System.out.print("|     ");
            else System.out.print(String.format("| %2s " + " ", stackArray[n]));
        }

        System.out.println("|");
        for (int n = 0; n < 61; n++){System.out.print("-");}
        System.out.println();
    }

    public static void main(String[] args){

        TheStacks stack = new TheStacks(10);
        stack.push("10");
        stack.push("15");
        stack.pushMany("2 45 65 76 89");
        stack.peek();
        //stack.popAll();
        stack.popAt(2);

    }
}
