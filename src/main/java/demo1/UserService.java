package demo1;

import javax.jws.WebService;

/**
 * @author macrotea@qq.com
 * @since 2014-10-10 下午4:36
 */
@WebService
public interface UserService {

    public String login(String name, String password);

}
