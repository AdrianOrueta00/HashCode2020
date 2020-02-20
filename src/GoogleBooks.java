import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class GoogleBooks {
	int MaxDias;
	HashSet <Book>librosPorExaminar;
	HashSet<Library> librerias;
	private static GoogleBooks miGoogleBooks;
	
	private GoogleBooks () {
		
	}
	public void addBook (Book pLibro){
		if(librosPorExaminar.contains(pLibro)){
		}
		else{librosPorExaminar.add(pLibro);
		}
		
	}
	public static GoogleBooks getMiGoogleBooks(){
		if (miGoogleBooks == null){
			miGoogleBooks = new GoogleBooks();
		}
		return miGoogleBooks;
	}
	public void setMaxDias(int pMaxDias){
		this.MaxDias=pMaxDias;
	}
	public void addLibrerias(Library pLibreria){
		if(librerias.contains(pLibreria)){
		}
		else{librerias.add(pLibreria);
		}
	}
	public void DevolverDatos(Queue<Library> pCola) {
		int dias= this.MaxDias;	
		this.NumeroLibrerias(pCola.size());
		
		Library li=pCola.remove();
		
		while (!pCola.isEmpty()&& dias>=0) {
			
			int resta=li.time;
			dias=dias-resta;
			Book[] hLI=li.getLibrosPosibles(dias);
			this.IdLibrosYNLibros(li.id, hLI.length);
			li=pCola.remove();
		}
	}
	
	private void NumeroLibrerias(int nLibreria) {
		FileWriter fichero = null;
		PrintWriter pw = null;
	try
		{
	    	fichero = new FileWriter("Escritura.txt");
	    	pw = new PrintWriter(fichero);

	    		pw.println(" " + nLibreria);
	    	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
	try {
	   
	   if (null != fichero)
	      fichero.close();
	   } catch (Exception e2) {
	      e2.printStackTrace();
	   }
	}
	}
	private void IdLibrosYNLibros(int pIdLibreria, int pNLibros) {
		
	}
	private void imprimirLibros(Book[] pLibros){
		FileWriter fichero = null;
		PrintWriter pw = null;
	try
		{
	    	fichero = new FileWriter("Escritura.txt");
	    	pw = new PrintWriter(fichero);
	    	
	    	for (int i=0;i<pLibros.length;i++){
	    		pw.println(" " + pLibros[i].getId());
	    	}
	    	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
	try {
	   
	   if (null != fichero)
	      fichero.close();
	   } catch (Exception e2) {
	      e2.printStackTrace();
	   }
	}
	}
}
