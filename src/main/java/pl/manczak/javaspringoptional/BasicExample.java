package pl.manczak.javaspringoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BasicExample {

    private List<Book> books;



    public BasicExample() {

        init();


        Optional<Book> book = books.stream().filter(element -> element.getTitle().equals("Książka Spring Boot 2")).findFirst();

        book.ifPresentOrElse(element-> System.out.println(element.getTitle()), ()-> System.out.println("book doesn't exist"));

        Book book1 = book.orElseThrow(() -> new RuntimeException("book doesn't exist"));

        System.out.println(book1);


        if (book.isPresent()){
            System.out.println(book.get());
        }
        else {
            System.out.println("book doesn't exist");
        }

    }



    private void init() {

        books = new ArrayList<>();

        books.add(new Book("Książka Spring Boot 2", "9782123456803"));

        books.add(new Book("Aplikcje internetowe", "9782123456803"));

        books.add(new Book("Java dla zaawansowanych", "9782123456803"));

    }

    public static void main(String[] args) {

        new BasicExample();

    }
}
