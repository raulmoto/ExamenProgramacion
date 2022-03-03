package examenProgramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class palabaras {
	
	public static void palabraMaslarga(String ruta) {
		File f = new File(ruta);
		Scanner scn;
		int contador = 0;
		String mayor = "mayor";
		try {
			scn = new Scanner (f);
			boolean VF = false;
			while(scn.hasNextLine()) {
				
				String s = scn.nextLine();
				String [] tabla = s.split(" ");
				for(int i = 0; i<tabla.length;i++) {
					contador++;
					System.out.println("posicion "+ contador+ tabla[i]);
					tabla[i].length();
					System.out.println("en la posicion "+ i + " la longitud es de " + tabla[i]);
				 
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		String ruta = "C://Users//RAUL-CDH//Desktop//textoExamen.txt";
		palabraMaslarga(ruta);

	}

}
