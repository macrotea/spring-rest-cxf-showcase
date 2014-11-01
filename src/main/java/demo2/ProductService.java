package demo2;

import javax.jws.WebService;

@WebService
public interface ProductService {

    public String buy(String name);

}
