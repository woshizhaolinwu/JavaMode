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
    @Bind(R.id.btn_adapter)
    Button btnAdapter;
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

    @OnClick({R.id.btn_adapter, R.id.btn_decoration, R.id.btn_proxy, R.id.btn_exterior, R.id.btn_bridge, R.id.btn_combination})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_adapter:
                
                break;
            case R.id.btn_decoration:
                break;
            case R.id.btn_proxy:
                break;
            case R.id.btn_exterior:
                break;
            case R.id.btn_bridge:
                break;
            case R.id.btn_combination:
                break;
        }
    }
}
