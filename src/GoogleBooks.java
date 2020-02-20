import java.util.*;

public class GoogleBooks {
	int MaxDias;
	HashSet<Book> librosPorExaminar;
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
}
