package com.pavelnazaro.rabbitmq.console.Task1;

public class SubscriberC extends Subscriber{
    public static void main(String[] argv) throws Exception {
        Subscriber.subscribe("com.gb.c");
    }
}
