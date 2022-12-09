package ejb2.musicrecording.beans;

import javax.ejb.EJBLocalObject;

/** Local Business interface for Publisher Entity.
 * @author Ian Darwin
 */
public interface PublisherLocal extends EJBLocalObject {

	// A Local or Remote interface should list the abstract
	// accessors EXCEPT for the pkey, which isn't changeable

	public abstract Integer getId();

	public abstract String getName();
	public abstract void setName(String val);

	public abstract String getCity();
	public abstract void setCity(String val);

}
