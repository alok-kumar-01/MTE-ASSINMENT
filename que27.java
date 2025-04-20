public class que27 {

  static class ListNode {
      int val;
      ListNode next;

      ListNode(int val) {
          this.val = val;
      }
  }

  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      if (headA == null || headB == null) return null;

      ListNode a = headA;
      ListNode b = headB;

      while (a != b) {
          a = (a == null) ? headB : a.next;
          b = (b == null) ? headA : b.next;
      }

      return a;
  }

  public static void printList(ListNode node) {
      while (node != null) {
          System.out.print(node.val + (node.next != null ? " -> " : ""));
          node = node.next;
      }
      System.out.println();
  }

  public static void main(String[] args) {
      // Shared part
      ListNode intersect = new ListNode(8);
      intersect.next = new ListNode(10);

      // List A: 1 -> 3 -> 8 -> 10
      ListNode headA = new ListNode(1);
      headA.next = new ListNode(3);
      headA.next.next = intersect;

      // List B: 2 -> 8 -> 10
      ListNode headB = new ListNode(2);
      headB.next = intersect;

      System.out.print("List A: ");
      printList(headA);

      System.out.print("List B: ");
      printList(headB);

      ListNode intersection = getIntersectionNode(headA, headB);

      System.out.println("Intersection at node with value: " +
          (intersection != null ? intersection.val : "null"));
  }
}
