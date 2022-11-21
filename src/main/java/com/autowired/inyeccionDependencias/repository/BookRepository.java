package com.autowired.inyeccionDependencias.repository;

import com.autowired.inyeccionDependencias.model.Book;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    public List<Book> traerTodos(){
        List<Book> listaBooks = new ArrayList<>();

        listaBooks.add(new Book(1L, "¿Cómo programar en Java?", "Luisina de Paula"));
        listaBooks.add(new Book(2L,"Servidores: ¿Cómo administrarlo?", "Garbiel Guismin"));
        listaBooks.add(new Book(3L,"El hombre que sabia demasiado", "Alan Turin"));
        listaBooks.add(new Book(4L,"Yo robot", "Isaac Asimov"));
        listaBooks.add(new Book(5L,"Ready player one", "Ernest Cline"));
        listaBooks.add(new Book(6L,"Software libre para una sociedad libre", "Richard Stallman"));
        listaBooks.add(new Book(7L,"Microsiervos", "Douglas Coupland"));

        return listaBooks;
    }

}
