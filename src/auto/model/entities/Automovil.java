package auto.model.entities;

public class Automovil {
private String placa;
private int anio;
private String color;
private String marca;
private boolean alquilado;

public Automovil(String placa, int anio, String color, String marca) {
	super();
	this.placa = placa;
	this.anio = anio;
	this.color = color;
	this.marca = marca;
}


public boolean isAlquilado() {
	return alquilado;
}


public void setAlquilado(boolean alquilado) {
	this.alquilado = alquilado;
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




}
