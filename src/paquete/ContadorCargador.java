package paquete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class ContadorCargador {
	int repes;
	
	public List<Nombre> obtenerNombres(String ruta){
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		Nombre aux;
		List <Nombre> nom = new ArrayList <Nombre>();
		
		int tam=0;
		
		repes=0; //cantidad de mas repetidos a buscar
		
		try{
			String linea;
			archivo = new File(ruta);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			if ((linea = br.readLine()) != null){
				String [] data = linea.split(" ");
				tam = Integer.parseInt(data[0]);
				repes = Integer.parseInt(data[1]);
			}
						
			int contElem = 0,
					i=0;
			while (contElem < tam && (linea = br.readLine()) != null) {
				if((i=nom.indexOf(linea))<0){
					aux = new Nombre(linea);
					nom.add(aux);
				}
				else
					nom.get(i).sumar();	
				contElem++;
			}
		}
		 catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (fr != null)
						fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
		return nom;
}
	
	/*public List<Nombre> obtenerMaxRepetidos(){
		
	}*/
	
}
