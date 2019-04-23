package luo.demo.service.impl;

import luo.demo.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import luo.demo.pojo.*;
import luo.demo.dao.*;

@Service
public class AppraiseServiceImpl implements AppraiseService {

    @Autowired
    private AppraiseMapper appraiseMapper;

    @Override
    public List<appraise> getallAppraiseMapper() {
        return appraiseMapper.getallAppraiseMapper();
    }


    @Override
    public void addAppraise(appraise appraise) {
        System.out.println(appraise);
        appraiseMapper.addAppraise(appraise);
    }

    @Override
    public List<appraise> findAppraise(int hourseid) {
       return appraiseMapper.findAppraise(hourseid);
    }

}
