/**
 * 
 */
package com.webmethods.caf.oscars;

/**
 * @author wlopera
 *
 */

import javax.portlet.PortletPreferences;

public class Oscars  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private transient com.webmethods.caf.PremiosOscar premiosOscar = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Oscars() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public com.webmethods.caf.PremiosOscar getPremiosOscar()  {
		if (premiosOscar == null) {
		    premiosOscar = (com.webmethods.caf.PremiosOscar)resolveExpression("#{PremiosOscar}");
		}
		return premiosOscar;
	}
}