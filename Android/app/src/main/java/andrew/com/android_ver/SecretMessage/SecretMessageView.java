package andrew.com.android_ver.SecretMessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import andrew.com.android_ver.R;

public class SecretMessageView extends AppCompatActivity implements View.OnClickListener {

    private EditText et_Input;
    private TextView tv_compile;
    private TextView tv_parsing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_message_view);

        et_Input = (EditText) findViewById(R.id.et_Input);
        tv_compile = (TextView) findViewById(R.id.tv_compile);
        tv_parsing = (TextView) findViewById(R.id.tv_parsing);

        findViewById(R.id.btn_Compile).setOnClickListener(this);
        findViewById(R.id.btn_parsing).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_Compile:
                String content = null;
                try{
                    content = et_Input.getText().toString();

                    //更换这里调用的加密方法即可改变加密的方式
                    //假如你在某一个瞬间，看着这里，突然就杀气喷涌，抑制不住了，
                    String res = compiledByidiot(content);

                    if (res != null) {
                        tv_compile.setText("加密后的内容为:" + res.toString());
                    } else {
                        Toast.makeText(getApplicationContext(), "加密出错", Toast.LENGTH_SHORT).show();
                    }
                } catch (NullPointerException e){
                    Toast.makeText(getApplicationContext(), "请先输入要加密的内容", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_parsing:
                String parsingRes = et_Input.getText().toString();
                tv_parsing.setText("对加密内容解密为：" + parsingRes);
                break;
        }
    }

    private String compiledByidiot(String content) {
        char[] document = {'!','@','#','$','%','^','&','*','-','+',};
        int count = content.length();
        StringBuilder res = new StringBuilder();
        byte[] ch = null;
        int value = -1;
        while (count > 0) {
            if (ch == null && value == -1){
                ch = content.substring(count-1,count).getBytes();
                value = Math.abs(ch[0]%10);
                res.append(document[value]);
                count--;
            }
            ch = null;
            value = -1;
        }
        return res.toString();
    }


}
