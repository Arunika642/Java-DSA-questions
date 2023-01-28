package DLL;

import java.util.LinkedList;

public class DoublyLL{
    
   
    private Node head ;

    public void insertFirst(int val){
        Node newnode = new Node(val);

        newnode.next = head;                                  /*The issue with the previous code is that it was trying to access the prev property of the head node when it had not been initialized yet. 
                                                               This was causing a NullPointerException to be thrown.

                                                              I have corrected this by checking if the head node is null 
                                                              before trying to access its prev property and swapping the sequence 
                                                              of the assignment of newnode.next = head and head.prev = newnode . So write it in same format only*/
        if(head != null){
            newnode.prev = null;
            head.prev = newnode;               
        }
        head = newnode;
    }
public void display() {
    Node node = head;
    while(node!= null)
    {
        System.out.print(node.val + "->");
        node = node.next;
    }
    System.out.println("END");

}
private class Node{
    int val = 0;
    Node next;
    Node prev;


public Node (int val) {
    this.val = val;
}

public Node(int val, Node next , Node prev)
{
    this.val =val;
    this.next = next;
    this.prev = prev;
}
}
}
   


