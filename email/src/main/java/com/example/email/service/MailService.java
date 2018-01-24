package com.example.email.service;


/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/12/4 0004
 * Time: 14:43
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface MailService {
    public void sendSimpleMail(String to, String subject, String content);
}
