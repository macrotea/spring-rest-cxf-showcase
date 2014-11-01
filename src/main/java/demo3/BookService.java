package demo3;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/bookService")
public class BookService {

    @POST
    @Path("/get/{id}")
    @Produces("application/json")
    public Book getBookById(@PathParam("id") String id) {

        Book book = new Book();

        book.setId(Integer.parseInt(id));
        book.setName("name" + id);

        return book;
    }


}