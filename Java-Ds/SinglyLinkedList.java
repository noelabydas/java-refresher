import java.io.*;
   
public class SinglyLinkedList{

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args){
        SinglyLinkedList ssl= new SinglyLinkedList();
        ssl.head= new ListNode(10);
        ListNode two=new ListNode(8);
        ListNode tri=new ListNode(4);
        ListNode four=new ListNode(11);

        ssl.head.next=two;
        two.next=tri;
        tri.next=four;

    }
}