package DynamicProgramming;

import java.util.Arrays;

/**
 * This is using DP
 */
public class Fibonnaci {

    int number;
    int[] array;

    Fibonnaci(int number) {
        this.number = number;
        this.array = new int[number];
    }

    public int run(){
        if(number <= 1){ return number; }
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < number; i++){
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[number - 1];
    }

    public int[] getArray() { return array; }

    public static void main(String[] args) {
        Fibonnaci fib = new Fibonnaci(5);
        System.out.println(fib.run());
        System.out.println(Arrays.toString(fib.getArray()));
    }

}
