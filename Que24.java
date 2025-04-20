import java.util.Scanner;

public class Que24 {

    public static int setBit(int num, int i) {
        return num | (1 << i);
    }

    public static int clearBit(int num, int i) {
        return num & ~(1 << i);
    }

    public static int toggleBit(int num, int i) {
        return num ^ (1 << i);
    }
    

    public static boolean isBitSet(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0b0101; // binary 5
        System.out.println("Initial number (binary): " + Integer.toBinaryString(number));

        System.out.print("Enter the bit position to manipulate (0-based): ");
        int i = scanner.nextInt();

        number = setBit(number, i);
        System.out.println("After setting bit " + i + ": " + Integer.toBinaryString(number));

        number = clearBit(number, i);
        System.out.println("After clearing bit " + i + ": " + Integer.toBinaryString(number));

        number = toggleBit(number, i);
        System.out.println("After toggling bit " + i + ": " + Integer.toBinaryString(number));

        boolean isSet = isBitSet(number, i);
        System.out.println("Is bit " + i + " set? " + isSet);
    }
}
