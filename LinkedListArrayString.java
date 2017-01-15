/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Timo
 */
public class LinkedListArrayString {

    Node head; //this is the head of the list

    //linked list node
    class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

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

        /* create a new node */
        Node newNode(int data){
            Node x=new Node(data);
            return x;
        }
        
        /*function to print linked list */
        void printLinkedList(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
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
        LinkedListArrayString revInts= new LinkedListArrayString();
       
        Node new_node;
        
        new_node=revInts.newNode(5);
        revInts.sortInsertedNode(new_node);
        
        new_node=revInts.newNode(10);
        revInts.sortInsertedNode(new_node);
        
         new_node=revInts.newNode(7);
        revInts.sortInsertedNode(new_node);
        
         new_node=revInts.newNode(3);
        revInts.sortInsertedNode(new_node);
        
         new_node=revInts.newNode(1);
        revInts.sortInsertedNode(new_node);
        
         new_node=revInts.newNode(9);
        revInts.sortInsertedNode(new_node);
        
        new_node=revInts.newNode(19);
        revInts.sortInsertedNode(new_node);
        
        new_node=revInts.newNode(0);
        revInts.sortInsertedNode(new_node);
        
        System.out.println("created linked list");
        revInts.printLinkedList();
    }
    

}
