public class Book {
    String title, author, publisher;
    int price;
    String year;

    public Book(String title, String author, String publisher, int price, String year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.year = year;
    }

    public void display() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Year: " + year);
    }
}
