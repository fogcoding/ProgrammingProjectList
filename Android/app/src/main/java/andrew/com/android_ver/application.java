package andrew.com.android_ver;

import android.app.Application;

/**
 * Created by Andrew on 2016/9/23.
 */

public class application extends Application {

    private actionDocument actionDocument;

    @Override
    public void onCreate() {
        super.onCreate();

        //加载项目的ACTION信息
        actionDocument = new actionDocument();
    }

    

}
