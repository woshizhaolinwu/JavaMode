package jrdcom.com.javamode.FactoryMode;

import jrdcom.com.javamode.Sender.MailSender;
import jrdcom.com.javamode.Sender.SmsSender;

/**
 * Created by longcheng on 2017/5/25.
 */

public class MultiFactoryMode {
    public MailSender MailProduct(){
        return new MailSender();
    }

    public SmsSender SmsProduct(){
        return new SmsSender();
    }
}
