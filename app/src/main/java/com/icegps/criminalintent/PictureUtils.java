package com.icegps.criminalintent;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;

/**
 * @name CriminalIntent
 * @class name：com.icegps.criminalintent
 * @class describe
 * @anthor Nsajdr QQ:1025910987
 * @time 2017/1/9 18:26
 * @change
 * @chang time
 * @class describe
 */

public class PictureUtils {
    public static Bitmap getScaledBitmap(String path, Activity activity) {
        Point szie = new Point();
        activity.getWindowManager().getDefaultDisplay()
                .getSize(szie);
        return getScaledBitmap(path, szie.x, szie.y);
    }
    
    public static Bitmap getScaledBitmap(String path, int destWidth, int destHeight) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);

        float srcWidth = options.outWidth;
        float srcHeight = options.outHeight;

        int inSampleSize = 1;
        if (srcHeight > destHeight || srcWidth > destWidth) {
            if (srcWidth > srcHeight) {
                inSampleSize = Math.round(srcHeight / destHeight);
            } else {
                inSampleSize = Math.round(srcWidth / destWidth);
            }
        }

        options = new BitmapFactory.Options();
        options.inSampleSize = inSampleSize;

        return BitmapFactory.decodeFile(path, options);
    }
}
