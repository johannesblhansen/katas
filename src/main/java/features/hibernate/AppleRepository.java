package features.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AppleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void add(Apple a){
        entityManager.persist(a);
    }

    public Apple getAppleById(String id){
        return entityManager.find(Apple.class, id);
    }

    private Criteria createCriteria() {
        return entityManager.unwrap(Session.class).createCriteria(Apple.class);
    }
}
