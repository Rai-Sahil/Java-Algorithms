package Hashmapping;

import java.sql.SQLOutput;
import java.util.*;

public class Hashset {
    public static void main(String[] args){
        String[] array = {"hello", "world", "hello"};
        List<String> list = Arrays.asList(array);

        System.out.printf("%s ", list);
        System.out.println();

        Set<String> set = new HashSet<>(list);
        System.out.printf("%s ", set);

    }
}
