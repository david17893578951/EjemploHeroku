package auto.model.manager;
import java.util.List;
import java.util.ArrayList;
import auto.model.entities.Automovil;
import javafx.scene.control.TreeTableRow;
public class ManagerAutomovil {
//Método que genere una lista por defecto en memoria
	public List<Automovil> crearLista (){
	List<Automovil> lista=new ArrayList<Automovil>();
	Automovil a=new Automovil("UYHA258", 2012, "BLANCO", "CHEVROLET");
	lista.add(a);
	a= new Automovil("LPI2558", 2011, "BLANCO", "LAMBORGHINI");
	lista.add(a);
	a= new Automovil("PGY258", 2015, "NEGRO", "HINO");
	lista.add(a);
	
	return lista;
	}
//Método para agregar un nuevo automovil a la lista
	
	public List<Automovil> agregarAutomovil(List<Automovil> lista, String placa,int anio, String color, String marca) throws Exception
	{
	//Exepcion mediante el manager
		if (marca==null || marca.length()==0)
			throw new Exception("Debe especificar la marca");
		Automovil a=new Automovil(placa, anio, color, marca);
		if (lista==null)
			lista=new ArrayList<Automovil>();
		lista.add(a);
		return lista;
	}	
	
	public List<Automovil> alquilarAutomovil(List<Automovil> lista, String placa) throws Exception{
		for	(Automovil a: lista){
			if	(a.getPlaca().equals(placa)){
				if	(a.isAlquilado()){
					throw new Exception("Ya esta alquilado");
				}
				a.setAlquilado(true);
				return lista;
			}
		}
		throw new Exception("No existe la placa");
	}
}
