package uF1.ejercicios.estacionMetereologica_15_10_18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class RegistroLectura {

	
	public static void registro(Object object[]) {
		try (ObjectOutputStream registro = new ObjectOutputStream(new FileOutputStream("C:\\Users\\YEIALEL\\Desktop\\pruebas\\registro.bin"));) {
            for (Object m : object) {
            	registro.writeObject(m);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
		
	}
	
	
	
}
