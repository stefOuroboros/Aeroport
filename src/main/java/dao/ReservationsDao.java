package dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Reservation;

public class ReservationsDao extends GenericDao<Reservation> {
	private static final Logger logger = LoggerFactory.getLogger(ReservationsDao.class);

	private static ReservationsDao dao;
	
	public ReservationsDao() {
		super(Reservation.class);
	}
	
	public static ReservationsDao instance() {
		logger.info("instance()");
		if (dao == null) {
			dao = new ReservationsDao();
		}
		return dao;
	}

}
