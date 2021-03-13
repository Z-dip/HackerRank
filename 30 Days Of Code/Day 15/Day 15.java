import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        // if list has no elements, return a new node
        if(head == null){
            return new Node(data);
        }
        
        // else iterate through list, add node to tail, and return head
        Node temporary = head;
        while(temporary.next != null){
            temporary = temporary.next;
        }
        temporary.next = new Node(data);
            
        return head;
    
        
    }

	public static void display(Node head) {
