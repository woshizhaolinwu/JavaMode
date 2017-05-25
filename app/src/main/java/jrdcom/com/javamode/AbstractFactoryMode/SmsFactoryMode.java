package jrdcom.com.javamode.AbstractFactoryMode;

import jrdcom.com.javamode.Sender.Sender;
import jrdcom.com.javamode.Sender.SmsSender;

/**
 * Created by longcheng on 2017/5/25.
 */

public class SmsFactoryMode implements IFactoryMode {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
