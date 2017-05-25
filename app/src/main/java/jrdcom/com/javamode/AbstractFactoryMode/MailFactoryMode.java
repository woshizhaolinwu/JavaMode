package jrdcom.com.javamode.AbstractFactoryMode;

import jrdcom.com.javamode.Sender.MailSender;
import jrdcom.com.javamode.Sender.Sender;

/**
 * Created by longcheng on 2017/5/25.
 */

public class MailFactoryMode implements IFactoryMode {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
