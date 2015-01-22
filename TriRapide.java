
public class TriRapide extends Tri {
    private void partitionner(int premier, int dernier, int pivot) {
        echanger(liste, pivot, dernier);
        int j = premier;
        for (int i = premier; i < dernier; i++) {
            if (liste.get(i).compareTo(liste.get(dernier) <= 0)) {
                echanger(liste, i, j);
                j++;
            }
        }
        echanger(liste, dernier, j);
        return j;
    }

    private void triRapide(int premier, int dernier) {
        if (premier < dernier) {
            int pivot = choixPivot(liste, premier, dernier);
            pivot = partitionner(liste, premier, dernier);
            triRapide(liste, premier, pivot - 1);
            triRapide(liste, pivot + 1, dernier);
        }
    }

    public void trier() {
        triRapide(liste, 0, liste.size - 1);
    }
}
