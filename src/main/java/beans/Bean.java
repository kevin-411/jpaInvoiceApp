package beans;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Bean {
    @PersistenceContext(unitName = "jpaInvoice")
    protected EntityManager entityManager;
}
