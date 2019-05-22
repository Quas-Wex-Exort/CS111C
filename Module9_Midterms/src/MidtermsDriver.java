import java.util.Arrays;

public class MidtermsDriver {

    public static void main(String[] args) {
        LList <Integer> numbersBag = new LList <Integer>();
        numbersBag.add(1);
        numbersBag.add(2);
        numbersBag.add(1);
        numbersBag.add(4);
        numbersBag.add(3);
        numbersBag.insertAfterEvery(4, 90);
        System.out.println();
        System.out.println(Arrays.toString(numbersBag.toArray()));
        System.out.println(numbersBag.getLength());

        LList<Integer> nums = new LList<>();
        Node<Integer> firstNode = new Node<Integer>(Integer.valueOf(3));
        nums.add(firstNode.getData());
        nums.add(20);
        nums.add(300);

        System.out.println(countMatches(firstNode, 300));

    }

    public static int countMatches(Node <Integer> Node, Integer number) {
        Node <Integer> currentNode = Node;
        int matchCount = 0;

        while (currentNode != null) {
            if (currentNode.data.equals(number)) {
                matchCount++;
            }
            currentNode = currentNode.next; // unchecked assignment....
        }
        return matchCount;

    }
}