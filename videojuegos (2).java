package examenProgramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class videojuegos {
	
	
	public static void informacionVideojuegos(String ruta) {
		File f = new File(ruta);
		try {
			
			ArrayList <String> arr = new ArrayList<String>();
			Scanner scn = new Scanner (f);
			boolean VF = false;
			while(scn.hasNextLine()) {
				
				String c = scn.nextLine();
				if (VF == true) {
					String[] tabla = c.split(",");
					System.out.println("leemos");
					
					System.out.println(tabla[2]);
					
						
					
					
					//PS,DS,PSV,Wii,N64,PSP,PC,PS3,PS4,GBA,PS2,3DS,Wiiu,NG,XB,X360,DC
					
					
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
