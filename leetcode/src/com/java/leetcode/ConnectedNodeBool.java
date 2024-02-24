package com.java.leetcode;

import java.util.Vector;

public class ConnectedNodeBool {
	
    static class Node {
        int data;
        Node next;
    }
 
    static boolean countCommonNodes(Node head1, Node head2)
    {
        Node current1 = head1;
        Node current2 = head2;
        boolean connected = false;
        Vector<Integer> map = new Vector<Integer>();
        while (current1 != null) {
            map.add(current1.data);
            current1 = current1.next;
        }
        while (current2 != null) {
            if (map.contains(current2.data))
            {
            	connected = true;
            	return connected;
            }
            current2 = current2.next;
        }
        return connected;
    }
 
    static Node push(Node head_ref, int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
 
        return head_ref;
    }
 
    static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
 
    public static void main(String args[])
    {
        Node head1 = null;
        Node head2 = null;

        head1 = push(head1, 17);
        head1 = push(head1, 10);
        head1 = push(head1, 12);
        head1 = push(head1, 4);
        head1 = push(head1, 3);
 
        head2 = push(head2, 12);
        head2 = push(head2, 34);
        head2 = push(head2, 575);
        head2 = push(head2, 8);
        head2 = push(head2, 4);
        head2 = push(head2, 10);
 
        System.out.print("Given Linked List A: \n");
        printList(head1);
 
        System.out.print("Given Linked List B: \n");
        printList(head2);
 
        boolean connected = countCommonNodes(head1, head2);
 
        System.out.print("Are Nodes Connected : " + (connected?"Yes":"No"));
    }
}
