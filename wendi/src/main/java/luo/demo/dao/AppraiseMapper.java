package luo.demo.dao;

import java.util.List;
import luo.demo.pojo.*;
public interface AppraiseMapper {

    public List<appraise> getallAppraiseMapper();

    public void addAppraise(appraise appraise);

    public List<appraise> findAppraise(int hourseid);
}
