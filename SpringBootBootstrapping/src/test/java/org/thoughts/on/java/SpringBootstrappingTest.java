package org.thoughts.on.java;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.thoughts.on.java.model.Author;

import javax.persistence.EntityManager;


@SpringBootTest
public class SpringBootstrappingTest {

    Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    private EntityManager em;

    @Test
    @Transactional
    @Commit
    public void accessHibernateSession() {
        log.info("... accessHibernateSession ...");

        Author a = new Author();
        a.setFirstName("Thorben");
        a.setLastName("Janssen");
        em.persist(a);
    }
}
