package LibraryManagementSystem;
 //Abstract class demonstrating Abstraction.
 abstract class Book{
	private String title;
	private String author;
	private int yearofpublication;
	Book(String title, String author,int yearofpublication) {
	    this.title=title;
	    this.author=author;
	    this.yearofpublication=yearofpublication;
    }
	
	//Private variables and getters/setters demonstrate Encapsulation.
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearofpublication() {
		return yearofpublication;
	}

	public void setYearofpublication(int yearofpublication) {
		this.yearofpublication = yearofpublication;
	}

	public abstract void displayDetails();
	public abstract void borrowBook();
	public abstract void returnBook();
	
 }
 //Interface defining borrowing and returning operations.
 interface libraryoperations{
	 void borrowBook();
	 void returnBook();
 }
 //TextBook inherits Book and implements LibraryOperations.
 class TextBook extends Book implements libraryoperations{
	String subject;
	//Constructor to initialize book details.
	TextBook(String title, String author, int yearofpublication, String subject) {
		super(title, author, yearofpublication);
		this.subject=subject;
	}
    // Overriding the parent class method to display book details
	@Override
	public void displayDetails() {
		System.out.println("Book title: "+getTitle());
		System.out.println("Author: "+getAuthor());
		System.out.println("Year: "+getYearofpublication());
		System.out.println("Subject: "+subject);
	} 
	@Override
	public void borrowBook() {
		System.out.println("This textbook can be borrowed for 15 days");
	}
	@Override
	public void returnBook() {
		System.out.println("Returned textbook");
	}
 }
 //Magazine inherits Book and implements LibraryOperations.
 class Magazine extends Book implements libraryoperations{
	int issuenumber;
	//Constructor to initialize book details.
    Magazine(String title, String author, int yearofpublication, int issuenumber) {
		super(title, author, yearofpublication);
		this.issuenumber=issuenumber;
	}
    // Overriding the parent class method to display book details.
    @Override
    public void displayDetails() {
    	System.out.println("Book title: "+getTitle());
		System.out.println("Author: "+getAuthor());
		System.out.println("Year: "+getYearofpublication());
		System.out.println("Issue NUmber: "+issuenumber);
    }
    @Override
    public void borrowBook() {
		System.out.println("This magazine can be borrowed for 7 days");
	}
    @Override
	public void returnBook() {
		System.out.println("Returned magazine");
	}
 }
 //Novel inherits Book and implements LibraryOperations.
 class Novel extends Book implements libraryoperations{
    String genre;
    //Constructor to initialize book details.
	Novel(String title, String author, int yearofpublication, String genre) {
		super(title, author, yearofpublication);
		this.genre=genre;
	}
    // Overriding the parent class method to display book details
	@Override
	public void displayDetails() {
		System.out.println("Book title: "+getTitle());
		System.out.println("Author: "+getAuthor());
		System.out.println("Year: "+getYearofpublication());
		System.out.println("Genre: "+genre);
	}
	@Override
	public void borrowBook() {
		System.out.println("This novel can be borrowed for 10 days");
	}
	@Override
	public void returnBook() {
		System.out.println("Returned novel");
	}
 }

public class librarymanagement {
	
	public static void main(String[] args) {
		// Array of parent-class references storing different subclass objects.
		Book[]books=new Book[3];
		books[0]=new TextBook("Java Programming", "James Gosling", 1995, "Computer Science");
		books[1]=new Magazine("Reader's Digest", "DeWitt Wallace",1922, 12);
		books[2]=new Novel("Pride and Prejudice", "Jane Austen", 1813, "Classic");
		// Demonstrating runtime polymorphism and library operations.
		for(int i=0;i<books.length;i++) {
			books[i].displayDetails();
			books[i].borrowBook();
			books[i].returnBook();
			System.out.println("----------------------");
		}
		
//		Book b1=new TextBook("Java Programming", "James Gosling", 1995, "Computer Science");
//		Book b2=new Magazine("Reader's Digest", "DeWitt Wallace",1922, 12);
//		Book b3=new Novel("Pride and Prejudice", "Jane Austen", 1813, "Classic");
//		b1.displayDetails();
//		b1.borrowBook();
//		b1.returnBook();
//		System.out.println("----------------------");
//		b2.displayDetails();
//		b2.borrowBook();
//		b2.returnBook();
//		System.out.println("----------------------");
//		b3.displayDetails();
//		b3.borrowBook();
//		b3.returnBook();
	}

}


