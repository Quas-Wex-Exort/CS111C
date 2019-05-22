public class HW12Tester {

    public static void main(String[] args) {

        System.out.println("\n*****TESTING PRIORITY PUSH");
        LinkedStack <Integer> numberStack = new LinkedStack <Integer>();
        numberStack.push(2);
        System.out.println(numberStack);
        numberStack.push(4);
        numberStack.push(6);
        System.out.println(numberStack);
        numberStack.push(8);
        numberStack.push(10);
        System.out.println("2 4 6 8 10: " + numberStack + "\n");

        System.out.println(numberStack.priorityPush(22));
        System.out.println(numberStack);

    }
}
