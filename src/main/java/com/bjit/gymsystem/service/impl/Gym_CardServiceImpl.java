package com.bjit.gymsystem.service.impl;

import com.bjit.gymsystem.entity.Gym_Card;
import com.bjit.gymsystem.mapper.Gym_CardMapper;
import com.bjit.gymsystem.service.Gym_CardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Gym_CardServiceImpl implements Gym_CardService {
    @Resource
    private Gym_CardMapper gym_cardMapper;


    @Override
    public List<Gym_Card> getAll(int card_type_id) {
        return gym_cardMapper.getAll(card_type_id);
    }

    @Override
    public int add(Gym_Card gym_card) {
        return gym_cardMapper.add(gym_card);
    }

    @Override
    public int update(String status, Long id) {
        return gym_cardMapper.update(status,id);
    }


    @Override
    public int delete(Long id) {
        return gym_cardMapper.delete(id);
    }


}
