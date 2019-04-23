package luo.demo.dao;

import java.util.List;
import luo.demo.pojo.*;
public interface UserMapper {
    /**
     * 登陆是检测用户
     * @param username
     * @param password
     * @return 用户
     */
    public List<users> checkUser(String username, String password);

    /**
     * 注册用户
     * @param users
     *
     */
    public void insertUser(users users);


    /**
     * 更新用户
     * @param users
     */
    public void updateUser(users users);

    public List<users> getallUser();

    public List<users> getusernmae(String username);

}
