import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class GoogleBooks {
	int MaxDias;
	HashSet <Book>librosPorExaminar;
	Library[] librerias;
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
	private void DevolverDatos(Queue<Library> pCola) {
		int Dias= this.MaxDias;
		Library li=pCola.remove();
		while (!pCola.isEmpty()&& Dias>=0) {
			
			int resta=li.time;
			Dias=Dias-resta;
			Book[] hLI=li.getLibrosPosibles(MaxDias);
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
	private void IdLibrosYNLibros() {
		
	}
	public void crearLibreria (int nLibrosEscaneados, Book[] libros, int time){
			new Library(libros ,nLibrosEscaneados ,time);
			}
	
}
