package ejb2.musicrecording.beans;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;

/**
 * This interface is the home interface for the Music bean.
 * It has a create method and many finder methods
 */
public interface MusicRemoteHome extends EJBHome {

	public MusicRemote create(String artist_name, String title,
		int cat, double price)
		throws CreateException, RemoteException;
	
	public MusicRemote create(int id, String artist_name, String title,
			int cat, double price)
			throws CreateException, RemoteException;

	/** Find by pkey, required method.
	 */
	public MusicRemote findByPrimaryKey(Integer recordingID)
		throws FinderException, RemoteException;

	/**
	 * Finds all beans, period
	 */
	public Collection<MusicRemote> findAll()
		throws FinderException, RemoteException;

	/**
	 * Finds all Recordings with a given category.
	 */
	public Collection<MusicRemote> findByCategory(int category)
		throws FinderException, RemoteException;

	/**
	 * Finds all Recordings with price greater than price
	 */
	public Collection<MusicRemote> findAllGreaterThan(double price) 
		throws FinderException, RemoteException;

	/**
	 * Finds all Recordings with price less than price
	 */
	public Collection<MusicRemote> findByPriceLessThan(double price) 
		throws FinderException, RemoteException;
}
