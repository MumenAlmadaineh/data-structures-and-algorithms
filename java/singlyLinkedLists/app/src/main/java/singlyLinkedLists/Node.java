package singlyLinkedLists;

// Create a new class of Node type.
public class Node {

    /*
     give this class two propitiate one for value that will assign the pointer and one for the next node in LinkedList;
     */
    int value;
    Node next;

    // Create a contractor for this class to assign the value by receive it from another class.
    public Node(int value){
        this.value = value;
    }
}
