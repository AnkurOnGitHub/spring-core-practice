package com.example;

import com.example.Order.OrderService;
import com.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Weclome !" );
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        final OrderService user = context.getBean(OrderService.class);
        user.orderPlaced();

    }
}
