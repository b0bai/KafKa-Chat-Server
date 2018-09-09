package io.bobaikato.chat;

import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;

public class MessageConsumerImpl extends Thread{
    private KafkaStream stream;
    private volatile boolean isRunning = true;

    public MessageConsumerImpl(KafkaStream stream) {
        this.stream = stream;
    }

    public void run() {
        ConsumerIterator<byte[], byte[]> it = stream.iterator();
        while (isRunning) {
            if(it.hasNext())
                System.out.println(new String(it.next().message()));
        }
    }

    public void terminate() {
        isRunning = false;
    }
}
