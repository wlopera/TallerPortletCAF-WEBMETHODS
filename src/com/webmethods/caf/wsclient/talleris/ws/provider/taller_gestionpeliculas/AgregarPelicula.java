package com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas;


import java.io.Serializable;

/**
 * Web Service Client bean generated for 
 * com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.agregarPelicula.
 */
public class AgregarPelicula extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 5142181568481397760L;
	
	/**
	 * Constructor
	 */
	public AgregarPelicula() {
		super(com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.class,  // port type proxy class
			"agregarPelicula", // method to invoke
			new String[] { "agregarPelicula", } // method parameter names
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

		private static final long serialVersionUID = 2531068405035541504L;
		
		public Parameters() {
		}
	
	  
		private com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.AgregarPeliculaE agregarPelicula  = new  com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.AgregarPeliculaE() ;

		public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.AgregarPeliculaE getAgregarPelicula() {
			return agregarPelicula;
		}

		public void setAgregarPelicula(com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.AgregarPeliculaE agregarPelicula) {
			this.agregarPelicula = agregarPelicula;
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
	public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.AgregarPeliculaResponseE getResult() {
		return (com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.AgregarPeliculaResponseE)result;
	}
	
	
}