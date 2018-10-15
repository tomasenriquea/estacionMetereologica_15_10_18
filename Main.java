package uF1.ejercicios.estacionMetereologica_15_10_18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import muestras._02._1Mascota;

public class Main {

	public static void main(String[] args) {

		
		/*
		// Ejemplo de como se esta pasando los argumentos
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		Meteo[] clima = new Meteo[3];
		
		clima[0] = new Meteo("01/01/1980", 30.5, 50.5, 10);  //maxima temperatura alta
		clima[1] = new Meteo("01/06/2000", 23.4, 90.5, 20);  //maxima huedad
		clima[2] = new Meteo("12/12/2018", 23.4, 50.5, 50);  //maxima precipitacion
        
        RegistroLectura.registro(clima);
        
        //lee los datos
        
        

	}

}
