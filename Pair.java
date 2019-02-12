public class Pair<T> {

    private T item1, item2;

    public Pair(T item1, T item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getItem1() {
        return item1;
    }

    public T getItem2() {
        return item2;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return item1.toString() + "\t" + item2.toString();
    }

    public boolean sameItems() {
        return item1.equals(item2);
        // return item1==item2; INCORRECT! tests for aliases, not logical equivalence
    }

    @Override
    public boolean equals(Object other) {
	    /* if (other instanceof Pair<?>) {
	        Pair<?> anotherPair = (Pair<?>) other;

	        return (this.item1 == anotherPair.item1
                    || this.item1 == anotherPair.item2)
                    && (this.item2 == anotherPair.item1
                    || this.item2 == anotherPair.item2);
        } else {
	        return false;
        } */

        if (other instanceof Pair <?>) {
            Pair <?> anotherPair = (Pair <?>) other;

            boolean orderedMatch = this.item1.equals(anotherPair.item1)
                    && this.item2.equals(anotherPair.item2);
            boolean unorderedMatch = this.item1.equals(anotherPair.item2)
                    && this.item2.equals(anotherPair.item1);

            return orderedMatch || unorderedMatch;
        } else {
            return false;
        }
    }
}
