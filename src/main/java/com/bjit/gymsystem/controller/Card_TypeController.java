package com.bjit.gymsystem.controller;

import com.alibaba.fastjson.JSON;
import com.bjit.gymsystem.entity.Card_Type;
import com.bjit.gymsystem.entity.Gym_Card;
import com.bjit.gymsystem.service.Card_TypeService;
import com.bjit.gymsystem.service.Gym_CardService;
import com.bjit.gymsystem.service.impl.Card_TypeServiceImpl;
import com.bjit.gymsystem.service.impl.Gym_CardServiceImpl;
import com.bjit.gymsystem.util.RedisUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Card_TypeController {
    @Resource
    private Card_TypeServiceImpl card_typeService;
    @Resource
    private Gym_CardServiceImpl gym_cardService;
    @Resource
    private RedisUtil redisUtil;
    @RequestMapping("/getAll")
    public String q(Model model, @RequestParam(value = "name",required = false,defaultValue = "0") String lid){
        Integer id=Integer.parseInt(lid);
        List<Gym_Card> gym_cardList=gym_cardService.getAll(id);
        model.addAttribute("gymlist",gym_cardList);
        model.addAttribute("name",lid);
        return "show";
    }
    @RequestMapping("/toadd")
    public String b(){
        return "add";
    }
    @RequestMapping("/add")
    public String c(Gym_Card gym_card, HttpRequest request){
        gym_cardService.add(gym_card);
        return "redirect:/getAll";
    }
    @RequestMapping("/update")
    @ResponseBody
    public String d(@RequestParam("id") String id,@RequestParam("status") String status,Model model){
        Long llid=Long.parseLong(id);
        int i=gym_cardService.update(status,llid);
        return JSON.toJSONString(true);
    }

    @RequestMapping("/get")
    @ResponseBody
    public String q(){
        Object list1=redisUtil.get("list");
        if(list1!=null){
            return JSON.toJSONString(list1);
        }else {
            List<Card_Type> list=card_typeService.getAll();
            redisUtil.set("list",list);
            return JSON.toJSONString(list);
        }

    }
    @RequestMapping("/delete")
    public String F(@RequestParam("id") long id){
        gym_cardService.delete(id);
        return "redirect:/getAll";
    }
}
