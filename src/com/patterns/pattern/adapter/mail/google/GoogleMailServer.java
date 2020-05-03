package com.patterns.pattern.adapter.mail.google;

import java.util.Map;

public interface GoogleMailServer {

    /**
     * Fetches unread email details
     *
     * @return email sender addresses mapped to email subjects
     */
    Map<String, String>/*PHP associative array*/ fetchUnreadEmailsDetails();

    String getLastMailBody();

    GoogleMailToSend composeEmail(String recipientAddress, String subject, String body);

    void sendEmail(GoogleMailToSend googleMailToSend);

}
