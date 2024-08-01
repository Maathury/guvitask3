import java.util.Scanner;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookId, String title, String author, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId()

    {
        return bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle()

    {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    public boolean getAvailable(){
        return isAvailable;
    }
}

 class Library{
     Book[] books;
     int size=0;

    public Library( ){
        this.books=new Book[5];
    }

    public void addBook(Book book){

      if(size<books.length){
          books[size++]=book;
      }
      else{
          System.out.println("Library is full");
      }
    }

    public void removeBook(int bookId){
        for(int i=0;i<size;i++){
            if(books[i].getBookId()==bookId){
                books[i]=books[size-1];
                books[size-1]=null;
                size--;
                System.out.println("Book removed successfully");
                break;
            }
            }
        System.out.println("book id not found");

    }


    public void searchBook(int bookId){
        for(int i=0;i<size;i++){
            if(books[i].getBookId()==bookId){
                System.out.println(books[i]);
            }else {
                System.out.println("Book not found");
            }
        }
    }

    public void displayBook(){
        if(size==0){
            System.out.println("No books available");
        }
        for(int i=0;i<size;i++){
            System.out.println(books[i]);
        }
    }

}

 class BookManagement{
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         Library library=new Library();

         while (true){
             System.out.println("1.Add Book");
             System.out.println("2.Remove Book");
             System.out.println("3.Search Book");
             System.out.println("4.Display Books");
             System.out.println("5.Exit");
             System.out.println("Enter the option : ");

             int choice=scanner.nextInt();
             scanner.nextLine();

             switch(choice){
                 case 1:
                     System.out.println("Enter the Book id : ");
                     int bookId=scanner.nextInt();
                     System.out.println("Enter the Title : ");
                     String title= scanner.next();
                     System.out.println("Enter the Author: ");
                     String author= scanner.next();
                     System.out.println("is available (true/false): ");
                     boolean isAvailable=scanner.nextBoolean();

                     Book book =new Book(bookId,title,author,isAvailable);
                     library.addBook(book);
                     System.out.println("Book added successfully");
                     break;

                 case 2:

                     System.out.println("Enter book id to :");
                     int removeBookId = scanner.nextInt();
                     library.removeBook(removeBookId);
                     break;


                 case 3:


                     System.out.println("Enter the Book id to search : ");
                     int searchId = scanner.nextInt();
                     library.searchBook(searchId);
                     System.out.println("Book found");


                 case 4:
                     library.displayBook();
                     break;


                 case 5:
                     System.out.println("****Exit*****");
                     return;

                 default:
                     System.out.println("Invalid choice Please try again");
                     break;
             }
         }
     }
}


