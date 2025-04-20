public class Que28 {
    int size;
    int[] arr;
    int top1, top2;

    // Constructor
    public Que28(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    // Push to Stack1
    public void push1(int x) {
        if (top1 + 1 < top2) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack1 Overflow");
        }
    }

    // Push to Stack2
    public void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack2 Overflow");
        }
    }

    // Pop from Stack1
    public int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack1 Underflow");
            return -1;
        }
    }

    // Pop from Stack2
    public int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            System.out.println("Stack2 Underflow");
            return -1;
        }
    }

    // Display both stacks
    public void displayStacks() {
        System.out.print("Stack1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nStack2: ");
        for (int i = size - 1; i >= top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Que28 ts = new Que28(10); // Using Que28 here

        ts.push1(1);
        ts.push1(2);
        ts.push1(3);

        ts.push2(9);
        ts.push2(8);
        ts.push2(7);

        ts.displayStacks();

        ts.pop1();
        ts.pop2();

        ts.displayStacks();
    }
}

