package luo.demo.dao;

import java.util.List;
import luo.demo.pojo.*;
public interface MessageMapper {

    public void sendMessage(message message);

    public void sendAllMessage(message message);

    public void deleteMessage(Integer id);

    public List<message> getallMessage();

    public List<message> getsendermessagebyid(Integer id);

    public List<message> getrecievermessagebyid(Integer id);

}
