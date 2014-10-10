package demo1;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Before;
import org.junit.Test;

import javax.xml.ws.Endpoint;

import static org.junit.Assert.assertEquals;

public class UserServiceTest2 {

    private static final String ADDRESS = "http://localhost:9000/cxfdemo";

    @Before
    public void init(){
        UserService demo = new UserServiceImpl();
        Endpoint.publish(ADDRESS, demo);
    }

    @Test
    public void call(){
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(UserService.class);
        factory.setAddress(ADDRESS);
        UserService userService = (UserService) factory.create();
        String result = userService.login("cxf", "cxf");

        assertEquals(result, "cxf-cxf");
    }

}

