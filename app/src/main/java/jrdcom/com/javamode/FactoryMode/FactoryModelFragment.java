package jrdcom.com.javamode.FactoryMode;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

import jrdcom.com.javamode.AbstractFactoryMode.MailFactoryMode;
import jrdcom.com.javamode.BuilderMode.BuilderModeAPI;
import jrdcom.com.javamode.R;
import jrdcom.com.javamode.Sender.Sender;
import jrdcom.com.javamode.SingleMode.ContactSender;

/**
 * Created by longcheng on 2017/5/25.
 */

public class FactoryModelFragment extends Fragment {
    //工厂方法模式
    private Button btn_normal_mode;
    private Button btn_multi_mode;
    private Button btn_static_mode;

    //抽象工厂模式
    private Button btn_abstract_mode;

    //单例模式
    private Button btn_single_mode;

    //建造者模式
    private Button btn_builder_mode;
    public final static String TAG = FactoryModelFragment.class.getSimpleName();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.factory_mode_layout, container, false);
        findViewId(view);
        return view;
    }

    private void findViewId(View view){
        btn_normal_mode = (Button)view.findViewById(R.id.normal_factory_mode);
        btn_multi_mode  = (Button)view.findViewById(R.id.multi_factory_mode);
        btn_static_mode = (Button)view.findViewById(R.id.static_factory_mode);
        btn_abstract_mode = (Button)view.findViewById(R.id.btn_abstract_factory);
        btn_single_mode = (Button)view.findViewById(R.id.btn_signle);
        btn_builder_mode = (Button)view.findViewById(R.id.btn_builder);

        btn_normal_mode.setOnClickListener(onClickListener);
        btn_multi_mode.setOnClickListener(onClickListener);
        btn_static_mode.setOnClickListener(onClickListener);
        btn_abstract_mode.setOnClickListener(onClickListener);
        btn_single_mode.setOnClickListener(onClickListener);
        btn_builder_mode.setOnClickListener(onClickListener);
    }

     View.OnClickListener onClickListener= new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            switch (v.getId()){
                case R.id.normal_factory_mode:
                    //Goto test normal factory mode
                    NormalFactoryMode normalFactoryMode = new NormalFactoryMode();
                    Sender sender =  normalFactoryMode.produce(0);
                    sender.send();
                    break;
                case R.id.multi_factory_mode:
                    MultiFactoryMode multiFactoryMode = new MultiFactoryMode();
                    Sender sender1 = multiFactoryMode.MailProduct();
                    sender1.send();
                    break;
                case R.id.static_factory_mode:
                    Sender sender2 =   StaticFactoryMode.produceMailSender();
                    sender2.send();
                    break;

                case R.id.btn_abstract_factory:
                    MailFactoryMode mailFactoryMode = new MailFactoryMode();
                    Sender sender3 =  mailFactoryMode.produce();
                    sender3.send();
                    break;

                case R.id.btn_signle:
                    Sender sender4 = ContactSender.getInstance();
                    sender4.send();
                    break;

                case R.id.btn_builder:
                    BuilderModeAPI builderModeAPI = new BuilderModeAPI();
                    builderModeAPI.produceMailList(3);
                    builderModeAPI.produceSmsList(4);
                    List<Sender> list = builderModeAPI.getSenderList();
                    for(Sender sender5:list){
                        sender5.send();
                    }
                    break;


            }
         }
     };
}
