package com.bjit.gymsystem.service.impl;

import com.bjit.gymsystem.entity.Card_Type;
import com.bjit.gymsystem.mapper.Card_TypeMapper;
import com.bjit.gymsystem.service.Card_TypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Service
public class Card_TypeServiceImpl implements Card_TypeService {
@Resource
private Card_TypeMapper card_typeMapper;
    @Override
    public List<Card_Type> getAll() {
        return card_typeMapper.getAll();
    }
}
