package com.poberwong.checkcamera;

import android.app.Activity;
import android.hardware.Camera;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactApplicationContext;

/**
 * Created by poberwong on 16/6/30.
 */
public class CheckCameraModule extends ReactContextBaseJavaModule {
    
    public CheckCameraModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "CheckCamera";
    }

    @ReactMethod
    public void checkAuthorization(Callback callback) {
        boolean canUse = true;
        Camera mCamera = null;
        try {
            mCamera = Camera.open();
            // setParameters 是针对魅族MX5 做的。MX5 通过Camera.open() 拿到的Camera
            // 对象不为null
            Camera.Parameters mParameters = mCamera.getParameters();
            mCamera.setParameters(mParameters);
        } catch (Exception e) {
            canUse = false;
        }
        if (mCamera != null) {
            mCamera.release();
        }
        callback.invoke(canUse);
    }
}
