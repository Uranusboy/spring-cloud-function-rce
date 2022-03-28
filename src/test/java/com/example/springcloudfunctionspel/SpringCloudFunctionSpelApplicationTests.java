package com.example.springcloudfunctionspel;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.function.context.FunctionCatalog;
import org.springframework.cloud.function.context.FunctionProperties;
import org.springframework.cloud.function.context.config.RoutingFunction;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.function.Function;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpringCloudFunctionSpelApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void testMultipleRouters() {
//        System.setProperty(FunctionProperties.PREFIX + ".routing-expression", "'uppercase'");
//        FunctionCatalog functionCatalog = this.configureCatalog(MultipleRouterConfiguration.class);
//        Function function = functionCatalog.lookup(RoutingFunction.FUNCTION_NAME);
//        assertThat(function).isNotNull();
//        Message<String> message = MessageBuilder.withPayload("hello").build();
//        assertThat(function.apply(message)).isEqualTo("HELLO");
//
//        function = functionCatalog.lookup("mySpecialRouter");
//        assertThat(function).isNotNull();
//        message = MessageBuilder.withPayload("hello").build();
//        assertThat(function.apply(message)).isEqualTo("olleh");
    }
}
