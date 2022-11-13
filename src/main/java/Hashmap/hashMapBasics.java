package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class hashMapBasics {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String username = scan.next();

        Scanner scanPass = new Scanner(System.in);
        String password = scanPass.next();

        HashMap<String, String> hash = new HashMap<>();

        hash.put(username, password);

        System.out.println(hash);

    }
}
