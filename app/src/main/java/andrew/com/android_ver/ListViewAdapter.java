package andrew.com.android_ver;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;

import static andrew.com.android_ver.actionDocument.project_activity;

/**
 * Created by Andrew on 2016/9/22.
 */

public class ListViewAdapter extends BaseAdapter implements ListAdapter {

    private Context context;
    private Activity activity;
    private int attr;
    private String[] data;

    public ListViewAdapter(Activity context, int attr, String[] data) {
        this.context = context;
        this.activity = context;
        this.attr = attr;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final Button button;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(attr, null);
            button = (Button) view.findViewById(R.id.btn_Show);

            view.setTag(new ViewHolder(button));
        } else {
            ViewHolder holder = (ViewHolder) view.getTag();
            button = holder.getButton();
        }

        button.setText(data[i]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence activity = button.getText();
                Intent i = new Intent();
                String action = project_activity.get(activity);
                i.setAction(action);
                context.startActivity(i);
            }
        });
        return view;
    }

    private class ViewHolder {
        Button button;

        public ViewHolder(Button button) {
            this.button = button;
        }

        public Button getButton() {
            return button;
        }
    }
}
