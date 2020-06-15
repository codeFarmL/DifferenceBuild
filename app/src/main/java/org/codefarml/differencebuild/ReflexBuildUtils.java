package org.codefarml.differencebuild;

import android.text.TextUtils;

import org.codefarml.common.IHandle;

/**
 * 作者    lgc
 * 时间    2020/6/15 14:23
 * 文件    DifferenceBuild
 * 描述    通过反射+渠道处理差异类
 */
class ReflexBuildUtils {

    /**
     * 传入渠道的名字
     *
     * @param flavors
     */
    public static IHandle handleReflexBuild(String flavors) {

        Class currentClass;  //反射的class
        IHandle currentHandlePayImpl = null;  //反射的实例
        try {
            if (TextUtils.equals(flavors, "domestic")) {
                currentClass = Class.forName("org.codefarml.domestic.DomesticHandleImpl");
            } else {
                currentClass = Class.forName("org.codefarml.external.ExternalHandleImpl");
            }
            currentHandlePayImpl = (IHandle) currentClass.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return currentHandlePayImpl;

    }
}
