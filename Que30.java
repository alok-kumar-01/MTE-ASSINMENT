public class Que30 {

  Node head;

  static class Node {
      int data;
      Node next;

      Node(int data) {
          this.data = data;
      }
  }

  // Add node at the end
  public void add(int data) {
      Node newNode = new Node(data);
      if (head == null) {
          head = newNode;
          return;
      }
      Node curr = head;
      while (curr.next != null) {
          curr = curr.next;
      }
      curr.next = newNode;
  }

  // Print list
  public void printList() {
      Node curr = head;
      while (curr != null) {
          System.out.print(curr.data + (curr.next != null ? " -> " : ""));
          curr = curr.next;
      }
      System.out.println();
  }

  public static void main(String[] args) {
      Que30 list = new Que30();  // Changed from LinkedList to Que30

      list.add(10);
      list.add(20);
      list.add(30);

      list.printList(); // Output: 10 -> 20 -> 30
  }
}


