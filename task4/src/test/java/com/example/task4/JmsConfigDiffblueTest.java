package com.example.task4;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {JmsConfig.class})
@ExtendWith(SpringExtension.class)
@DisabledInAotMode
class JmsConfigDiffblueTest {
    @MockBean
    private ActiveMQConnectionFactory activeMQConnectionFactory;

    @Autowired
    private JmsConfig jmsConfig;

    /**
     * Method under test: {@link JmsConfig#connectionFactory()}
     */
    @Test
    void testConnectionFactory() {

        jmsConfig.connectionFactory();
    }

    /**
     * Method under test: {@link JmsConfig#jmsTemplate()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testJmsTemplate() {

        jmsConfig.jmsTemplate();
    }

    /**
     * Method under test: {@link JmsConfig#jmsListenerContainerFactory()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testJmsListenerContainerFactory() {

        // Arrange and Act
        jmsConfig.jmsListenerContainerFactory();
    }
}
