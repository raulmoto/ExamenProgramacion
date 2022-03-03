package examenProgramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class videojuegos {
	
	
	public static void informacionVideojuegos(String ruta) {
		File f = new File(ruta);
		try {
			
			
			Scanner scn = new Scanner (f);
			boolean VF = false;
			while(scn.hasNextLine()) {
				
				String c = scn.nextLine();
				if (VF == true) {
					String[] tabla = c.split(",");
					System.out.println("leemos");
					for(int i =0; i<tabla.length;i++) {
						String plataforma = tabla[2];
						System.out.println(plataforma);
						
					}
					
					
				}else {
					VF = true;
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		String ruta = "C://Users//RAUL-CDH//Desktop//ventasVideojuegos.csv";
		informacionVideojuegos(ruta);
		

	}

}
