
public class TriABulle<T extends Comparable<T>> extends Tri<T> {

    public void trier() {
        int n = liste.size();
        boolean aucunEchange = false;
        for (int i = n - 1; i > 0 && aucunEchange != true; i--) {
            aucunEchange = true;
            for (int j = 1; j <= i; j++) {
                if (liste.get(j).compareTo(liste.get(j + 1)) > 0) {
                    echanger(liste, j, j + 1);
                    aucunEchange = false;
                }
            }
        }
    }
}
