import java.util.ArrayList;

public abstract class Tri<T extends Comparable <T>> {
    ArrayList<T> liste;

    public abstract void trier();

    protected void echanger(int a, int b) {
        T e = liste.get(a);
        liste.set(a, liste.get(b));
        liste.set(b, e);
    }
}
