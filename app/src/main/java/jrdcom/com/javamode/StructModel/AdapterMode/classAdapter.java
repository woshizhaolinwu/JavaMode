package jrdcom.com.javamode.StructModel.AdapterMode;

import android.util.Log;

import jrdcom.com.javamode.Common;

/**
 * Created by longcheng on 2017/5/26.
 */

public class classAdapter extends Source implements Targettable {
    @Override
    public void method2() {
        Log.d(Common.TAG, "This is method2 ");
    }
}
