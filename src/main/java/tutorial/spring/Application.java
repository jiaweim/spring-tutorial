package tutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 13 Dec 2017, 1:14 PM
 */
@Configuration
@ComponentScan
public class Application
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }

    @Bean
    MessageService mockMessageService()
    {
        return () -> "Hello World!";
    }
}
