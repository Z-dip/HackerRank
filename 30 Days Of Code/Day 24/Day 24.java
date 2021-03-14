import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
      //Write your code here
        Node curr = head;
    while(curr.next != null)
        if(curr.next.data == curr.data)
            curr.next = curr.next.next;
        else 
            curr = curr.next;
    return head;
    }

	 public static  Node insert(Node head,int data)
