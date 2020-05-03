package com.patterns.pattern.adapter.mail;

import com.patterns.pattern.adapter.mail.exchange.ExchangeMailServer;
import com.patterns.pattern.adapter.mail.google.GoogleMailServer;
import com.patterns.pattern.adapter.mail.google.GoogleMailToSend;

public class ExchangeGoogleMailServerAdapter implements GoogleMailServer {

    private final ExchangeMailServer exchangeMailServer;

    public ExchangeGoogleMailServerAdapter(ExchangeMailServers exchangeMailServer) {
        this.exchangeMailServer = exchangeMailServer;
    }
    @Override
    public String getLastMailBody() {
        return exchangeMailServer.getLatestMailContent();
    }

    @Override
    public void composeEmail(String recipientAddress, String subject, String body) {
        this.recipientAddress = recipientAddress;
        this.subject = subject;
        this.body = body;
    }
    @Overrdie
    public void sendEmail() {
        ExchangeMailServer.sendEmail(this.recipientEmailAddress, this.subject, this.body);
    }
}
