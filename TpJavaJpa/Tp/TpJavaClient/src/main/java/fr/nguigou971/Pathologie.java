package fr.nguigou971;

import javax.persistence.*;

@Entity
@Table(name="pathologie")
public class Pathologie {
    @Id
    @GeneratedValue
    @Column(name="id_pathologie")
    private int id_pathologie;
    @Column(name="nom")
    private String nom;
    @Column(name="description")
    private String description;

    public Pathologie(int id, String nom, String description) {
        super();
        this.id_pathologie = id;
        this.nom = nom;
        this.description = description;
    }

    public Pathologie() {}

    public int getId() {
        return id_pathologie;
    }

    public void setId(int id) {
        this.id_pathologie = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
