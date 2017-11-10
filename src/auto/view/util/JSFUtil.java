package auto.view.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class JSFUtil {
	//Funcion solo para cadenas
 public static boolean isNull (String cadena){
	 if (cadena==null || cadena.length()==0)
		 return true;
	 return false;
 }
 //MENSAJE DE ERROR DE INFORMACION
 
 public static void crearMensajeInfo(String mensaje){
	 //Tecnología  de JSF para crear mensajes personalizados y es solo para la vista
	 FacesMessage msg= new FacesMessage();
	 //Para crear un mensaje informativo
	 msg.setSeverity(FacesMessage.SEVERITY_INFO);
	 msg.setSummary(mensaje);
	 FacesContext.getCurrentInstance().addMessage(null, msg);
 }
 //MENSAJE  DE WARNING
 public static void crearMensajeWarning(String mensaje){
	 //Tecnología  de JSF para crear mensajes personalizados y es solo para la vista
	 FacesMessage msg= new FacesMessage();
	 	 msg.setSeverity(FacesMessage.SEVERITY_WARN);
	 msg.setSummary(mensaje);
	 FacesContext.getCurrentInstance().addMessage(null, msg);
 }
 
 //MENSAJE DE ERROR
 
 public static void crearMensajeError(String mensaje){
	 //Tecnología  de JSF para crear mensajes personalizados y es solo para la vista
	 FacesMessage msg= new FacesMessage();
	 msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	 msg.setSummary(mensaje);
	 FacesContext.getCurrentInstance().addMessage(null, msg);
 }
 
}
