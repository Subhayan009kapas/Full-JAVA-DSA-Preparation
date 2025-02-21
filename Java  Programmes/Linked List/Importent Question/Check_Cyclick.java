
public class Check_Cyclick {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void AddLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;

        }
        Node curnode = head;
        while (curnode.next != null) {
            curnode = curnode.next;

        }
        curnode.next = newnode;
        newnode.next = null;

    }

    public boolean CheckCyclick() {

        if (head == null) {
            return false;
        }
        Node hare = head;
        Node turtle = head;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (turtle == hare) {
                return true;

            }

        }

        return false;

    }

    public void makecyclick() {
        if (head == null || head.next == null) {
            return;
        }
        Node p = head;
        Node q = head;

       // find the size of the linked list 
        int size = 0;
        Node cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }

        //shft the p to the middle of the limkedlist 
        int i = 0;
        while (i < size / 2) {
            p = p.next;
            i++;

        }

        // Shift the q to the last of the linkedlist

        while (q.next != null) {
            q = q.next;
        }
        q.next = p;    // Create Loop to the P

    }

    public void print() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " ->");
            curNode = curNode.next;

        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        Check_Cyclick list = new Check_Cyclick();
        list.AddLast(2);
        list.AddLast(3);
        list.AddLast(5);
        list.AddLast(6);
        list.print();
        list.makecyclick();
        System.out.println();
        if (list.CheckCyclick()) {
            System.out.println("cyClick group");
        } else {
            System.out.println("Not cyclick");
        }

    }
}
