public class Linkedlist {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val=val;
        }
    }
    public static void display(Node head) {
        if(head==null) return;
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.val+ " ");
            temp.next=temp;
        }
        System.out.println();
    }
    public static Node removeDuplicates(Node head) {
        if(head==null || head.next==null) return head;
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val) {
                temp.next=temp.next.next;
                //temp=temp.next;
            } else {
                temp.next=temp;
            }
        }
        return head;
    }
    public static void main(String [] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(2);
        Node e = new Node(2);
        Node f = new Node(3);
        Node g = new Node(4);
        Node h = new Node(4);
        Node i = new Node(5);
        Node j = new Node(5);
        Node k = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;
        k.next = null;
        display(a);
        Node newH = removeDuplicates(a);
        display(newH);
    }
}
