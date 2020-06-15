package org.codefarml.differencebuild;

import android.app.Activity;
import android.widget.Toast;

/**
 * 作者    lgc
 * 时间    2020/6/15 13:37
 * 文件    DifferenceBuild
 * 描述
 */
class Utils {

    //展示Toast
    public static void showToast(Activity activity){
        Toast.makeText(activity,"external",Toast.LENGTH_LONG).show();
    }
}
