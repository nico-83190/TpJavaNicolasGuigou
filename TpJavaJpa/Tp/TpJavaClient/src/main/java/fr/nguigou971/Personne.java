package fr.nguigou971;

import javax.persistence.*;

@Entity
@Table(name="Personne",uniqueConstraints= {@UniqueConstraint(columnNames= {"nom","prenom"})})
public class Personne {
    @Id
    @GeneratedValue
    @Column(name="id_personne")
    private int id_personne;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_chien")
    private Chien chien;
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="age")
    private int age;
    public int getId() {
        return id_personne;
    }
    public void setId(int id_personne) {
        this.id_personne = id_personne;
    }
    public Chien getChien() {
        return chien;
    }
    public void setChien(Chien chien) {
        this.chien = chien;
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
    public Personne(int id, String nom, String prenom, int age) {
        super();
        this.id_personne = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Personne() {}
    @Override
    public String toString() {
        return "Personne [id=" + id_personne + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
    }


}