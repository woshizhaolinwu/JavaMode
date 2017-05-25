package jrdcom.com.javamode.FactoryMode;

import jrdcom.com.javamode.Sender.MailSender;
import jrdcom.com.javamode.Sender.Sender;
import jrdcom.com.javamode.Sender.SmsSender;

/**
 * Created by longcheng on 2017/5/25.
 */

public class NormalFactoryMode {
    /*普通工厂模式， 在工厂类定义一个方法，通过参数传递返回*/
    public Sender produce(int type){
        if(type == 0){
            return new MailSender();
        }else{
            return new SmsSender();
        }
    }
}
