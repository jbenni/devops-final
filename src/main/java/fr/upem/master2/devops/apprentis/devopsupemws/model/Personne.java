package fr.upem.master2.devops.apprentis.devopsupemws.model;
public class Personne {
    private String name;
    private String prenom;

    public Personne(String name, String prenom) {
        this.name = name;
        this.prenom = prenom;
    }

    public String getName() {
        return name;
    }

    public String getPrenom() {
        return prenom;
    }
}
