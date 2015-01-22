public abstract class Trieur<T extends Comparable<T>> {
    protected ArrayList<T> liste;

    public void setListe(ArrayList<T> liste) {
        this.liste = liste;
    }

    public abstract void trier();

    protected void echanger

}
