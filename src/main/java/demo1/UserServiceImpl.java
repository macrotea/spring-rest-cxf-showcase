package demo1;

import javax.jws.WebService;

@WebService(endpointInterface = "demo1.UserService", serviceName = "login")
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
    }

    public String login(String name, String password) {
        return name + "-" + password;
    }
}