package com.bjit.gymsystem.mapper;

import com.bjit.gymsystem.entity.Card_Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface Card_TypeMapper {
    public List<Card_Type> getAll();

}
