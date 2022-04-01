package list1;

public class Book {
    
    //metadata
    String title = ("How to not code");
    String author = ("Me, i guess");
    String publisher = ("Some library that i don't remeber the name");
    int totalPages = 190;
    int version = 1;

    public Book(){
    }
    
    public Book(String title, String author, String publisher, int totalPages, int version) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.totalPages = totalPages;
        this.version = version;
    }

    public String toString() {
        return "author: " 
        + author
        + "\npublisher: "
        + publisher
        + "\ntitle: "
        + title
        + "\ntotalPages: "
        + totalPages
        + "\nversion: "
        + version;
    }
    
    
}
