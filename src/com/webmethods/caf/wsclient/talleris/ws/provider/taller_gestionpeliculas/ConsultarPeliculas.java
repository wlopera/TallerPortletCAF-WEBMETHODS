package com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas;


import java.io.Serializable;

/**
 * Web Service Client bean generated for 
 * com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.consultarPeliculas.
 */
public class ConsultarPeliculas extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 7521359851975810048L;
	
	/**
	 * Constructor
	 */
	public ConsultarPeliculas() {
		super(com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.class,  // port type proxy class
			"consultarPeliculas", // method to invoke
			new String[] { "consultarPeliculas", } // method parameter names
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

		private static final long serialVersionUID = 8679226085760482304L;
		
		public Parameters() {
		}
	
	  
		private com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ConsultarPeliculasE consultarPeliculas  = new  com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ConsultarPeliculasE() ;

		public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ConsultarPeliculasE getConsultarPeliculas() {
			return consultarPeliculas;
		}

		public void setConsultarPeliculas(com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ConsultarPeliculasE consultarPeliculas) {
			this.consultarPeliculas = consultarPeliculas;
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
	public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ConsultarPeliculasResponseE getResult() {
		return (com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.ConsultarPeliculasResponseE)result;
	}
	
	
}