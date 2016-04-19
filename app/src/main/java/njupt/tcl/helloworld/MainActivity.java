package njupt.tcl.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        LinearLayout linelayout = new LinearLayout(this);
        linelayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(linelayout);
//        TextView tv = new TextView(this);
//        tv.setText("haha");
//        tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//        linelayout.addView(tv);
        DrawView drawview = new DrawView(this);
        drawview.setMinimumHeight(500);
        drawview.setMinimumWidth(400);
        linelayout.addView(drawview);
    }
}
