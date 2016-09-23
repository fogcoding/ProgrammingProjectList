package andrew.com.android_ver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import static andrew.com.android_ver.R.layout.item;

public class ProjectListView extends AppCompatActivity {

    private ListView project_Document_ListView;
    private String[] project_Document;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_list_view);

        //增加项目内容的方法：
        //step 1:去values -> string -> Project,在Project中添加内容
        //step 2:新建一个独立的package，建立显示的Activity，设置启动的action，并在actionDocument类中添加对应的信息
        //step 3:实现自己的项目内容


        //在string文件中获取存在的项目内容
        project_Document  = this.getResources().getStringArray(R.array.Project);

        //用来展示项目的ListView
        project_Document_ListView = (ListView) findViewById(R.id.project_Document_ListView);
        project_Document_ListView.setAdapter(new ListViewAdapter(this,item,project_Document));

    }


}
