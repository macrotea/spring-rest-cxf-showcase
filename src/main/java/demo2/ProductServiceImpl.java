package demo2;

public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl() {
    }

    public String buy(String name) {
        return "buy:" + name;
    }
}