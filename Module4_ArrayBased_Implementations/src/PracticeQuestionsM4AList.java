import java.util.Arrays;

public class PracticeQuestionsM4AList {

    public static void main(String []args) {

        AList<String> animalList = new AList<String>();

        System.out.println(animalList.getLength());

        animalList.add("ant");
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        animalList.add("cat");
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        animalList.add("dog");
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        animalList.add(2, "snake");
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        animalList.add("bunny");
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        animalList.add("bird");
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        animalList.add("fish");
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        animalList.add("fish");
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        /*
        System.out.println("FISH position: " + animalList.getPosition("fish"));

        System.out.println(animalList.remove(2)); // returns the element at
        // position 2
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        System.out.println(animalList.remove(1));
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        System.out.println(animalList.remove(2));
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        System.out.println(animalList.remove(3));
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        System.out.println(animalList.replace(1, "hamster"));
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));
        animalList.clear();
        System.out.println(animalList.getLength());
        System.out.println(Arrays.toString(animalList.toArray()));

        System.out.println(animalList.getPosition("Weasel"));
        */

    }
}
