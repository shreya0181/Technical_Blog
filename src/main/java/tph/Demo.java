package tph;
import javax.persistence.*;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;

import javax.swing.text.html.parser.Entity;

public class Demo {
    public static  void main (String args[])
    {
        A a= new A();
        a.setId(101);
        a.setName("abs");

        B b= new B();
        b.setId(102);
        b.setName("def");
        b.setValueOne("b");

        C c= new C();
        b.setId(103);
        b.setName("ghi");
        b.setValueOne("c");

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("sampleapp");
        EntityManager em= emf.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();

        em.persist(a);
        em.persist(b);
        em.persist(c);

        tx.commit();
        em.close();
        emf.close();



    }

}
