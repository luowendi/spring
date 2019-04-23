package luo.demo.service.impl;
import luo.demo.dao.*;
import luo.demo.service.HourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import luo.demo.pojo.*;
@Service
public class HourseServiceImpl implements HourseService {

    @Autowired
    private HourseMapper hourseMapper;

    @Override
    public List<hourse> getallHourse() {
        return hourseMapper.getallhourses();
    }

    @Override
    public void deletehourse(int id) {
        hourseMapper.deleteHourse(id);
    }

    @Override
    public void insertHourse(hourse hourse) {
        hourseMapper.insertHourse(hourse);
    }

    @Override
    public void updateHourse(hourse hourse) {
        hourseMapper.updatehourse(hourse);
    }
}
