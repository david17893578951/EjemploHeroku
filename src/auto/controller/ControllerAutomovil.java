package auto.controller;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import auto.model.entities.Automovil;
import auto.model.manager.ManagerAutomovil;
import auto.view.util.JSFUtil;
@ManagedBean
@SessionScoped

public class ControllerAutomovil {
private String placa;
private int anio;
private String color;
private String marca;
private List<Automovil> lista;
private ManagerAutomovil managerautomovil;



//Se debe crear un metodo de inicializacion personalizado para inicializar propiedades del controlador
//Se debe crear set y get de todo menos al manager
@PostConstruct
public void iniciar (){
	managerautomovil=new ManagerAutomovil();
	lista= managerautomovil.crearLista();
}

public void actionListenerAgregar() {
	try {
		lista=managerautomovil.agregarAutomovil(lista, placa, anio, color, marca);
	} catch (Exception e) {
		//Para recoger el mensaje de error desde el JSFUtil
		JSFUtil.crearMensajeError(e.getMessage());
		e.printStackTrace();
	}
	placa="";
	anio=2016;
	color="";
	marca="";
}

public void actionListenerReset(){
	lista= managerautomovil.crearLista();
}

//SIN PARAMETROS DEBE ESCRIBIR LA PLACA
public void actionListenerAlquilar(){
	try {
		lista=managerautomovil.alquilarAutomovil(lista, placa);
		JSFUtil.crearMensajeInfo("Alquiler realizado");
	} catch (Exception e) {
		JSFUtil.crearMensajeError(e.getMessage());
		e.printStackTrace();
	}
	
}
//Método para alquilar CON PARAMETROS PARA LA PLACA DE PARAMETRO
public void actionListenerAlquilarFila(Automovil automovil){
	try {
		lista=managerautomovil.alquilarAutomovil(lista, automovil.getPlaca());
		JSFUtil.crearMensajeInfo("Alquiler realizado con éxito");
	} catch (Exception e) {
		JSFUtil.crearMensajeError(e.getMessage());
		e.printStackTrace();
	}
}

public String getPlaca() {
	return placa;
}



public void setPlaca(String placa) {
	this.placa = placa;
}



public int getAnio() {
	return anio;
}



public void setAnio(int anio) {
	this.anio = anio;
}



public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



public String getMarca() {
	return marca;
}



public void setMarca(String marca) {
	this.marca = marca;
}



public List<Automovil> getLista() {
	return lista;
}



public void setLista(List<Automovil> lista) {
	this.lista = lista;
}




}

