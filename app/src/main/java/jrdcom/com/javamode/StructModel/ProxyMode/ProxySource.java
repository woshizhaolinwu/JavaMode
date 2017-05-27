package jrdcom.com.javamode.StructModel.ProxyMode;

import android.util.Log;

import jrdcom.com.javamode.Common;

/**
 * Created by longcheng on 2017/5/26.
 */

public class ProxySource implements ProxySourceTable {
    @Override
    public void method() {
        Log.d(Common.TAG,"This is proxy source method");
    }
}
