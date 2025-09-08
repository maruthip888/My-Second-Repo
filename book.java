package java_oop;

public class book {
private String Name;
private String Author;
private int id;
private String category;


private book(String name,String author, int id,String category ) {
	this.Name=name;
	this.Author=author;
	this.id=id;
	this.category=category;
}
public void getValues() {
	System.out.println("The Name of the book is :"+this.Name);
	System.out.println("The Writer of the book is :"+this.Author);
	System.out.println("The ID of the book is :"+this.id);
	System.out.println("The Name of the book is :"+this.category);
	
}
public static void main(String[] args) {
	book day=new book("kuppali","kuvempu",45,"kannada");
day.getValues();
}
}
