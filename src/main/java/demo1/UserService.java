package demo1;

import javax.jws.WebService;

@WebService(endpointInterface = "demo1.UserService", serviceName = "login")
public interface UserService {

    public String login(String name, String password);

}
