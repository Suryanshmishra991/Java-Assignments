import java.util.*;

class Author {
    private String name;
    private String email;
    private String gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }
}

class Book {
    private String title;
    private double price;
    private Author author;

    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String toString() {
        return "Book: " + title +
               "\nPrice: " + price +
               "\nAuthor: " + author.getName() +
               " (" + author.getGender() + ")" +
               ", Email: " + author.getEmail();
    }
}

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] data = sc.nextLine().split(",");

        Author author = new Author(
            data[2],
            data[3],
            data[4]
        );

        Book book = new Book(
            data[0],
            Double.parseDouble(data[1]),
            author
        );

        System.out.println(book);

        sc.close();
    }
}