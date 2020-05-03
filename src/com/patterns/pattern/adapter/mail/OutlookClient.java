package com.patterns.pattern.adapter.mail;

import com.patterns.pattern.adapter.mail.exchange.ExchangeMailServer;

import static java.lang.System.out;

final public class OutlookClient {

    private final ExchangeMailServer exchangeMailServer;

    public OutlookClient(ExchangeMailServer exchangeMailServer) {
        this.exchangeMailServer = exchangeMailServer;
    }

    public void performEmailActivity() {
        String[] emailAddresses = exchangeMailServer.listUnreadEmailSenders();
        out.println("unread email sender addresses = " + String.join(", ", emailAddresses));

        String emailContent = exchangeMailServer.getLatestMailContent();
        out.println("Latest email content = " + emailContent);

        exchangeMailServer.sendEmail("recipient@email.com", "Hello", "Hi buddy, how is it going?");
    }

}
