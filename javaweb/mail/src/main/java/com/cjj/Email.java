package com.cjj;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * 简单邮件
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/17
 * Time:10:31
 *
 * fbsxsnfnfxiucacf
 *
 */
public class Email {

    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.setProperty("mail.host", "smtp.qq.com");
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.stmp.auth", "true");

        MailSSLSocketFactory sslSocketFactory = new MailSSLSocketFactory();
        sslSocketFactory.setTrustAllHosts(true);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.ssl.socketFactory", sslSocketFactory);

        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("465313669@qq.com", "fbsxsnfnfxiucacf");
            }
        });

        Transport ts = session.getTransport();

        ts.connect("smtp.qq.com", "465313669@qq.com", "fbsxsnfnfxiucacf");

        MimeMessage mimeMessage = new MimeMessage(session);

        mimeMessage.setFrom(new InternetAddress("465313669@qq.com"));

        mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress("465313669@qq.com"));

        mimeMessage.setSubject("学习java");

        mimeMessage.setContent("你好","text/html;charset=UTF-8");

        ts.sendMessage(mimeMessage, mimeMessage.getAllRecipients());

        ts.close();





    }
}
