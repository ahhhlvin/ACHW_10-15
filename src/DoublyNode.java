/**
 * Created by alvin2 on 10/18/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class DoublyNode
{
    DoublyNode prev;
    DoublyNode next;
    String     data;

    public DoublyNode(String data)
    {
        this.data = data;
    }
}

class List2
{
    DoublyNode head;
    DoublyNode tail;

    public void addToHead(String data)
    {
        DoublyNode newNode = new DoublyNode(data);
        newNode.next = head;

        if(head != null)
        {
            // '.prev' only applies to DOUBLY linked lists
            head.prev = newNode;
        }
        else
        {
            // moving from no list items to just ONE, you must move the tail to the newNode
            tail = newNode;
        }
        head = newNode;
    }


    public void addToTail(String data)
    {
        DoublyNode newNode = new DoublyNode(data);
        newNode.prev = tail;
        if(tail != null)
        {
            tail.next = newNode; // old tail.next becomes where the newNode is (the new tail); newNode.next points to tail null
        }
        else
        {
            head = newNode;
        }
        tail = newNode;
    }


    public void delete(String data) {
        DoublyNode current = head;
        while(current != null && !current.data.equals(data)) {
            current = current.next;
        }

        if (current != null) {
            current.next.prev = current.prev;
            current.prev.next = current.next;
        }
    }


    public void print()
    {
        DoublyNode current = head;

        while(current != null)
        {
            System.out.print(current.data + ", ");
            current = current.next;   // point 'current' to what use to be 'current.next'
        }
        System.out.println();
    }

}

class Main2
{
    public static void main(String[] args)
    {
        List2 list = new List2();
        list.addToHead("head");
        list.print();
        list.addToTail("tail");
        list.print();
    }
}

