package Linked_List.SIngly_LL;

class ListNode{
    int value;
    ListNode next;
    ListNode(int x){
        value=x;
        next=null;
    }
}
public class insertion {
    static void PrintList(ListNode head){
        ListNode curr = head;
        for(;curr !=null;curr=curr.next)
        System.out.print(curr.value + "-->");
    }

    static ListNode InsertAtFirst(int value,ListNode head){
       ListNode newnode=new ListNode(value);
       newnode.next=head;
       head=newnode;
       return head;

    }
    public static void main(String[] args) {
        ListNode head=null;
        head=InsertAtFirst(10,head);
        head=InsertAtFirst(20,head);
        head=InsertAtFirst(30,head);
        head=InsertAtFirst(40,head);
        head=InsertAtFirst(50,head);
        System.out.println("LinkedList before inserting 0 at beginning : ");
        PrintList(head);
        head = InsertAtFirst(0, head);
        System.out.println("LinkedList after inserting 0 at beginning : ");
        PrintList(head);
    }
}
