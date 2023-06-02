package com.cooper.service;

import com.cooper.entity.ResumeDelivery;

import java.util.List;

public interface ResumeService {
    /**
     * 根据简历ID查询简历信息
     */
    ResumeDelivery getResumeById(Integer id);

    /**
     * 查询所有简历信息
     */
    List<ResumeDelivery> getAllResumes();

    void approveResume(Integer id);
    void rejectResume(Integer id);
}
