import java.util.Scanner;

public class Q1InsertInt_Llist {
    public static void main(String[] arg){
        Linked_List llist = new Linked_List();
  
        // The constructed linked list is:
        // 1->3->5->7->9->11
        for (int i=1;i<=11;i+=2){
            llist.insertAtTail(i);
        }
        //question 1
        System.out.println("Linked List Before Insert: ");
        llist.printList();

        System.out.println("Please enter insert Integer: ");
        Scanner in = new Scanner(System.in);
        llist.addAndSort(in.nextInt());    //insert at end/tail
        System.out.println("Linked List After Insert: ");
        llist.printList();
        in.close();
    }

}
