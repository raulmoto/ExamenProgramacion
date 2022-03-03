package examenProgramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class palabaras {
	
	public static void palabraMaslarga(String ruta) {
		File f = new File(ruta);
		Scanner scn;
		int contador = 0;
		int numeromayor = 0;
		int numeromenor=0 ;
		try {
			scn = new Scanner (f);
			boolean VF = false;
			while(scn.hasNextLine()) {
				
				String s = scn.nextLine();
				// lo separo por spacios para poder coger cada palabra
				String [] tabla = s.split(" ");
				for(int i = 0; i<tabla.length;i++) {
					
					System.out.println("posicion "+ contador+ tabla[i]);
					int num = tabla[1].length();
					//aqui estoy comprando la longitud de cada palabra
					int longitud= tabla[i].length();
					
					System.out.println("en la posicion "+ i + " la longitud es de " + longitud );
					//comparo la longitud de cada pablabra y miro la maxima y la minima
					
					if (tabla[0].length()==8) {
						numeromayor = num;
						numeromenor= num;
					}else {
						if(num>numeromayor) {
							numeromayor = num;
						}else if (num<numeromayor) {
							numeromenor=num;
						}
					}
					
					
					
				 
				}
				
				System.out.println("el mayor es " + numeromayor);
				System.out.println("el menor es " + numeromenor);
				
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
