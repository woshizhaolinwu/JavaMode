package jrdcom.com.javamode.StructModel;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jrdcom.com.javamode.R;
import jrdcom.com.javamode.StructModel.AdapterMode.Targettable;
import jrdcom.com.javamode.StructModel.AdapterMode.classAdapter;
import jrdcom.com.javamode.StructModel.AdapterMode.interfaceWarp1;
import jrdcom.com.javamode.StructModel.AdapterMode.interfaceWarp2;
import jrdcom.com.javamode.StructModel.AdapterMode.objectAdapter;
import jrdcom.com.javamode.StructModel.DecorationMode.Decorator;
import jrdcom.com.javamode.StructModel.DecorationMode.Source;
import jrdcom.com.javamode.StructModel.DecorationMode.SourceTable;

/**
 * Created by longcheng on 2017/5/25.
 */

public class StructModelFragment extends Fragment {
    /*结构性模式的7种模式
    * 适配器模式
    * 装饰模式
    * 代理模式
    * 外观模式
    * 桥接模式
    * 组合模式
    * */

    @Bind(R.id.btn_decoration)
    Button btnDecoration;
    @Bind(R.id.btn_proxy)
    Button btnProxy;
    @Bind(R.id.btn_exterior)
    Button btnExterior;
    @Bind(R.id.btn_bridge)
    Button btnBridge;
    @Bind(R.id.btn_combination)
    Button btnCombination;
    @Bind(R.id.btn_adapter_class)
    Button btnAdapterClass;
    @Bind(R.id.btn_adapter_object)
    Button btnAdapterObject;
    @Bind(R.id.btn_adapter_interface)
    Button btnAdapterInterface;

    public final static String TAG = StructModelFragment.class.getSimpleName();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.struct_mode_layout, container, false);
        findViewId(view);
        ButterKnife.bind(this, view);
        return view;
    }

    private void findViewId(View view) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.btn_decoration, R.id.btn_proxy, R.id.btn_exterior, R.id.btn_bridge, R.id.btn_combination,R.id.btn_adapter_class, R.id.btn_adapter_object, R.id.btn_adapter_interface})
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_decoration: //装饰模式，动态的为类添加功能
                SourceTable sourceTable = new Source();
                SourceTable decorator =  new Decorator(sourceTable);
                decorator.method();
                break;

            case R.id.btn_proxy: //代理模式，跟装饰模式很想，所有操作通过proxy来进行

                break;
            case R.id.btn_exterior:
                break;
            case R.id.btn_bridge:
                break;
            case R.id.btn_combination:
                break;
            case R.id.btn_adapter_class: //类的适配，通过类的继承适配
                //调用适配器，接口Targettable的实现类就有了Source的功能
                jrdcom.com.javamode.StructModel.AdapterMode.Targettable targettable = new classAdapter();
                targettable.method1();
                targettable.method2();
                break;
            case R.id.btn_adapter_object://持有Source对象适配
                //持有Source对象
                Targettable objectAdapter = new objectAdapter();
                objectAdapter.method1();
                objectAdapter.method2();
                break;
            case R.id.btn_adapter_interface:
                /*
                * 接口定义多个方法， 继承接口不想实现这么多方法，中介通过抽象类继承接口， 实现类继承抽象类
                * */
                Targettable targettable1 = new interfaceWarp1();
                targettable1.method1();
                targettable1.method2();
                Targettable targettable2 = new interfaceWarp2();
                targettable2.method1();
                targettable2.method2();
                break;
        }
    }
}
