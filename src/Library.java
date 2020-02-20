import java.util.*;

public class Library {
	HashSet<String> books;
	int time;
	int libros_escaneados;
	
	public Library (HashSet<String> pBooks, int pTime , int pLibros_escaneados){
		this.books = pBooks;
		this.time = pTime;
		this.libros_escaneados = pLibros_escaneados;
	}
	
}
