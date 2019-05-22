public class ListInterfaceTest {

    public static void main(String []args) {

        ListInterface<String> wordList = new AList<>();

        wordList.add("apple");
        wordList.add("banana");
        wordList.add("carrot");
        wordList.add("watermelon");
        for (int i = 1; i <= wordList.getLength(); i++) {
            wordList.remove(i);
        }
        System.out.println(wordList.isEmpty());



        // Compiler error - required array or Iterable but found
        // ListInterface<T> instead
        /* for (String word : wordList) {
            System.out.println(word);
        } */

        // Remember listinterface begins with index 1, not 0.
        // if int i = 0, then exception is thrown, illegal operation something
        /* for (int i = 1; i <= wordList.getLength(); i++) {
            System.out.println(wordList.getEntry(i));
        } */
        // wordList.clear();
        // System.out.println(wordList.isEmpty());
        //System.out.println(wordList.replace(4, "train"));
        //wordList.add("car");
        //wordList.add("bike");
        //wordList.remove(2);
        //System.out.println(wordList.getLength());
        //System.out.println(wordList.getEntry(1));
        //System.out.println(wordList.getEntry(2));
        //System.out.println(wordList.getEntry(3));
        //System.out.println(wordList.getEntry(4));
        // System.out.println(wordList.remove(5));
        //System.out.println(wordList.getEntry(0));
        // wordList.add(2, "dog");
        // System.out.println(wordList.getLength());

    }
}
