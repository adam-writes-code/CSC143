public class LinkedList<T> {
     private Node front;
     private int size;


    public LinkedList(){
         clear();
     }

    public int size() {
        return size;
    }

    public void clear(){
         front = null;
         size = 0;
    }

    public void addToFront(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = front;
        front = newNode;
        size++;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if(front==null){
            front = newNode;
        } else {
            Node<T> current = front;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            size++;
        }
    }
/*
    Participation activity on CodeStepByStep
    deleteBack Exercise

    public int deleteBack(){
        if (front==null){
            throw new NoSuchElementException("The list is empty");
        }
            ListNode current = front;

            if (front.next ==null) {
            int returnData = front.data;
            front = null;
            return returnData;
            }
            while (current.next.next!=null) {
                current = current.next;
            }
            int returnData = current.next.data;
            current.next = null;
            return returnData;
        }
*/

    public int count(){
        Node<T> current = front;
        int counter = 0;

        while (current!=null){
            current = current.next;
            counter++;
        }
        return counter;
    }

    private static class Node<E>{
         public E data;
         public Node next;

         public Node() {
             this(null, null);
         }

         public Node(E data) {
             this(data, null);
         }

         public Node(E data, Node<E> next) {
             this.data = data;
             this.next = next;
         }
     }
}
