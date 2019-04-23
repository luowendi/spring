package luo.demo.service;

import java.util.List;
import luo.demo.pojo.*;

public interface AppraiseService {

    public List<appraise> getallAppraiseMapper();

    public void addAppraise(appraise appraise);

    public List<appraise> findAppraise(int hourseid);
}
