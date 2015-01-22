public class FactoryTrieur {

    public static Trieur getTrieur(int numTrieur) {
        switch (numTrieur) {
            case 0: return new TriSimple();
            case 1: return new TriABulle();
            case 2: return new TriRapide();
            default: return NULL;
        }
    }
}
