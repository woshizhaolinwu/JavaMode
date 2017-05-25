package jrdcom.com.javamode.Sender;

import android.util.Log;

import jrdcom.com.javamode.Common;

/**
 * Created by longcheng on 2017/5/25.
 */

public class MailSender implements Sender {
    @Override
    public void send() {
        Log.d(Common.TAG, "This is MailSender");
    }
}
