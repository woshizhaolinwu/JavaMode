package jrdcom.com.javamode.StructModel.AdapterMode;

import android.util.Log;

import jrdcom.com.javamode.Common;

/**
 * Created by longcheng on 2017/5/26.
 */

public class objectAdapter implements Targettable {
    private Source source;
    public objectAdapter(){
        source = new Source();
    }
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        Log.d(Common.TAG,"This is method2");
    }
}
