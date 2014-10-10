package demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class ProductServiceTest {

    @Test
    public void call(){
        //确保启动了tomcat服务器,且 http://localhost:8080/ws/ProductService 能访问
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:app-demo2-test.xml"});

        ProductService productServiceClient = (ProductService) context.getBean("productServiceClient");
        String result = productServiceClient.buy("tea");

        assertEquals(result, "buy:tea");
    }

}
