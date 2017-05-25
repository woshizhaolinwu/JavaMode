package jrdcom.com.javamode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import jrdcom.com.javamode.FactoryMode.FactoryModelFragment;
import jrdcom.com.javamode.StructModel.StructModelFragment;

public class MainActivity extends AppCompatActivity {
    private List<String> listString = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //直接用list fragment替换
        initView();
    }

    private void initView(){
        initData(); //初始化list string
        ListFragment listFragment = new ListFragment();
        getFragmentManager().beginTransaction()
                .add(R.id.main_screen, listFragment)
                .addToBackStack(ListFragment.TAG)
                .commit();
        listFragment.setListAdapter(this, listString);
        listFragment.setListOnClick(listOnClick);
    }

    private void initData(){
        listString.add("1 创建型模式");
        listString.add("2 结构型模式");
    }

    ListFragment.ListOnClick listOnClick = new ListFragment.ListOnClick() {
        @Override
        public void onClick(int position) {
            switch (position){
                case 0: //创建型模式
                    getFragmentManager().beginTransaction()
                            .replace(R.id.main_screen, new FactoryModelFragment())
                            .addToBackStack(FactoryModelFragment.TAG)
                            .commit();
                    break;
                case 1: //结构型模式
                    getFragmentManager().beginTransaction()
                            .replace(R.id.main_screen, new StructModelFragment())
                            .addToBackStack(StructModelFragment.TAG)
                            .commit();

                    break;
            }
        }
    };
}
