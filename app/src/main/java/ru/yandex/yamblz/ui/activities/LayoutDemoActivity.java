package ru.yandex.yamblz.ui.activities;

import android.app.Activity;
import android.os.Bundle;

import ru.yandex.yamblz.R;

public class LayoutDemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
    }
}
