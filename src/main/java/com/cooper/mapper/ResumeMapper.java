package com.cooper.mapper;

import com.cooper.entity.ResumeDelivery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ResumeMapper {
    /**
     * 根据简历ID查询简历信息
     */
    ResumeDelivery getResumeById(Integer id);

    /**
     * 查询所有简历信息
     */
    List<ResumeDelivery> getAllResumes();

    /**
     * 更新简历状态
     */

    void updateResumeStatus(@Param("id") Integer id, @Param("status") String status);
}