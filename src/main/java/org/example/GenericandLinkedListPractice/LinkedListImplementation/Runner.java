package org.example.GenericandLinkedListPractice.LinkedListImplementation;

public class Runner {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(10);
        list.insert(14);
        list.insert(20);

        list.insertStart(25);

        list.insertAt(2, 55);

        list.deleteAt(4);

        list.show();
    }
}