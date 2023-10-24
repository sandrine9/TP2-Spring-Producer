package com.bnpp.epita.MQ.TP2SpringProducer.message;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

public class MonMessage implements MessageCreator {
    private String strMessage;

    public MonMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    @Override
    public Message createMessage(Session session) throws JMSException {
        TextMessage tm = session.createTextMessage(strMessage);
        return tm;
    }
}
