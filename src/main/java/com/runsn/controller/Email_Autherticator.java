package com.runsn.controller;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * Created with IntelliJ IDEA.
 * Title: Email_Autherticator
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class Email_Autherticator extends Authenticator {
    String username;
    String password;

    public Email_Autherticator(String user, String pwd) {
        super();
        username = user;
        password = pwd;
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }
}
