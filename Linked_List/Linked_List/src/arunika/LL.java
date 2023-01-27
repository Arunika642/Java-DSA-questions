package arunika;


import java.util.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    } 
    

    public void InsertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size++;
    }

    public void InsertLast(int val)
    {
        if(tail == null) {
            InsertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

   public void InsertAtIndex(int val,int index)      //insertion at any index
    {
        if(index == 0)
        {
            InsertFirst(val);
            return;
        }
        if(index == size)
        {
            InsertLast(val);
        return; 
        }

        Node temp = head;
        for(int i=1;i<index;i++)
        {
            temp = temp.next;

        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    } 

   public int DeleteFirst()
   {
    int val = head.value;
    head = head.next;
    if(head == null)
    {
        tail = null;
        size--;
    }
    return val;
   }

   public int DeleteLast()
   {
    if(size<=1)
    {
        return DeleteFirst();
    }
    int val = tail.value;
    Node secondLast = get(size-2);

    tail = secondLast;
    tail.next = null;
    size--;
    return val;
   }

   public void DeleteAtIndex(int index) {
    if (index == 0) {
        head = head.next;
        size--;
        return;
    }
    if (index == size - 1) {
        Node secondLast = get(size - 2);
        secondLast.next = null;
        tail = secondLast;
        size--;
        return;
    }
    Node prevNode = get(index - 1);
    Node currNode = prevNode.next;
    prevNode.next = currNode.next;
    size--;
}

public Node get(int index){

    Node node = head;
    for(int i=0;i<index;i++)
    {
        node = node.next;
    }
    return node;
 }
   
    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    }
    class Node{
        int value;
        Node  next;

        public Node(int value){
            this.value = value;
           

        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
             
        }
    }
    
