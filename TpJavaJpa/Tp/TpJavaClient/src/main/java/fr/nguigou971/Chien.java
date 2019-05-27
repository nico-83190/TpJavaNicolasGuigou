package fr.nguigou971;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="chien")
public class Chien {
    @Id
    @GeneratedValue
    @Column(name="id_chien")
    private int id_chien;
    @OneToMany(cascade = CascadeType.ALL)
//@JoinColumn(name = "id_pathologie")
    private List<Pathologie> pathologie=new ArrayList<Pathologie>();

    public void setPathologie(Pathologie pathologie) {
        this.pathologie.add(pathologie);
    }

    public int getId() {
        return id_chien;
    }

    public void setId(int id) {
        this.id_chien = id;
    }

    public Chien(int id) {
        super();
        this.id_chien = id;
    }

    public Chien() {}

}