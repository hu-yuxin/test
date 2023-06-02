package com.cooper.mapper;

import com.cooper.entity.ZouMaDeng;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZouMaDengMapper {

    List<ZouMaDeng> selectAll();
}
