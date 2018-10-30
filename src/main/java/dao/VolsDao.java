package dao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Vol;

public class VolsDao extends GenericDao<Vol> {
	
	private static final Logger logger = LoggerFactory.getLogger(VolsDao.class);

	private static VolsDao dao;

	public VolsDao() {
		super(Vol.class);
	}
	
	static public VolsDao instance() {
		logger.info("instance()");
		if (dao == null) {
			dao = new VolsDao();
		}
		return dao;
	}
}
