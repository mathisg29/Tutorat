public class Promo {

    private String nomPromo;

    private String annee;

    @Override
    public String toString() {
        return "Promo{" +
                "nomPromo='" + nomPromo + '\'' +
                ", annee='" + annee + '\'' +
                '}';
    }

    public Promo(String nomPromo, String annee) {
        this.nomPromo = nomPromo;
        this.annee = annee;
    }

    public String getNomPromo() {
        return nomPromo;
    }

    public void setNomPromo(String nomPromo) {
        this.nomPromo = nomPromo;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
}
