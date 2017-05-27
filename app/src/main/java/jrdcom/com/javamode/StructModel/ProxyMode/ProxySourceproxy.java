package jrdcom.com.javamode.StructModel.ProxyMode;

import android.util.Log;

import jrdcom.com.javamode.Common;

/**
 * Created by longcheng on 2017/5/26.
 */

public class ProxySourceproxy implements ProxySourceTable {

    private ProxySourceTable sourceTable;

    public ProxySourceproxy(){
        sourceTable = new ProxySource();//在这里传入原型
    }
    @Override
    public void method() {
        //这里调用原型函数，外面则调用代理函数
        Log.d(Common.TAG, "proxy source before");
        sourceTable.method();
    }
}
