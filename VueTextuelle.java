public class VueTextuelle {
    protected Scanner lire = new Scanner(System.in);

    public int choixTrieur() {
        System.out.println(
            "Quel trieur voulez-vous ?\n" + 
                "\t1: Simple\n" +
                "\t2: A bulle\n" + 
                "\t3: Rapide\n");
        return (lire.nextInt());
    }

    public int choixElement() {
        System.out.println(
            "Quel sorte d'élément voulez-vous ?\n" + 
                "\t1: Entier\n" +
                "\t2: Chaine\n");
        return (lire.nextInt());
    }

    public int nombreElement() {
        System.out.println("Combien d'élément voulez-vous ?\n");
        return (lire.nextInt());
    }
}
