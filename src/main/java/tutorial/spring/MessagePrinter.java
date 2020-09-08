package tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 13 Dec 2017, 1:13 PM
 */
@Component
public class MessagePrinter
{
    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service)
    {
        this.service = service;
    }

    public void printMessage()
    {
        System.out.println(service.getMessage());
    }
}
