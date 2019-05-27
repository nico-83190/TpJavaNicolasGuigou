package fr.nguigou971;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test1 {
    public static void main(String[] args) {
        Personne p=new Personne();
        Personne p2=new Personne();
        Personne p3=new Personne();

        Chien chien1=new Chien();
        Chien chien2=new Chien();

        Pathologie pathologie1=new Pathologie();
        Pathologie pathologie2=new Pathologie();
        p.setAge(23);
        p.setNom("GUIGOU");
        p.setPrenom("NICOLAS");
        p.setChien(chien1);

        p2.setAge(58);
        p2.setNom("test");
        p2.setPrenom("testP");
        p2.setChien(chien2);

        p3.setAge(70);
        p3.setNom("jean");
        p3.setPrenom("miche");

        pathologie1.setNom("pat1");
        pathologie1.setDescription("desc");

        pathologie2.setDescription("description2");
        pathologie2.setNom("pat2");

        chien1.setPathologie(pathologie1);
        chien1.setPathologie(pathologie2);

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("testpostgresqllocal");
        EntityManager em=emf.createEntityManager();
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.persist(p);
        em.persist(p2);
        em.persist(p3);
        em.persist(chien1);
        em.persist(chien2);
        em.persist(pathologie1);
        Personne personne=em.find(Personne.class, 1);
        transaction.commit();
    }
}
