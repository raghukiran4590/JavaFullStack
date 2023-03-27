package com.java.mail;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import com.sun.mail.imap.IMAPStore;
//import com.sun.mail.pop3.POP3Store;

public class ReceiveMail{

    public static void receiveEmail(String imapHost, String storeType,
                                    String user, String password) {
        try {

            //1) get the session object
            Properties properties = new Properties();
            properties.put("mail.host", imapHost);
            properties.put("mail.store.protocol", "imap");
            properties.put("mail.imap.auth", "true");
            properties.put("mail.imap.port", "993");

            Session emailSession = Session.getDefaultInstance(properties);

            //2) create the IMAP store object and connect with the IMAP server
            IMAPStore emailStore = (IMAPStore) emailSession.getStore(storeType);
            emailStore.connect(user, password);

            //3) create the folder object and open it
            Folder emailFolder = emailStore.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            //4) retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            System.out.println(messages.length);
            for (int i = 0; i < 5; i++) {
                Message message = messages[i];
                System.out.println("---------------------------------");
                System.out.println("Email Number " + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " + message.getContent().toString());
            }

            //5) close the store and folder objects
            emailFolder.close(false);
            emailStore.close();

        } catch (NoSuchProviderException e) {e.printStackTrace();}
        catch (MessagingException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
    }

    public static void main(String[] args) {

        String host = "outlook.office365.com";//change accordingly
        String mailStoreType = "imap";
        String username= "AF35861@us.ad.wellpoint.com";
        String password= "Beechmill@123";//change accordingly

        receiveEmail(host, mailStoreType, username, password);

    }
}