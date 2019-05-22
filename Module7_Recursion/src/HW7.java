import java.util.Arrays;

public class HW7 {

    public static int methodA(int n) {
        if(n==0) {
            return 0;
        } else if(n>0) {
            return 1 + methodA(n-1);
        } else {
            return 1 + methodA(n+1);
        }
    }

    public static int methodB(String s, char c) {
        if(s.length()==0) {
            return 0;
        } else {
            return (s.charAt(0)==c ? 1 : 0) + methodB(s.substring(1), c);
        }
    }
    public static void main(String []args) {
        //int[] nums = new int[] {1, 4, 6, 3, 2, 7, 8};
        //recMethod(nums, 3, 8);
        Node<Integer> anotherChain = new Node <Integer>(null);
        Node<Integer> chain = new Node<Integer>(Integer.valueOf(2));

        recMethod(chain);
        //System.out.println(countEvens(nums));
        //System.out.println(methodB("hello there",'h'));
        //String word = "cater";
        //System.out.println(word.charAt(0));
        //System.out.println(word.substring(1));
    }

    public static int countEvens(int[] array) {
        return countEvensHelper(array, 0, array.length);
    }

    private static int countEvensHelper(int[] array, int start, int stop) {
        int count = 0;
        if(start==stop) {
            return count;
        } else {
            if(array[start] % 2 == 0) {
                count = 1 + countEvensHelper(array, start+1, stop);
            }
            return count;
        }
    }

    /*public static void recMethod(int[] array, int start, int end) {

        if(start < end) {
            //print the array
            System.out.println(Arrays.toString(array));
            //double the value in the array at position start
            array[start] = array[start]*2;

            recMethod(array, start+1, end);

            //print the array
            System.out.println(Arrays.toString(array));
        } else {
            //print "done"
            System.out.println("done");
        }
    } */

    public static void recMethod(Node firstNode) {
        printChain(firstNode);
        System.out.println();
        if (firstNode.next != null) {
            firstNode.data = (Integer) firstNode.data* 2;
            recMethod(firstNode.next.next);
        } else {
            System.out.println("Done");
        }
        System.out.println();
        printChain(firstNode);
    }

    public static void printChain(Node<Integer> firstNode) {
        if (firstNode!=null) {
            System.out.print(firstNode.data);
            printChain(firstNode.next);
        }
    }

}
