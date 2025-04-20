class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }
}

public class Que26 {

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0); 
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;


    for (int i = 0; i <= n; i++) {
      first = first.next;
    }

  
    while (first != null) {
      first = first.next;
      second = second.next;
    }


    second.next = second.next.next;

    return dummy.next;
  }

 
  public static void printList(ListNode head) {
    while (head != null) {
      System.out.print(head.val + (head.next != null ? " -> " : ""));
      head = head.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {

    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    System.out.print("Original List: ");
    printList(head);

    int n = 2;
    head = removeNthFromEnd(head, n);

    System.out.print("Modified List: ");
    printList(head);
  }
}
