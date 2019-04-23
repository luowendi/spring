package luo.demo.service.impl;

import luo.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import luo.demo.pojo.*;
import luo.demo.dao.*;
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void deleteMessage(int id) {
        messageMapper.deleteMessage(id);
    }

    @Override
    public List<message> getallMessage() {
        return messageMapper.getallMessage();
    }

    @Override
    public List<message> getsendermessage(Integer id) {

        return messageMapper.getsendermessagebyid(id);
    }

    @Override
    public List<message> getrecivermessage(Integer id) {
        return messageMapper.getrecievermessagebyid(id);
    }

    @Override
    public void sendMessage(message messag) {
        if (messag.getM_reciecerid() != -1) {
            messageMapper.sendMessage(messag);
        } else {
            List<users> user = userMapper.getallUser();
            for (int i = 0; i < user.size(); i++) {
                messag.setM_reciecerid(user.get(i).getU_id());
                messageMapper.sendMessage(messag);
            }

        }
    }
}