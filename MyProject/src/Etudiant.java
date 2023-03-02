import java.util.ArrayList;
import java.util.Objects;

public class Etudiant {

    private String nom;
    private String prenom;
    private int age;
    private Promo promo;
    private ArrayList<Projet> listeProjets;

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", promo=" + promo +
                ", listeProjets=" + listeProjets +
                '}';
    }

    public Etudiant(String nom, String prenom, int age, Promo promo, ArrayList<Projet> listeProjets) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.promo = promo;
        this.listeProjets = listeProjets;
    }

    public ArrayList<Projet> getListeProjets() {
        return listeProjets;
    }

    public void setListeProjets(ArrayList<Projet> listeProjets) {
        this.listeProjets = listeProjets;
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

    public Promo getPromo() {
        return promo;
    }

    public void setPromo(Promo promo) {
        this.promo = promo;
    }

    public int calculDoubleAge() {
        return this.age * 2;
    }

}
