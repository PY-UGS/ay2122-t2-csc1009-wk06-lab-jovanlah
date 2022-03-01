public class Q2Swap_Llist {
    public static void main(String[] args){

        Linked_List llist = new Linked_List();
  
        // The constructed linked list is:
        // 1->3->5->7->9->11
        for (int i=1;i<=11;i+=2){
            llist.addAndSort(i);
        }
        //question 2
        System.out.println("\nLinked List Before Swapping : ");
        llist.printList();
        llist.swapNodes(1, 5);
        System.out.println("Linked List After Swapping : ");
        llist.printList();
    }
    }

