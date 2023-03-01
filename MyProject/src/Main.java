public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Promo unePromo = new Promo("Deuxieme promo", "2023");
        Promo uneDeuxiemePromo = new Promo("Premiere promo", "2023");
        Etudiant unEtudiant = new Etudiant(
                "Dupont",
                "Jean",
                20,
                unePromo
        );

        System.out.println("mon etudiant : " + unEtudiant);
        System.out.println("ma deuxieme promo" + uneDeuxiemePromo);
    }

}
