import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        
        ArrayList<Projet> listeProjets = new ArrayList<>();
        Projet binomotron = new Projet("Binomotron");
        listeProjets.add(binomotron);

        Promo promoAccenture = new Promo("promoAccenture", "2024");
        Promo promoCIPA5 = new Promo("promoCIPA5", "2024");

        Etudiant andy = new Etudiant(
                "Tom",
                "Andy",
                23,
                promoAccenture,
                listeProjets);
        Etudiant etudiant2 = new Etudiant(
                "Tom",
                "Toto",
                45,
                new Promo("promoCIPA5", "2024"),
                listeProjets
        );

        etudiant2.getPromo();

        Etudiant etudiant3 = new Etudiant(
                "ta",
                "za",
                451,
                etudiant2.getPromo(),
                listeProjets
        );

        Boolean estlememeetudiant = etudiant2.getAge() == (etudiant3.getAge());
        Boolean toto = etudiant2.getNom().equals(etudiant3.getNom());

        Boolean totopromo = etudiant2.getPromo().equals(etudiant3.getPromo());

        //System.out.println(etudiant2.calculDoubleAge());






        ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
        listeEtudiants.add(etudiant2);
        listeEtudiants.add(etudiant3);
        //System.out.println(listeEtudiants);
        System.out.println(etudiant2);

        Projet resitron = new Projet("resitron");

        etudiant2.getListeProjets().add(resitron);
        //System.out.println(etudiant2);

        System.out.println(
                "Affichage de l'étudiant " +
                etudiant2.getNom())
        ;
        for (int i = 0; i < etudiant2.getListeProjets().size(); i++) {
            System.out.println("Projet : " + etudiant2.getListeProjets().get(i).getNomProjet());
        }

        etudiant2.getListeProjets();


    }

}
