package arunika;

public class Main {
    public static void main(String[] args1) throws Exception {
        LL list = new LL();
        list.InsertFirst(1);
        list.InsertFirst(2);
        list.InsertFirst(3);
        list.InsertFirst(4);
        list.InsertFirst(5);
        list.display();
        list.InsertAtIndex(77, 3);
        int element = list.DeleteFirst();

        list.DeleteAtIndex(3);

        list.display();
    }
}
