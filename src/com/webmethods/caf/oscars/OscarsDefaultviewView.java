/**
 * 
 */
package com.webmethods.caf.oscars;

import org.apache.log4j.Logger;

import com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub.Pelicula;

/**
 * @author wlopera
 *
 */

public class OscarsDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private transient com.webmethods.caf.oscars.Oscars oscars = null;
	private transient com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.AgregarPelicula agregarPelicula = null;
	private static final String[][] AGREGARPELICULA_PROPERTY_BINDINGS = new String[][] {
		{"#{AgregarPelicula.authCredentials.authenticationMethod}", "1"},
		{"#{AgregarPelicula.authCredentials.requiresAuth}", "true"},
	};
	private transient com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.ConsultarPeliculas consultarPeliculas = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider peliculasProvider = null;
	private static final String[][] PELICULASPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{PeliculasProvider.rowType}", "com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.TallerISWsProviderTALLER_GestionPeliculasStub$Pelicula"},
		{"#{PeliculasProvider.rowVariable}", "pelicula"},
		{"#{PeliculasProvider.array}", "#{OscarsDefaultviewView.consultarPeliculas.result.consultarPeliculasResponse.peliculas}"},
	};
	private static final String[][] CONSULTARPELICULAS_PROPERTY_BINDINGS = new String[][] {
		{"#{consultarPeliculas.authCredentials.authenticationMethod}", "1"},
		{"#{consultarPeliculas.authCredentials.requiresAuth}", "true"},
		{"#{consultarPeliculas.autoRefresh}", "true"},
	};
	private Logger logger = Logger.getLogger("premiosOscarLogger");
	private transient com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.ModificarPelicula modificarPelicula = null;
	private static final String[][] MODIFICARPELICULA_PROPERTY_BINDINGS = new String[][] {
		{"#{ModificarPelicula.authCredentials.authenticationMethod}", "1"},
		{"#{ModificarPelicula.authCredentials.requiresAuth}", "true"},
	};
	private java.lang.String procesamiento;
	private transient com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.BorrarPelicula borrarPelicula = null;
	private static final String[][] BORRARPELICULA_PROPERTY_BINDINGS = new String[][] {
		{"#{BorrarPelicula.authCredentials.authenticationMethod}", "1"},
		{"#{BorrarPelicula.authCredentials.requiresAuth}", "true"},
	};
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);

			return OUTCOME_OK;
		} catch (Exception e) {
			error(e);
//			log(e);
			logger.error("Error: "+ e.getMessage());
			return OUTCOME_ERROR; 
		}	
	}

	public com.webmethods.caf.oscars.Oscars getOscars()  {
		if (oscars == null) {
		    oscars = (com.webmethods.caf.oscars.Oscars)resolveExpression("#{Oscars}");
		}
		return oscars;
	}

	public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.AgregarPelicula getAgregarPelicula()  {
		if (agregarPelicula == null) {
		    agregarPelicula = (com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.AgregarPelicula)resolveExpression("#{AgregarPelicula}");
		}
	
	    resolveDataBinding(AGREGARPELICULA_PROPERTY_BINDINGS, agregarPelicula, "agregarPelicula", false, false);
		return agregarPelicula;
	}

	public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.ConsultarPeliculas getConsultarPeliculas()  {
		if (consultarPeliculas == null) {
		    consultarPeliculas = (com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.ConsultarPeliculas)resolveExpression("#{ConsultarPeliculas}");
		}
	
	    resolveDataBinding(CONSULTARPELICULAS_PROPERTY_BINDINGS, consultarPeliculas, "consultarPeliculas", false, false);
		return consultarPeliculas;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getPeliculasProvider()  {
		if (peliculasProvider == null) {
		    peliculasProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{PeliculasProvider}");
		}
	
	    resolveDataBinding(PELICULASPROVIDER_PROPERTY_BINDINGS, peliculasProvider, "peliculasProvider", false, false);
		return peliculasProvider;
	}

	public String procesarPeliculaAction() {	
		// Enviar los datos de la pelicula ingresado al archivo log del MWS Cambiar erro(String) => log(String) 
		Pelicula pelicula = getAgregarPelicula().getParameters().getAgregarPelicula().getAgregarPelicula().getPelicula();
//		log("Pelicula id: "+ pelicula.getId());
//		log("Pelicula Año: "+ pelicula.getAnnio());
//		log("Pelicula Edicion: "+ pelicula.getEdicion());
//		log("Pelicula Nomnbre: "+ pelicula.getNombre());
//		log("Pelicula Premios: "+ pelicula.getPremios());
		
//		log("Pelicula Nominaciones: "+ pelicula.getNominaciones());
//		log("Pelicula Genero: "+ pelicula.getGenero()); 
		String resultado = "0";
		if (getProcesamiento().equals("AGREGAR")) {
			// Llamar al metodo que ejecuta la operacion - crear pelicula en BDD
			//getAgregarPelicula().getParameters().getAgregarPelicula().getAgregarPelicula().setPelicula(pelicula); ===> No hace falta es el mismo objeto
			getAgregarPelicula().refresh();
			resultado = getAgregarPelicula().getResult().getAgregarPeliculaResponse().getResultado();
		} else {
			// Llamar al metodo que ejecuta la operacion - modificar pelicula en BDD
			getModificarPelicula().getParameters().getModificarPelicula().getModificarPelicula().setPelicula(pelicula);  // ==> Debo pasar el objeto a modificar
			getModificarPelicula().refresh();
			resultado = getModificarPelicula().getResult().getModificarPeliculaResponse().getResultado();
			getConsultarPeliculas().refresh();
		}
			
		// Llamar al metodo que ejecuta la operacion - consultar pelicula en BDD para actualizar la Tabla de Datos
		getConsultarPeliculas().refresh();
		if (!resultado.equals("0")){
			logger.info("-----------------------------------------------------------");
			if (getProcesamiento().equals("AGREGAR"))
				logger.info("PELICULA AGREGADA");
			else
				logger.info("PELICULA MODIFICADA");
			logger.info("-----------------------------------------------------------");
			logger.info("Pelicula id: "+ pelicula.getId());
			logger.info("Pelicula Año: "+ pelicula.getAnnio());
			logger.info("Pelicula Edicion: "+ pelicula.getEdicion());
			logger.info("Pelicula Nomnbre: "+ pelicula.getNombre());
			logger.info("Pelicula Premios: "+ pelicula.getPremios());
			logger.info("Pelicula Nominaciones: "+ pelicula.getNominaciones());
			logger.info("Pelicula Genero: "+ pelicula.getGenero()); 
			logger.info("-----------------------------------------------------------");
		} else {
			logger.info("-----------------------------------------------------------");
			if (getProcesamiento().equals("AGREGAR"))
				logger.info("NO SE PUDO AGREGAR LA PELICUlA");
			else
				logger.info("NO SE PUDO MODIFICAR LA PELICUlA");

			logger.info("-----------------------------------------------------------");
			logger.info("Pelicula id: "+ pelicula.getId());
			logger.info("Pelicula Año: "+ pelicula.getAnnio());
			logger.info("Pelicula Edicion: "+ pelicula.getEdicion());
			logger.info("Pelicula Nomnbre: "+ pelicula.getNombre());
			logger.info("Pelicula Premios: "+ pelicula.getPremios());
			logger.info("Pelicula Nominaciones: "+ pelicula.getNominaciones());
			logger.info("Pelicula Genero: "+ pelicula.getGenero()); 
			logger.info("-----------------------------------------------------------");
		}
		return OUTCOME_OK;
	}

	public String borrarPeliculaAction() {
		// Identificador de la tabla pasado en la llamada al action
		String idTabla =(String)getRequestParam().get("idTabla");
	   
		// Mapea el valor del idTabla a borrar en la operación como parametro de entrada
		// El adaptador de borrar es el tipo DinamicSQL, espera un valor en la variable  ${where}
		// [DELETE  FROM TallerCaf.dbo.Pelicula  WHERE ${where}]
		String where = "id = " + idTabla;
		getBorrarPelicula().getParameters().getBorrarPelicula().getBorrarPelicula().setWhere(where);
		
		// Enviar a borrar la pelicula en BDD - Referesh()
		getBorrarPelicula().refresh();
		
		// Registrar el procesamiento en archivo log
//		log("borrarPeliculaAction: Se borro el registro idTabla: " + idTabla + " en BDD");
		logger.info("borrarPeliculaAction: Se borro el registro idTabla: " + idTabla + " en BDD");
		
		// Llamar al metodo que ejecuta la operacion - consultar pelicula en BDD para actualizar la Tabla de Datos
		getConsultarPeliculas().refresh();				
		
		return OUTCOME_OK;
	}

	public String cargarDatosModalAction() {
		// Identificador de la tabla pasado en la llamada al action
		String idTabla =(String)getRequestParam().get("idTabla");
			
		// Recorrer la lista de peliculas y seleccionar la requerida para modificar	
		Pelicula[] peliculas = getConsultarPeliculas().getResult().getConsultarPeliculasResponse().getPeliculas();
		Pelicula peliculaTabla = null; 
		for (Pelicula pelicula: peliculas){
			if (pelicula.getId().equals(idTabla))
			{
				peliculaTabla = pelicula;
				break;
			}
		}
		
		if (peliculaTabla != null)
		{
			getAgregarPelicula().getParameters().getAgregarPelicula().getAgregarPelicula().setPelicula(peliculaTabla);
		} else {
			getAgregarPelicula().getParameters().getAgregarPelicula().getAgregarPelicula().setPelicula(new Pelicula());
		}		
		
		// Cambiar el nombre de la vista modal
		getIdMensajeModal().setValue("MODIFICAR PELÍCULA");
		
		// Colocar readonly al campo idModal - no se puede modificar el ID
		getIdModal().setReadonly(true);
		
		return OUTCOME_OK;
	}

	public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.ModificarPelicula getModificarPelicula()  {
		if (modificarPelicula == null) {
		    modificarPelicula = (com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.ModificarPelicula)resolveExpression("#{ModificarPelicula}");
		}
	
	    resolveDataBinding(MODIFICARPELICULA_PROPERTY_BINDINGS, modificarPelicula, "modificarPelicula", false, false);
		return modificarPelicula;
	}

	/**
	 * Getter method for the control with id='defaultForm:idMensajeModal'
	 */
	public com.webmethods.caf.faces.component.standard.HtmlOutputText getIdMensajeModal()  {
		return (com.webmethods.caf.faces.component.standard.HtmlOutputText)findComponentInRoot("defaultForm:idMensajeModal");
	}

	public java.lang.String getProcesamiento()  {
		
		return procesamiento;
	}

	public void setProcesamiento(java.lang.String procesamiento)  {
		this.procesamiento = procesamiento;
	}

	/**
	 * Getter method for the control with id='defaultForm:idModal'
	 */
	public com.webmethods.caf.faces.component.standard.HtmlInputText getIdModal()  {
		return (com.webmethods.caf.faces.component.standard.HtmlInputText)findComponentInRoot("defaultForm:idModal");
	}

	public com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.BorrarPelicula getBorrarPelicula()  {
		if (borrarPelicula == null) {
		    borrarPelicula = (com.webmethods.caf.wsclient.talleris.ws.provider.taller_gestionpeliculas.BorrarPelicula)resolveExpression("#{BorrarPelicula}");
		}
	
	    resolveDataBinding(BORRARPELICULA_PROPERTY_BINDINGS, borrarPelicula, "borrarPelicula", false, false);
		return borrarPelicula;
	}
	
}