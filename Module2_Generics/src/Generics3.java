public class Generics3<T> {

    private T obj;

    void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }
}
