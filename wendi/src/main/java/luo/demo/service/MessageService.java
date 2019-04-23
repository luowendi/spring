package luo.demo.service;

import java.util.List;
import luo.demo.pojo.*;
public interface MessageService {


    public void sendMessage(message message);


    public void deleteMessage(int id);

    public List<message> getallMessage();

    public List<message> getsendermessage(Integer id);

    public List<message> getrecivermessage(Integer id);


}
