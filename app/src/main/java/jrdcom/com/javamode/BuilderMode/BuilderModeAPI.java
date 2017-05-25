package jrdcom.com.javamode.BuilderMode;

import java.util.ArrayList;
import java.util.List;

import jrdcom.com.javamode.Sender.MailSender;
import jrdcom.com.javamode.Sender.Sender;
import jrdcom.com.javamode.Sender.SmsSender;

/**
 * Created by longcheng on 2017/5/25.
 */

public class BuilderModeAPI {
    private List<Sender> senderList;
    public BuilderModeAPI(){
        senderList = new ArrayList<>();
    }
    public void produceMailList(int count){
        for (int i = 0; i < count; i++){
            senderList.add(new MailSender());
        }
    }

    public void produceSmsList(int count){
        for (int i = 0; i <count; i++){
            senderList.add(new SmsSender());
        }
    }

    public List<Sender> getSenderList(){
        return senderList;
    }
}
