package com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas;


import java.io.Serializable;

/**
 * Web Service Client bean generated for 
 * com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.modificarPelicula.
 */
public class ModificarPelicula extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 5862559469140920320L;
	
	/**
	 * Constructor
	 */
	public ModificarPelicula() {
		super(com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.class,  // port type proxy class
			"modificarPelicula", // method to invoke
			new String[] { "modificarPelicula", } // method parameter names
		);
		
		// init wsclient
		initParams();
		
		
		// parameters bean
		parameters = new Parameters();
			
		// initial result
		result = null;
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters implements Serializable {

		private static final long serialVersionUID = 7182466175697977344L;
		
		public Parameters() {
		}
	
	  
		private com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ModificarPeliculaE modificarPelicula  = new  com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ModificarPeliculaE() ;

		public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ModificarPeliculaE getModificarPelicula() {
			return modificarPelicula;
		}

		public void setModificarPelicula(com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ModificarPeliculaE modificarPelicula) {
			this.modificarPelicula = modificarPelicula;
		}
		
	}
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	
	/**
	 * Return method invocation result bean
	 */
	public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ModificarPeliculaResponseE getResult() {
		return (com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ModificarPeliculaResponseE)result;
	}
	
	
}