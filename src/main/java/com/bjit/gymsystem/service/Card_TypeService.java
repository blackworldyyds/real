package com.bjit.gymsystem.service;

import com.bjit.gymsystem.entity.Card_Type;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Card_TypeService {
    public List<Card_Type> getAll();
}
