import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Etudiant {

    private String nom;
    private String prenom;
    private int age;
    private ArrayList<Projet> mesProjets;

    public ArrayList<Projet> getMesProjets() {
        return mesProjets;
    }

    public Etudiant(String nom, String prenom, int age, ArrayList<Projet> mesProjets) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.mesProjets = mesProjets;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void afficherListe() {
        for (int i = 0; i < this.getMesProjets().size(); i ++) {
            System.out.println(
                    this.getMesProjets().get(i).getNomProjet()
            );

        }
    }

    public void vieillir() {
        this.age = this.age + 1;
    }
}
