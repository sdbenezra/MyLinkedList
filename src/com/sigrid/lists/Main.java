package com.sigrid.lists;

public class Main {

    public static void main(String[] args){
        // Create list with 10 numbers
        MyLinkedList myList = new MyLinkedList();
        for (int i = 0; i < 11; i++){
            myList.prepend(i);
        }

        // Append three more numbers to list
        myList.append(4);
        myList.append(6);
        myList.append(8);

        // Print list
        MyLinkedList.printList(myList);

        System.out.println("\n");

        // Create new empty list & print it
        MyLinkedList emptyList = new MyLinkedList();
        System.out.println("Printing an empty list");
        MyLinkedList.printList(emptyList);

        System.out.println("\n");

        // Testing deleting 10 & 0 from original list
        myList.delete(10);
        myList.delete(0);

        MyLinkedList.printList(myList);

        System.out.println("\n");

        // Append number to empty list & print it
        emptyList.append(3);
        MyLinkedList.printList(emptyList);
        System.out.println("\n");

        // Delete number from single number list and print it
        emptyList.delete(3);
        System.out.println("\n");
        emptyList.delete(5);

    }
}
