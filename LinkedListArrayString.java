package datastructures;

/*
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
 */

/**
 *
 * @author Timo
 */
public class LinkedListArrayString {

    static Node head; //this is the head of the list

    //linked list node
    static class Node {

        int data;
        Node next;

        Node previous;

        Node(int d) {
            data = d;
            next = null;
            //get previous node
            previous = null;
        }
    }

    /**
     * *****INSERT A NODE IN SORTED ORDER IN A SINGLY LINKED LIST*****************
     */
    void sortInsertedNode(Node new_node) {

        Node current;
        //special case for head node
        if (head == null || head.data >= new_node.data) {
            new_node.next = head;
            head = new_node;
        } else {
            //locate node before point of insertion
            current = head;

            while (current.next != null && current.next.data < new_node.data) {
                current = current.next;
            }
            new_node.next = current.next;
            current.next = new_node;
        }

    }

    /**
     * **DELETE ANY NODE THAT WE WANT TO IN THE SINGLY LINKED LIST **************
     */
    void deleteNode(Node node, Node n) {

        //check that we cant delete head node if its the only node in the
        //list
        if (node == n) {
            if (node.next == null) {
                System.out.println("there is only one node, linked list cant be empty");
                return;
            }

            //copy data of the next node to the head node
            node.data = node.next.data;

            //store address of the next node
            n = node.next;

            //remove link of next node
            node.next = node.next.next;
            //n=node.next.next;

            //free memory
            System.gc();
            return;
        }
        Node previous = node;
        while (previous.next != null && previous.next != n) {
            previous = previous.next;
        }
        //constraint to check if node really exists
        if (previous.next == null) {
            System.out.println("node is not present in linked list");
            return;
        }
        //remove node from linked list
        previous.next = previous.next.next;
        //free memory
        System.gc();
        return;
    }


    /* create a new node */
    Node newNode(int data) {
        Node x = new Node(data);
        return x;
    }

    /*function to print linked list */
    void printLinkedList(Node head) {
        // Node temp=head;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        //reverse words in a string using linked list

        /* THIS CODE RIGHT HERE REVERSES A WORD IN A STRING */
 /*   String userInput="watching npr right now";

        System.out.println(userInput + " - this is the original string");
        c har[]storeChar=userInput.toCharArray();

        LinkedList<Character> revWordsString=new LinkedList<Character>();
        for(char c: storeChar)
            revWordsString.add(c);
            Collections.reverse(revWordsString);

        Iterator<Character> itr=revWordsString.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next());
        }

        LinkedList<Integer> revInts = new LinkedList<>();
        revInts.add(1);
        revInts.add(2);
        revInts.add(3);
        revInts.add(4);
        System.out.println(revInts + " the original list");

        Iterator<Integer> itr = revInts.iterator();

        while (itr.hasNext()) {
            Collections.reverse(revInts);
            System.out.print(itr.next());
        }
         */
        LinkedListArrayString revInts = new LinkedListArrayString();

        Node new_node;

        new_node = revInts.newNode(5);
        revInts.sortInsertedNode(new_node);

        new_node = revInts.newNode(10);
        revInts.sortInsertedNode(new_node);

        new_node = revInts.newNode(7);
        revInts.sortInsertedNode(new_node);

        new_node = revInts.newNode(3);
        revInts.sortInsertedNode(new_node);

        new_node = revInts.newNode(1);
        revInts.sortInsertedNode(new_node);

        new_node = revInts.newNode(9);
        revInts.sortInsertedNode(new_node);

        new_node = revInts.newNode(19);
        revInts.sortInsertedNode(new_node);

        new_node = revInts.newNode(0);
        revInts.sortInsertedNode(new_node);

        //delete node 3
        System.out.println("Deleting node :" + head.next.next.data);
        revInts.deleteNode(head, head.next.next);

        System.out.println("created linked list");
        revInts.printLinkedList(head);
    }

}
