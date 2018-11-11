package android.free.com.memorydemo;

import android.free.com.memorydemo.util.DeviceUtil;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class HandlerActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        //startThread();
        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                final int what = msg.what;
                android.util.Log.d("TEST","what ="+what);
                if(what == 0){
                    Toast.makeText(HandlerActivity.this,"receive message",Toast.LENGTH_LONG).show();
                }
                super.handleMessage(msg);
            }
        };

        Message message = handler.obtainMessage(0);
        handler.sendMessageDelayed(message,1000*10);
    }



    private void showVersionCode(){
        final int versionCode = DeviceUtil.getStance(HandlerActivity.this)
                .getVersionCode(getPackageName());
        Toast.makeText(HandlerActivity.this,
                "versionCode="+versionCode,Toast.LENGTH_LONG).show();
    }
}
