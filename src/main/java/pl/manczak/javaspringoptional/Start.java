package pl.manczak.javaspringoptional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Start {

    private BookRepo bookRepo;

    @Autowired
    public Start(BookRepo bookRepo) {
        this.bookRepo = bookRepo;

        bookRepo.save(new Book("Książka 1", "988888288282"));
        bookRepo.save(new Book("Książka 121", "982828288288282"));
        bookRepo.save(new Book("Książka 1222", "988888288383882"));

    }
}
