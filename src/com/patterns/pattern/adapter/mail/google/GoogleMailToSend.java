package com.patterns.pattern.adapter.mail.google;

final public class GoogleMailToSend {

    private final String recipientAddress;
    private final String subject;
    private final String body;

    public GoogleMailToSend(String recipientAddress, String subject, String body) {
        this.recipientAddress = recipientAddress;
        this.subject = subject;
        this.body = body;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "GoogleMailToSend{" +
                "recipientAddress='" + recipientAddress + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
