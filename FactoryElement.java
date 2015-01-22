import java.util.Random;

public class FactoryElement {
    protected Random random = new Random();

    public static Element get(int choix) {
        switch(choix) {
            case 0: return new ElementEntier(Math.abs(random.nextInt() % 500));
            case 1: return new ElementChaine("on fait comme-ci il existait une méthode " + 
                "pour créer une chaine aléatoire");
            default: return null;
        }
    }
}
