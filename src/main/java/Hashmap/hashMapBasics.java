package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * It is used to store 2 values together like password and username
 */
public class hashMapBasics {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String username = scan.next();

        Scanner scanPass = new Scanner(System.in);
        String password = scanPass.next();

        HashMap<String, String> hash = new HashMap<>();

        hash.put(username, password);

        int i = hash.hashCode();
        System.out.println(i);


    }
}
