package org.purplemartin.purplemartinid;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TreeSwallowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_swallow_info);
        TreeSwallowInfoActivity.ButtonHandler bh = new TreeSwallowInfoActivity.ButtonHandler();
        Button birdButtonTS = findViewById(R.id.birdButtonTS);
        Button nestButtonTS = findViewById(R.id.nestButtonTS);
        Button eggButtonTS = findViewById(R.id.eggButtonTS);
        Button housingButtonTS = findViewById(R.id.housingButtonTS);
        birdButtonTS.setOnClickListener(bh);
        nestButtonTS.setOnClickListener(bh);
        eggButtonTS.setOnClickListener(bh);
        housingButtonTS.setOnClickListener(bh);
    }

    private class ButtonHandler implements View.OnClickListener {
        public void onClick(View v) {
            Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            if (vb != null) {
                vb.vibrate(100);
            }
        }
    }
}
