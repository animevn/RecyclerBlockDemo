package com.haanhgs.recyclerblock;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

public class App extends Application {

    private static WeakReference<Context> context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = new WeakReference<>(this);
    }

    public static Context appContext(){
        return context.get();
    }
}
