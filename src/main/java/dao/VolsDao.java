package dao;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.PlaneType;
import model.Vol;

public class VolsDao extends GenericDao<Vol> {
	
	private static final Logger logger = LoggerFactory.getLogger(VolsDao.class);

	private static VolsDao dao;

	public VolsDao() {
		super(Vol.class);
	}
	
	public static VolsDao instance() {
		logger.info("instance()");
		if (dao == null) {
			dao = new VolsDao();
		}
		return dao;
	}
	
	public static Vol getFlightByScan(Scanner sc) {
		Vol flight = new Vol();
		System.out.println("Numéro de vol :");
		flight.setNumVol(sc.next());
		System.out.println("Avion (A330, A340, A380, B747)");
		flight.setPlaneType(PlaneType.valueOf(sc.next()));
		System.out.println("Nombre de place dans l'avion");
		flight.setPassengersMax(sc.nextLong());
		System.out.println("Ville de départ :");
		flight.setDepartureCity(sc.next());
		System.out.println("Ville d'arrivée :");
		flight.setArrivalCity(sc.next());
		System.out.println("Date de départ : \nAu format YYYY/MM/dd");
		flight.setDepartureDate(LocalDate.parse((sc.next())));
		
		return flight;
	}
	
	public Vol findByCity(String city) {
		EntityManager em = DatabaseHelper.createEntityManager();
		return em.;
	}
	
}
