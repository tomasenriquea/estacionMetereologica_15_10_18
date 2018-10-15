package uF1.ejercicios.estacionMetereologica_15_10_18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Meteo implements Serializable{
	
	private String fecha;
	private double temperatura, humedad;
	private int precipitacion;
	
	
	
	//CONSTRUCTOR
	public Meteo(String fecha, double temperatura, double humedad, int precipitacion) {
		this.fecha = fecha;
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.precipitacion = precipitacion;
	}



	//GETTERS
	public String getFecha() {
		return fecha;
	}



	public double getTemperatura() {
		return temperatura;
	}



	public double getHumedad() {
		return humedad;
	}



	public int getPrecipitacion() {
		return precipitacion;
	}



	//SETTERS
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}



	public void setHumedad(double humedad) {
		this.humedad = humedad;
	}



	public void setPrecipitacion(int precipitacion) {
		this.precipitacion = precipitacion;
	}
	
	
	
	//METODOS
	
	public void registrar() {
		
		//ObjectOutputStream registro = new ObjectOutputStream(new FileOutputStream(PATH_DATOS));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
