package andrew.com.android_ver;

import java.util.HashMap;

/**
 * Created by Andrew on 2016/9/23.
 */

public class actionDocument {

    //用来储存Activity对应的Action
    public static HashMap<CharSequence,String> project_activity;

    public actionDocument() {
        this.project_activity = new HashMap<>();
        init();
    }


    private void init() {
        //尝试通过string资源来存储信息，但是无法通过中文直接引用，只好使用hashmap
        //这里是存储的对应项目的Activity的隐式启动action
        project_activity.put("逆转字符串","Action_TurnDownString");
        project_activity.put("密码短信","Action_SecretMessage");
    }


}
