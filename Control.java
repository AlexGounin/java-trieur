public class Control {
    protected VueTextuelle vt;
    protected ArrayList<Element> eliste;

    public Control() {
        vt = new VueTextuelle();
        eliste = new ArrayList<Element>();
        initTrieur();
    }

    public void initTrieur() {
        int ct = vt.choixTrieur();
        int ce = vt.choixElement();
        int nbE = vt.nombreElement();

        for (int i = 0; i < nbE; i++)
            eliste.add(FactoryElement.get(ce));
        Trieur<Element> t = FactoryTrieur.get(ct);
        t.setListe(eliste);
        t.trier();
        System.out.println(eliste.toString());
    }
}
