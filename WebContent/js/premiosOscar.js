/**
 * mostrarTextInputAgregarPelicula: Muestra valores en la consola del Navegador - USO JS-CAF
 */
function mostrarTextInputAgregarPelicula(){	
	var nombreID = '#{activePageBean.clientIds["nombreModal"]}'; 	// ID del cliente
	console.log("nombreID %o", nombreID);  
	
	var nombreElement = CAF.model(nombreID);			// Control primario HTML (elemento)
	console.log("nombreElement %o", nombreElement);
	
	var nombreID_1 = nombreElement.id; 					// ID del cliente
	console.log("nombreID_1 %o", nombreID_1);
	
	var nombreHTML = $(nombreID);						// Elemento HTML (Object HTML) - [object HTMLInputElement]
	console.log("nombreHTML: "+ nombreHTML);
	console.log("nombreHTMLInputElement: %o", nombreHTML);	
	
	var nombreId2 = "#{caf:cid('defaultForm:nombreModal')}";
	console.log("nombreId2: %o", nombreId2);
}


/**
 * validarEspaciovacio: Prueba para validar espacios en blanco en un texto - Uso de Validator
 * 
 * @param inputId
 */
function validarEspacioVacio(inputId) 
{	  
	 CAF.model(inputId).addValidator(function(id,value) {		
		return (/\s/.test(value) ? "No puede contener espacios en blanco." : "");
	});		
}


/**
 * validarData: Validar que los datos de la pelicula a generar esten completos y validos
 */
function validarData() {
	var idModal = CAF.model('#{activePageBean.clientIds["idModal"]}');		
	var annioModal = CAF.model('#{activePageBean.clientIds["annioModal"]}');
	var edicionModal = CAF.model('#{activePageBean.clientIds["edicionModal"]}');
	var nombreModal = CAF.model('#{activePageBean.clientIds["nombreModal"]}');
	var premiosModal = CAF.model('#{activePageBean.clientIds["premiosModal"]}');
	var nominacionesModal = CAF.model('#{activePageBean.clientIds["nominacionesModal"]}');
	var generoModal = CAF.model('#{activePageBean.clientIds["generoModal"]}');
	
	// Validar campos vacios 
	if (idModal.getValue() == '')
	{
		showDialog(idModal.id, "ERROR", "Debe agregar un identificador", "OK", "error");
		return false;
	} else if (!isValorNumerico(idModal.id)) {
			showDialog(idModal.id, "WARNING", "Debe ingresar solo valores num&eacute;ricos", "OK", "alerta");
			return false;
	} else if (annioModal.getValue() =='') {
		showDialog(annioModal.id, "ERROR", "Debe agregar el a&ntilde;io de entrega de los premios", "OK", "error");
		return false;
	} else if (!isValorNumerico(annioModal.id)) {
		showDialog(annioModal.id, "INFO", "Debe ingresar solo valores num&eacute;ricos", "OK", "info"); // info como prueba
		return false;
	}else if (edicionModal.getValue() == '') {
		showDialog(edicionModal.id, "ERROR", "Debe agregar el n&uacute;mero de edici&oacute;n de los Premios Oscar", "OK", "error");		
		return false;
	} else if (nombreModal.getValue() == '') {
		showDialog(nombreModal.id, "ERROR", "Debe agregar el nobre de la pel&iacute;cula", "OK", "error");		
		return false;
	} else if (premiosModal.getValue() == '') {
		showDialog(premiosModal.id, "ERROR", "Debe agregar la cantidad de premios recibidos", "OK", "error");
		return false;
	} else if (!isValorNumerico(premiosModal.id)) {
		showDialog(premiosModal.id, "EXITO", "Debe ingresar solo valores num&eacute;ricos", "OK", "exito");	//exito como prueba
		return false;
	} else if (nominacionesModal.getValue() == '') {
		showDialog(nominacionesModal.id, "ERROR", "Debe agregar la cantidad de nominaciones", "OK", "error");
		return false;
	} else if (!isValorNumerico(nominacionesModal.id)) {
		showDialog(nominacionesModal.id, "WARNING", "Debe ingresar solo valores num&eacute;ricos", "OK", "alerta");
		return false;
	} else if (generoModal.getValue() == '') {
		showDialog(generoModal.id, "ERROR", "Debe agregar el g&eacute;nero de la pel&iacute;cula", "OK", "error");
		return false;
	} else {
		console.log("idModal:" + idModal);
		console.log("annioModal:" + annioModal);
		console.log("edicionModal:" + edicionModal);
		console.log("nombreModal:" + nombreModal);
		console.log("premiosModal:" + premiosModal);
		console.log("nominacionesModal:" + nominacionesModal);
		console.log("generoModal:" + generoModal);
		CAF.model('#{activePageBean.clientIds["modalDialog"]}').hide();	 // Cerrar la ventana modal
		
		return true;
	}
}


/**
 * showDialog: Ventana Modal de informacion al cliente
 * 
 * @param id: Identificador al cual se esta evaluando
 * @param title: Titulo de la ventana
 * @param message:  Mensaje al usuario
 * @param nameButton: Nombre del boton
 * @param clase: Tipo de estilo a asociar a la vista (info, alerta, exito, error)
 */
function showDialog(id, title, message, nameButton, clase) {	
	CAF.Dialog.show({
		title : '<h3>' +  title + '</h3>',
		"styleClass" : clase,
		content : "<br>" + message + "<br>",
		buttons : {
			OK : {
				label : nameButton,
				"class" : "boton",
				fn : function(form) {
					CAF.model(id).setFocused(true);
					showViev = false;
				},
			},
		}
	});
}

/**
 * isValorNumerico: Evalua si un campo es solo numerico
 * 
 * @param idData: Identificador al cual se esta evaluando
 */
function isValorNumerico(idData) {
	try {
		var numero = CAF.model(idData);
		var permitidos = /[^0-9,]/;
		return (!permitidos.test(numero));	
	} catch (err) {
		CAF.Dialog.alert(err.message);
	}
}

/**
 * agregarPeliculaData: Vaciar la vista modal y abrirla
 */
function agregarPeliculaData(iModificarIcon){	
	// Limpiar los campos de la ventana modal
	CAF.model('#{activePageBean.clientIds["idModal"]}').setValue("");
	CAF.model('#{activePageBean.clientIds["annioModal"]}').setValue("");
	CAF.model('#{activePageBean.clientIds["edicionModal"]}').setValue("");
	CAF.model('#{activePageBean.clientIds["nombreModal"]}').setValue("");
	CAF.model('#{activePageBean.clientIds["premiosModal"]}').setValue("");
	CAF.model('#{activePageBean.clientIds["nominacionesModal"]}').setValue("");
	CAF.model('#{activePageBean.clientIds["generoModal"]}').setValue("");
	
	CAF.model('#{activePageBean.clientIds["idMensajeModal"]}').setValue("AGREGAR PELÍCULA");
	
	// Pasar el tipo de procesamiento - Agregar
	CAF.model('#{activePageBean.clientIds["idProcesamiento"]}').setValue("AGREGAR");
	
	// Desabilitar la opcion readonly del campo idModal - se debe agregar el ID.
	var idModal = CAF.model('#{activePageBean.clientIds["idModal"]}');
	document.getElementById(idModal.id).readOnly = false;
	
	CAF.model('#{activePageBean.clientIds["modalDialog"]}').show();
}