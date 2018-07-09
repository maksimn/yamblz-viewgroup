package ru.yandex.yamblz.ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import ru.yandex.yamblz.R;

public class LayoutDemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        String layoutType = intent.getStringExtra("layout");

        switch (layoutType) {
            case "relative": setContentView(R.layout.relative_layout); break;
            case "constraint": setContentView(R.layout.constraint_layout); break;
            case "table": setContentView(R.layout.table_layout); break;
            case "flex": setContentView(R.layout.flex_layout); break;
            default: setContentView(R.layout.relative_layout);
        }

    }
}
