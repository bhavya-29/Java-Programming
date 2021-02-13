import java.io.*;
import java.util.Scanner;
class Book{
    private String book_name;
    private String isbn_number;
    private String author_name;
    private String publisher;
    
    public Book(){}
    public Book(String book_name,String isbn_number,String author_name,String publisher){
        this.book_name=book_name;
        this.isbn_number=isbn_number;
        this.author_name=author_name;
        this.publisher=publisher;
    }
    public void setName(String book_name){
        this.book_name=book_name;
    }
    
    public void setNumber(String isbn_number){
        this.isbn_number=isbn_number;
    }
    
    public void setAuthor(String author_name){
        this.author_name=author_name;
    }
    
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    
    public String getName(){
        return(book_name);
    }
    
    public String getNumber(){
        return(isbn_number);
    }
    
    public String getAuthor(){
        return(author_name);
    }
    
    public String getPublisher(){
        return(publisher);
    }
    
    public String getBookInfo(){
        String book_info = " ";
        String arr[]={book_name,isbn_number,author_name,publisher};
        for(int i=0;i<arr.length;i++){
            book_info=book_info.concat(arr[i]+" | ");
        }
        return(book_info);
    }
}
public class BookTest_Expt4{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Book arr[] = new Book[30];
	int i=0;
	while(i<30){
		arr[i]=new Book();
		System.out.println("enter name of the book : ");
		arr[i].setName(sc.next());
		System.out.println("enter book ISBN number : ");
		arr[i].setNumber(sc.next());
		System.out.println("enter book author's name : ");
		arr[i].setAuthor(sc.next());
		System.out.println("enter book publisher : ");
		arr[i].setPublisher(sc.next());
		//arr[i] = new Book(b_name,b_num,b_author,b_pub);
		System.out.println("wish to add more!(Y/N) : ");
		char ch = sc.next().charAt(0);
		i++;
		if(ch!='Y')
			break;
	}
	System.out.println("Name of the book"+" | "+"ISBN Number"+" | "+"Author Name"+" | "+"Publisher");
	System.out.println("...............................................................................");
	for(int j=0;j<i;j++){
		System.out.println(arr[j].getBookInfo());
	}
                    
     }
}
