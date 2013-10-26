package com.runsn.controller;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * Title: Mail
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class Mail {
    private String host;
    private String username;
    private String password;
    private String mail_head_name = "恭喜您 , 报名成功！";
    private String mail_head_value = "恭喜您 , 报名成功！";
    private String mail_to;
    private String mail_from;
    private String mail_subject = "恭喜您 , 报名成功！";
    private String mail_body;
    private String personalName = "我的邮件";

    public Mail(String host, String username, String password, String mail_from, String mail_to, String mail_body) {
        this.host = host;
        this.username = username;
        this.password = password;
        this.mail_from = mail_from;
        this.mail_to = mail_to;
        this.mail_body = mail_body;
    }

    public void sendMail() throws SendFailedException {
        try {
            Properties props = new Properties();//获取系统环境
            Authenticator auth = new Email_Autherticator(username, password);//进行邮件服务用户认证
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props, auth);
            //设置session,和邮件服务器进行通讯
            MimeMessage message = new MimeMessage(session);
            message.setContent("Hello","text/plain");//设置邮件格式
            message.setSubject(mail_subject);//设置邮件主题
            message.setText(mail_body);//设置邮件内容
            message.setHeader(mail_head_name, mail_head_value);//设置邮件标题
            message.setSentDate(new Date());//设置邮件发送时期
            Address address = new InternetAddress(mail_from,personalName);
            message.setFrom(address);//设置邮件发送者的地址
            Address toaddress = new InternetAddress(mail_to);//设置邮件接收者的地址
            message.addRecipient(Message.RecipientType.TO, toaddress);
            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
