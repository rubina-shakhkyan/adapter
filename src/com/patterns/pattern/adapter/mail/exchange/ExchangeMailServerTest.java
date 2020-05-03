package com.patterns.pattern.adapter.mail.exchange;

import static java.lang.System.out;

final public class ExchangeMailServerTest implements ExchangeMailServer {
    @Override
    public String[] listUnreadEmailSenders() {
        return new String[]{"schoolmate@school.com", "classmate@class.com", "teammate@team.com"};
    }

    @Override
    public String getLatestMailContent() {
        return "Hey buddy, call me somehow.";
    }

    @Override
    public void sendEmail(String recipientEmailAddress, String title, String body) {
        out.println(
                String.format("Sending email to %s, title = %s, body = %s", recipientEmailAddress, title, body)
        );
    }
}
