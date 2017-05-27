package jrdcom.com.javamode.StructModel.DecorationMode;

import android.util.Log;

import jrdcom.com.javamode.Common;

/**
 * Created by longcheng on 2017/5/26.
 */

public class Decorator implements SourceTable {
    private SourceTable source;
    public Decorator(SourceTable sourceTable){
        source = sourceTable;
    }

    @Override
    public void method() {
        Log.d(Common.TAG, "source method before");

        source.method();

        Log.d(Common.TAG, "source method after");
    }
}
