
  class TrieNode23 {
    TrieNode23[] children;

    public TrieNode23() {
        // Each node has two children: for bit 0 and bit 1
        children = new TrieNode23[2];
    }
}

class Trie {
    TrieNode23 root;

    public Trie() {
        root = new TrieNode23();
    }

    // Insert 32-bit representation of a number
    public void insert(int num) {
        TrieNode23 node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.children[bit] == null) {
                node.children[bit] = new TrieNode23();
            }
            node = node.children[bit];
        }
    }

  
    public int findMaxXOR(int num) {
        TrieNode23 node = root;
        int maxXor = 0;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int toggledBit = 1 - bit;

            if (node.children[toggledBit] != null) {
                maxXor |= (1 << i);
                node = node.children[toggledBit];
            } else {
                node = node.children[bit];
            }
        }
        return maxXor;
    }
}

public class MaxXORFinder {
    public static int findMaximumXOR(int[] nums) {
        Trie trie = new Trie();
        int maxXor = 0;

        for (int num : nums) {
            trie.insert(num);
        }

        for (int num : nums) {
            maxXor = Math.max(maxXor, trie.findMaxXOR(num));
        }

        return maxXor;
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 5, 25, 2, 8};
        System.out.println("Maximum XOR: " + findMaximumXOR(arr)); // Output: 28
    }
}

  

