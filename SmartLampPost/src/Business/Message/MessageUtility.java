/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Message;

/**
 *
 * @author Priyank
 */
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.util.*;
import com.twilio.sdk.*;
import com.twilio.sdk.resource.factory.*;
import com.twilio.sdk.resource.instance.*;
import com.twilio.sdk.resource.list.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class MessageUtility {

    // Find your Account Sid and Token at twilio.com/user/account 
    final static String ACCOUNT_SID = "AC6c56fcdde4023d77ad39a2c40b15669c";
    final static String AUTH_TOKEN = "04555cb0677e8f8c0bbc37a8e2353aed";

    public static void sendMessage(String recipient, String messageString) {
        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

        /**
         * SEND TEXT MESSAGE *
         */
        Map msgParams = new HashMap();
        msgParams.put("To", recipient);
        msgParams.put("From", "+12052897056");
        msgParams.put("Body", messageString);

        SmsFactory messageFactory = client.getAccount().getSmsFactory();
        Sms message = null;
        try {
            message = messageFactory.create(msgParams);
        } catch (TwilioRestException ex) {
            Logger.getLogger(MessageUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(message.getSid());

    }

    public static void sendLocation(String recipient, String messageString, String sensorLatitude, String sensorLongitude) {
        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

        /**
         * SEND TEXT MESSAGE *
         */
        Map msgParams = new HashMap();
        msgParams.put("To", recipient);
        msgParams.put("From", "+12052897056");
        msgParams.put("Body", messageString + " Latitude: " + sensorLatitude + " Longitude: " + sensorLongitude + ". Check on maps.google.com.");

        SmsFactory messageFactory = client.getAccount().getSmsFactory();
        Sms message = null;
        try {
            message = messageFactory.create(msgParams);
        } catch (TwilioRestException ex) {
            Logger.getLogger(MessageUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(message.getSid());
    }
}
