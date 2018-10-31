package dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Person;

public class PersonDao extends GenericDao<Person> {
	private static final Logger logger = LoggerFactory.getLogger(PersonDao.class);
	private static PersonDao dao;
	
	public PersonDao() {
		super(Person.class);
	}
	
	public static PersonDao instance() {
		logger.info("instance()");
		if (dao == null) {
			dao = new PersonDao();
		}
		return dao;
	} 
}
