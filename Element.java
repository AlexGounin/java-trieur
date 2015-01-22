public abstract class Element<T extends Comparable<T>> implements Comparable <Element> {
    protected T t;

    public Element(T e) {
        t = e;
    }

    public String toString() {
        return t.toString();
    }

    public int compareTo(Element<T> e) {
        return t.compareTo(e.t);
    }
}
