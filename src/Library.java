import java.util.*;

public class Library {
	int id;
	Book[] books;
	int time;
	int librosPorDia;
	
	public Library (Book[] pBooks, int pTime , int pLibros_escaneados){
		this.books = pBooks;
		this.time = pTime;
		this.librosPorDia = pLibros_escaneados;
	}
	 public Book[] getLibrosPosibles(int pTRestante){
		 int t=pTRestante;
		 int nEnviados=0;
		 Book[] l = this.books;
		 Book[] r = new Book[books.length];
		 while (t>0 && nEnviados<(l.length-1)){
			 for (int i=0;i<librosPorDia;i++){
				 if (nEnviados<(l.length-1)){
					 nEnviados++;
					 r[nEnviados+i]=l[nEnviados+i];
				 }
			 }
		 }
		 return r;
	 }
}
