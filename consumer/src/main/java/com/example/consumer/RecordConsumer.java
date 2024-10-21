package com.example.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;
import com.example.task4.Record;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class RecordConsumer {
    private static final Logger logger = LoggerFactory.getLogger(RecordConsumer.class);

    @JmsListener(destination = "records.queue")
    public void consumeMessage(Record record) {
        try {
            logger.info("Received message: {}", record.getData());
            // Perform operations on the record
            processRecord(record);
            logger.info("Processed message: {}", record.getData());
        } catch (Exception e) {
            logger.error("Error processing message: ", e);
        }
    }

    private void processRecord(Record record) {
        // Transform the data by appending an extra letter "X"
        String transformedData = record.getData() + "X";

        // Update the record with the transformed data
        record.setData(transformedData);

        // Log the processed record for demonstration
        System.out.println("Processed Record: ID = " + record.getId() + ", Transformed Data = " + record.getData());
    }

}