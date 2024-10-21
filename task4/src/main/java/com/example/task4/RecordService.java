package com.example.task4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    @Autowired
    private JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 5000) // Fetch every 5 seconds
    public void fetchAndSend() {
        List<Record> records = recordRepository.findAll();
        records.forEach(record -> {
            jmsTemplate.convertAndSend("records.queue", record);
            System.out.println("Sent message: " + record.getData());
        });
    }
}
