package org.codefarml.external;

import android.app.Activity;
import android.widget.Toast;

import org.codefarml.common.IHandle;

/**
 * 作者    lgc
 * 时间    2020/6/15 14:08
 * 文件    DifferenceBuild
 * 描述
 */
public class ExternalHandleImpl implements IHandle {
    @Override
    public void showToast(Activity activity) {
        Toast.makeText(activity,"external",Toast.LENGTH_LONG).show();
    }
}
