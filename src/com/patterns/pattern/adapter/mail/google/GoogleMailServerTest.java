package com.patterns.pattern.adapter.mail.google;

import java.util.Map;

import static java.lang.System.out;

final public class GoogleMailServerTest implements GoogleMailServer {

    @Override
    public Map<String, String> fetchUnreadEmailsDetails() {
        return Map.of(
                "asdfghjkl@spam.com", "Hey, this is not a spam!",
                "teammate@old-company.com", "Hey bro, may you want to come back?",
                "hire-me@recruiter.com", "Hello dear super duper professional, I want to recruit you."
        );
    }

    @Override
    public String getLastMailBody() {
        return "Hi dear subscriber, please unsubscribe :-)";
    }

    @Override
    public GoogleMailToSend composeEmail(String recipientAddress, String subject, String body) {
        GoogleMailToSend googleMailToSend = new GoogleMailToSend(recipientAddress, subject, body);
        out.println("composed email " + googleMailToSend);
        return googleMailToSend;
    }

    @Override
    public void sendEmail(GoogleMailToSend googleMailToSend) {
        out.println("Sending email " + googleMailToSend);
    }
}
