package testandoDS;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;



public class SqlData {
	
private EntityManager manager;
	
	@PersistenceContext(unitName = "testeds")
	private EntityManager entityManager;

	@Transactional
	//@SuppressWarnings("unchecked")
	public String resultado() {
		Query sql = manager.createQuery("GETDATE()");
		return (String) sql.getSingleResult();
	}
}
