public class Linked_List{
    public Node head; // head of list

    //addAndSort function
    public void addAndSort(int value){

        Node new_Node = new Node(value);
            
        if (head == null){
            head = new_Node;
        }
        else if(new_Node.data <= head.data){
            // 1. Make next of new Node as head
            new_Node.next = head;
            // 2. Move the head to point to new Node
            head = new_Node;           
        }
        else
        {
            Node temp = head;
            Node prev = null;
            while (temp.next != null){
                prev = temp;
                temp = temp.next;
                if (new_Node.data <= temp.data){
                    prev.next = new_Node;
                    new_Node.next = temp; 
                    return;
                }
            }
            temp.next = new_Node;
        }
    }
    // Function to swap Nodes x and y in
    // linked list by changing links
    public void swapNodes(int index1, int index2)
    {
        int maxSeacrhSize = index1;
        if (index1<index2){
            maxSeacrhSize = index2;
        }
        // Search for index1/2 (keep track of prevX/Y and CurrX/Y)
        Node prevX = null, currX = null, prevY = null, currY = null;
        Node prev = null, curr = head;
        int counter = 0;
        while (curr != null && counter <= maxSeacrhSize) {
            if (counter == index1){
                prevX = prev;
                currX = curr;
            }
            if (counter == index2){
                prevY = prev;
                currY = curr;
            }
             prev = curr;
            curr = curr.next;
            counter++;
        }
      
        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else // make y the new head
            head = currY;
      
        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;
      
        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
      
    // Function to add Node at beginning of list.
    public void insertAtHead(int new_data)
    {
        // 1. alloc the Node and put the data
        Node new_Node = new Node(new_data);
      
        // 2. Make next of new Node as head
        new_Node.next = head;
      
        // 3. Move the head to point to new Node
        head = new_Node;
    }

    //insert at end/tail
    public void insertAtTail(int value){

        Node node = new Node(value);
            
        if (head == null){
            head = node;
        }
        else
        {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public int searchValue(int searchNum){

        Node temp = head;
        int counter = 0;
        while(temp != null){
            if  (temp.data == searchNum){
                return counter;
            }
            temp = temp.next;
            counter++;
        }
        return -1;
    }

        // This function prints contents of linked list
        // list starting from the head to tail
    public void printList()
    {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }
}
