import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Projet monProjet = new Projet("binomotron");
        Projet monProjet1 = new Projet("binomotron1");
        Projet monProjet2 = new Projet("binomotron2");
        Projet monProjet3 = new Projet("binomotron3");

        ArrayList<Projet> maListe = new ArrayList<>();
        maListe.add(monProjet);
        maListe.add(monProjet1);


        Etudiant monEtudiant = new Etudiant("Guillarmou", "Mathis", 23, maListe);

        maListe.add(monProjet2);

        monEtudiant.afficherListe();
        monEtudiant.vieillir();

    }

}
