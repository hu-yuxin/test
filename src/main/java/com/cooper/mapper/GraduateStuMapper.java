package com.cooper.mapper;

import com.cooper.entity.GraduateStu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GraduateStuMapper {

    List<GraduateStu> selectAll();

    //查单个
    GraduateStu selectOne(Integer id);

    //多条件查询
    List<GraduateStu> selectByManyConditions(GraduateStu graduateStu);

    List<GraduateStu> selectPage(@Param("currentPage") Integer currentPage,@Param("pageSize") Integer pageSize);
    Integer selectTotal();

    Integer insertGraduate(GraduateStu graduateStu);

    Integer updateGraduate(GraduateStu graduateStu);

    Integer deleteGraduate(Integer id);

    Integer deleteMoreGraduate(Integer[] ids);
}
