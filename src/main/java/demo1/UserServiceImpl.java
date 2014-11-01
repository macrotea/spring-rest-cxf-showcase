package demo1;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
    }

    public String login(String name, String password) {
        return name + "-" + password;
    }
}