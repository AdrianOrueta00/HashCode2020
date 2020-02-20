
public class Book {
	//Atributos
	private int score;
	private int id;
	//Constructora
	public Book(int pId){
		this.id=pId;

	}
	//Otros metodos
	public void setScore(int pScore){
		this.score=pScore;
	}
	
	public int getScore(){
		return this.score;
	}
}
