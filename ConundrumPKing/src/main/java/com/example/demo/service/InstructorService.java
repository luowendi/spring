package com.example.demo.service;

import com.example.demo.entity.instructor;

import java.util.List;

public interface InstructorService {

    /**
     * 给当前的老师加答题目的分数，用于排名
     * @param myteacher
     */
    public void addScore(instructor myteacher);

    /**
     * 根据输入的指导教师的ID来寻找该老师
     * @param in_id
     */
    public instructor getInstructorById(String in_id);

    public void modifyInstructorByid(instructor thisinstructor);

    public void deleteInstructorByid(String in_id);

    public List<instructor> getAllRank();
}
