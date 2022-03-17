package singlyLinkedLists;

// Create a new class of LinkedList.
public class LinkedList {

    // Create a head pointer from Node type;
    Node head;

    /*
     Create a constructor to assign the head to null,
     because now we just have no element inside LinkedList just we have th head,
     so it's must refer to null;
     */
    public LinkedList (){
        this.head = null;
    }

    /*
    Create a method (insert) to put the first Node inside the LinkedList this new node will have a new value,
    so we will receive it as parameter in this method.
     */
    public void insert (int nodeValue){

        /*
         Create a newNode to be the first Node at the LinkedList
         the value of this newNode will be the value we will receive it from mainMethod
         by call this method and give at an argument to have it here as parameter.
         */
        Node newNode = new Node(nodeValue);

        if (this.head == null){
            // assign the newNode (above) that will receive a value from the nodeValue parameter to the head.
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    /*
    Create a method (includes) that will indicate whether that cas a Node’s value somewhere within the list,
    and return ture if it's exists and false if is not.
     */

    boolean isValueToCheckExists = false;
    public boolean includes (int valueToCheck) {

        /*
        Loop throw all nodes inside LinkedList while pointer !=;
        To loop throw all nodes inside LinkedList we must first create a pointer, and make it refer to the head.
         */
        Node pointer = this.head;
        while (pointer != null) {
            /*
             if we arrive to the value that we want it we will stop and return true,
             and if we loop throw all element, and we don't find the value that we want to check it we will return false.
             */
            if (valueToCheck == pointer.value) {
                isValueToCheckExists = true;
                break;
            } else isValueToCheckExists = false;
            pointer = pointer.next;
        }
        return isValueToCheckExists;
    }

    /*
    Create a method (to string) that will return a string representing all the values in the Linked List.
     */
    public String toString() {

        // initial value that will store node in etch loop.
        String allNodes = "";

        // To loop throw Nodes inside this LinkedList we must first create a pointer, and make it refer to the head.
        Node pointer = this.head;

            /*
           loop throw Nodes inside LinkedList by using while loop, and keep looping while pointer != null
            */
        while (pointer != null) {
            /*
            This part of line below ("{ " + pointer.value + " } -> ") will store the value of node that is inside pointer
            variable in line 74, and store it in allNode variable in line 71, and we get the next value that is inside
            pointer variable in line 74 by take the previous one that is store in allNode variable in line 71, and
            concatenate it with new one by using the sort of (allNodes = allNodes +) allNodes +=,
            so this one take the new value because we do a new loop, and each loop will concatenate the new value.
             */
            allNodes += "{ " + pointer.value + " } -> ";

            // After print the first Node we must transfer the pointer to next one.
            pointer = pointer.next;
        }
        // Return the variable have allNodes values + NULL after print all nodes values.
        return allNodes + "NULL";
    }

//    // Create a print method to see the result in a console by call this method in Main.
//    public void printAllNodes(){
//
//        // To loop throw Nodes inside this LinkedList we must first create a pointer, and make it refer to the head.
//        Node pointer = this.head;
//
//        /*
//         loop throw Nodes inside LinkedList by using while loop, and keep looping while pointer != null
//         */
//        while (pointer != null){
//
//            // Print the value of all Nodes inside LinkedList.
//            System.out.println(pointer.value);
//
//            // After print the first Node we must transfer the pointer to another one.
//            pointer = pointer.next;
//        }
//    }
}
