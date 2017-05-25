package jrdcom.com.javamode.SingleMode;

import android.util.Log;

import jrdcom.com.javamode.Common;
import jrdcom.com.javamode.Sender.Sender;

/**
 * Created by longcheng on 2017/5/25.
 */

public class ContactSender implements Sender {
    private static ContactSender contactSender;

   /* public static ContactSender getInstance(){
        //锁住contactSender
        if(contactSender ==null){
            synchronized (contactSender){
                if(contactSender == null){
                    contactSender = new ContactSender();
                }
            }
        }

        return contactSender;
    }*/

    /*私有化构造函数，防止被声明*/
    private ContactSender(){

    }

    /*通过内部类的方式来*/
    private static class SingleFactory{
        private static ContactSender sender = new ContactSender();
    }

    /*获取Instance*/
    public static ContactSender getInstance(){
        return SingleFactory.sender;
    }
    @Override
    public void send() {
        Log.d(Common.TAG, "This is contact sender");
    }
}
