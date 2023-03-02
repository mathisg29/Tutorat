public class Projet {
    private String nomProjet;

    public String getNomProjet() {
        return nomProjet;
    }

    @Override
    public String toString() {
        return "Projet{" +
                "nomProjet='" + nomProjet + '\'' +
                '}';
    }

    public Projet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }
}
