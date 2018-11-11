package android.free.com.memorydemo.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class DeviceUtil {
    private Context context;

    private static DeviceUtil stance;

    public static DeviceUtil getStance(Context context) {
        if(stance == null){
            synchronized (DeviceUtil.class){
                stance = new DeviceUtil(context);
            }
        }
        return stance;
    }

    private DeviceUtil(Context context){
        this.context = context;
    }

    public int getVersionCode(final String pkg) {
        PackageManager pm = context.getPackageManager();
        PackageInfo packInfo = null;
        try {
            packInfo = pm.getPackageInfo(pkg,0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (packInfo != null) {
            return packInfo.versionCode;
        } else {
            return -1;
        }
    }
}
