package com.example.service_demonstration;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
public class MyService extends Service {
    public MyService() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate() {
        Log.i("mylog","onCreate in Service");
        super.onCreate();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("mylog","onStartCommand in Service");
        Log.i("mylog", //tagName
                "thread id in service is "+Thread.currentThread().getId() //id of thread
        );
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        Log.i("mylog","onDestroy in Service");
        super.onDestroy();
    }
}