package jrdcom.com.javamode.FactoryMode;

import jrdcom.com.javamode.Sender.MailSender;
import jrdcom.com.javamode.Sender.SmsSender;

/**
 * Created by longcheng on 2017/5/25.
 */

public class StaticFactoryMode {
    public static SmsSender produceSmsSender(){
        return  new SmsSender();
    }

    public static MailSender produceMailSender(){
        return new MailSender();
    }
}

