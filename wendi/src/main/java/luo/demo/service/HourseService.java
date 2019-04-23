package luo.demo.service;

import java.util.List;
import luo.demo.pojo.*;
public interface HourseService {



    public List<hourse> getallHourse();

    public void deletehourse(int id);

    public void insertHourse(hourse hourse);

    public void updateHourse(hourse hourse);
}
