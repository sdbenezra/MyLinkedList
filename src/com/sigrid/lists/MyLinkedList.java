package com.sigrid.lists;

class MyLinkedList {
    // head node
    private Node head;

    // LinkedList constructor
    MyLinkedList() {

    }

    // Node definition
    private class Node {
        int data;
        Node next;

        // New node constructor
        Node(int d) {
            data = d;
        }
    }

    // Prepend to beginning of list
    void prepend(int data) {
        Node current = head;
        Node newNode = new Node(data);
        if (current == null) {
            head = newNode;
        } else {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
        }
    }

    // Append to end of list
    void append(int data) {
        Node current = head;
        Node newNode = new Node(data);
        if (current == null) {
            head = newNode;
        } else {
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete from front of list
    void delete(int data) {
        Node current = head;
        if (current == null) {
            System.out.println("Empty List");
        } else if (current.data == data) {
            head = current.next;
            System.out.println(String.format("Removed data %d", data));
        } else {
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    System.out.println("Removed " + data);
                } else {
                    current = current.next;
                }
            }
        }
    }

//   Alternate while loop for delete method
//        while (current != null && current.data != data) {
//        Node prev = current;
//        current = current.next;
//            if (current.data == data) {
//               prev.next = current.next;
//                System.out.println("Removed " + data);
//            }
//        }
//
//    }

    

    // Print out linked list values
    static void printList(MyLinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
}
