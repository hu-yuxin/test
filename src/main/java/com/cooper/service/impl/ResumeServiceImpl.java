package com.cooper.service.impl;


import com.cooper.entity.ResumeDelivery;
import com.cooper.mapper.ResumeMapper;
import com.cooper.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeMapper resumeMapper;

    @Override
    public List<ResumeDelivery> getAllResumes() {
        return resumeMapper.getAllResumes();
    }

    @Override
    public ResumeDelivery getResumeById(Integer id) {
        return resumeMapper.getResumeById(id);
    }

    @Override
    public void approveResume(Integer id) {
        resumeMapper.updateResumeStatus(id, "同意");
    }

    @Override
    public void rejectResume(Integer id) {
        resumeMapper.updateResumeStatus(id, "拒绝");
    }
}