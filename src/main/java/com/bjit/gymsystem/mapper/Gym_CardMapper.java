package com.bjit.gymsystem.mapper;

import com.bjit.gymsystem.entity.Gym_Card;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface Gym_CardMapper {
    public List<Gym_Card> getAll(@Param("card_type_id") int card_type_id);
    public int add(Gym_Card gym_card);
    public int update(@Param("status")String status,@Param("id")Long id);
    public int delete(@Param("id") Long id);
}
