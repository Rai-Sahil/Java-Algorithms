package FilterMapReduce.RealWorldExample;

import java.util.ArrayList;

public class MainRunner {


    public static void main(String[] args){
        //? Functional Interface video
        double Average = AddingEmployees.multiple().stream()
                .filter(employees -> employees.Grade == 'A')
                .map(employees -> employees.salary)
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println(Average);

        double sumOfSalaray = AddingEmployees.multiple().stream()
                .filter(employees -> employees.Grade == 'A')
                .map(employees -> employees.salary)
                .reduce(Integer::sum).get();
        System.out.println(sumOfSalaray);

        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr2 = new int[10];
        int x = arr2[arr2.length - 1];
    }
}
