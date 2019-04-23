package luo.demo.service;

import java.util.List;
import luo.demo.pojo.*;
public interface UserService {


    public void insertUser(users users);

    public users loginUser(String username, String password);

    public List<users> getallUsers();

    public void updateUser(users users);


}
