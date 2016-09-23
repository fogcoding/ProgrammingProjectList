package andrew.com.android_ver.TurnDownString;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import andrew.com.android_ver.R;

public class MainActivity extends AppCompatActivity {

    private EditText et_input;
    private TextView tv_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_input = (EditText) findViewById(R.id.et_input);
        tv_Result = (TextView) findViewById(R.id.tv_Result);

        findViewById(R.id.btn_Turn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String before = et_input.getText().toString();
                String after = TurnDown(before);

                tv_Result.setText("颠倒顺序前为："+before+"\n颠倒顺序后，结果为："+after);
            }
        });

    }

    private String TurnDown(String before) {
        StringBuilder res = new StringBuilder();
        int count = before.length();
        while (count > 0){
            String change = before.substring(count-1,count);
            res.append(change);
            change = null;
            count--;
        }
        return res.toString();
    }
}
