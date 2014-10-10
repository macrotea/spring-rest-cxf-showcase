package demo1;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserServiceTest{

    @Before
    public void init(){
        UserService userServiceImpl = new UserServiceImpl();
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setAddress("/login");
        factoryBean.setServiceClass(UserService.class);
        factoryBean.setServiceBean(userServiceImpl);
        factoryBean.create();
    }

    @Test
    public void call(){
        JaxWsProxyFactoryBean jwpFactory = new JaxWsProxyFactoryBean();
        jwpFactory.setAddress("http://localhost:8080/StudyCXF/cxftest/Login?wsdl");
        jwpFactory.setServiceClass(UserService.class);

        UserService userService = (UserService) jwpFactory.create();
        String result = userService.login("cxf", "cxf");

        assertEquals(result, "cxf-cxf");
    }

}
