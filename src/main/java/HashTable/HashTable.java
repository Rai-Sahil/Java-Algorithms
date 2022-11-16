package HashTable;

import java.util.Arrays;
import java.util.HashMap;

public class HashTable {

    String[] theArray;
    int arraySize;
    int itemsInArray = 0;

    HashTable(int size){
        arraySize = size;
        theArray = new String[size];
        //*Filling the whole array with -1 Don't do this in real world
        Arrays.fill(theArray, "-1");
    }

    /**
     * This is an old way of making hashtable
     * @param stringForArray
     * @param theArray
     */
    public void hashFunction(String[] stringForArray, String[] theArray){
        for (int n = 0; n < stringForArray.length; n++){
            String newElementVal = stringForArray[n];
            //*Parse the element to an integer and store that at the array value.
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }
    }

    public void hashFunction2(String[] stringForArray, String[] theArray){
        for (int n = 0; n < stringForArray.length; n++){

            String newElement = stringForArray[n];
            int arrayIndex = Integer.parseInt(newElement) % 29;
            System.out.print("Modulus Index " + arrayIndex + " for value " + newElement + "\n");

            while (theArray[arrayIndex] != "-1"){
                ++arrayIndex;
                System.out.println("Collison Try" + arrayIndex + " Instead\n");
                arrayIndex %= arraySize;
            }

            theArray[arrayIndex] = newElement;

        }
    }

    public String findKey(String key){
        int arrayIndex = Integer.parseInt(key) % 29;

        while(theArray[arrayIndex] != "-1"){
            if(theArray[arrayIndex] == key){
                System.out.println(key + " was found in index " + arrayIndex);
                return theArray[arrayIndex];
            }
            ++arrayIndex;
            arrayIndex &= arraySize;
        }
        return null;
    }
    void displayTheStack(){
        int increment = 0;

        for (int m = 0; m < 3; m++){
            increment += 10;

            for (int n = 0; n < 71; n++){
                System.out.print("-");
            }
            System.out.println();

            for (int n = increment - 10; n < increment; n++){
                System.out.format("| %3s " + " ", n);
            }
            System.out.println("|");

            for (int n = 0; n <71;n++){
                System.out.print("-");
            }
            System.out.println();

            for (int n = increment - 10; n < increment; n++){
                if(theArray[n].equals("-1")){
                    System.out.print("|      ");
                } else{
                    System.out.print(String.format("| %3s " + " ", theArray[n]));
                }
            }

            System.out.println("|");

            for (int n = 0; n <71;n++){
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        HashTable thefunc = new HashTable(30);
//        String[] element = {"1", "3", "5", "21" , "19"};
//
//        thefunc.hashFunction(element, thefunc.theArray);

        String[] elementsInFunc2 = {"100", "123" ,"543", "101", "654" ,"243", "199", "299" ,"99", "74", "23" ,"87"};

        thefunc.hashFunction2(elementsInFunc2, thefunc.theArray);
        thefunc.findKey("101");

        thefunc.displayTheStack();
    }
}
