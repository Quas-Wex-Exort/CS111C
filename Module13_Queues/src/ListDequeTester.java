public class ListDequeTester {

    public static void main(String []args) {
        ListDeque<Integer> lq1 = new ListDeque <>();
        ListDeque<Integer> lq2 = new ListDeque <>();

        lq1.addToBack(12);
        lq1.addToBack(14);
        lq1.addToFront(3);


        System.out.println(lq2.getFront());
        System.out.println(lq2.getBack());
    }
}
