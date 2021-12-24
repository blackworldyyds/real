package com.bjit.gymsystem.entity;


import java.io.Serializable;

public class Gym_Card implements Serializable{

  private long id;
  private String user_Name;
  private long card_Type_Id;
  private long status;
  private String balance;
  private java.sql.Date open_Date;
  private String phone;
  private Card_Type card_type;

  public Card_Type getCard_type() {
    return card_type;
  }

  public void setCard_type(Card_Type card_type) {
    this.card_type = card_type;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUser_Name() {
    return user_Name;
  }

  public void setUser_Name(String user_Name) {
    this.user_Name = user_Name;
  }


  public long getCard_Type_Id() {
    return card_Type_Id;
  }

  public void setCard_Type_Id(long card_Type_Id) {
    this.card_Type_Id = card_Type_Id;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }


  public java.sql.Date getOpen_Date() {
    return open_Date;
  }

  public void setOpen_Date(java.sql.Date open_Date) {
    this.open_Date = open_Date;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

}
