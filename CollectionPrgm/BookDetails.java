package CollectionPrgm;

import java.util.ArrayList;

class Book{
	
	int id, quantity;
	String name, author, publisher;
	
	Book(int id,String name,String author,String publisher,int quantity){
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class BookDetails {

	public static void main(String[] args) {

		Book b1 = new Book(1,"Let us C","Yashwant","BPB",10);
		Book b2 = new Book(2,"Data Communication","Forouzon","MCG",5);
		Book b3 = new Book(3,"Operating System","Galvin","Wiley",8);

		ArrayList<Book> boo = new ArrayList<Book>();
		boo.add(b1);
		boo.add(b2);
		boo.add(b3);
		
		for(Book b:boo) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher
					+" "+b.quantity);
		}
		
	}

}
