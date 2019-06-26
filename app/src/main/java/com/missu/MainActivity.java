package com.missu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.cleveroad.fanlayoutmanager.FanLayoutManager;
import com.jaeger.library.StatusBarUtil;



public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FanLayoutManager fanLayoutManager;
    String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1562124767&di=21b6a883abc3f36ca0a0d6a9ccda235f&imgtype=jpg&er=1&src=http%3A%2F%2Fn.sinaimg.cn%2Fsinacn%2Fw600h538%2F20180207%2F29ff-fyrhcqz5863402.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarUtil.setTransparent(this);
        recyclerView = findViewById(R.id.test);
        fanLayoutManager = new FanLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(fanLayoutManager);
    }
}
