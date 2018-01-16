package com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas;


import java.io.Serializable;

/**
 * Web Service Client bean generated for 
 * com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.borrarPelicula.
 */
public class BorrarPelicula extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 8243762902611457024L;
	
	/**
	 * Constructor
	 */
	public BorrarPelicula() {
		super(com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.class,  // port type proxy class
			"borrarPelicula", // method to invoke
			new String[] { "borrarPelicula", } // method parameter names
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

		private static final long serialVersionUID = 3564596531651859456L;
		
		public Parameters() {
		}
	
	  
		private com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.BorrarPeliculaE borrarPelicula  = new  com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.BorrarPeliculaE() ;

		public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.BorrarPeliculaE getBorrarPelicula() {
			return borrarPelicula;
		}

		public void setBorrarPelicula(com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.BorrarPeliculaE borrarPelicula) {
			this.borrarPelicula = borrarPelicula;
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
	public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.BorrarPeliculaResponseE getResult() {
		return (com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.BorrarPeliculaResponseE)result;
	}
	
	
}