package arunika;

public class Main {
    public static void main(String[] args) throws Exception {
        LL list = new LL();
        list.InsertFirst(3);
        list.InsertFirst(2);
        list.InsertFirst(8);
        list.InsertFirst(17);
        list.InsertLast(99);

        
        list.InsertAtIndex(77, 3);
        list.display();
    }
}
