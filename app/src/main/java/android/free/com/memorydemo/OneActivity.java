package android.free.com.memorydemo;

import android.free.com.memorydemo.util.DeviceUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        // app version code
        DeviceUtil util = DeviceUtil.getStance(OneActivity.this);
        int packageName = util.getVersionCode(getPackageName());
        android.util.Log.d("TEST","versionCode"+packageName);

    }
}
