public class TestGenerics3 {

    public static void main(String []args) {
        Generics3<Integer> in = new Generics3 <Integer>();
        in.add(4);
        System.out.println(in.get());

        Generics3<String> str = new Generics3 <String>();
        str.add("bitch");
        System.out.println(str.get());
    }
}
