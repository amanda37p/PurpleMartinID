package org.purplemartin.purplemartinid;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CliffSwallowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliff_swallow_info);
        CliffSwallowInfoActivity.ButtonHandler bh = new CliffSwallowInfoActivity.ButtonHandler();
        Button birdButtonCS = findViewById(R.id.birdButtonCS);
        Button nestButtonCS = findViewById(R.id.nestButtonCS);
        Button eggButtonCS = findViewById(R.id.eggButtonCS);
        Button housingButtonCS = findViewById(R.id.housingButtonCS);
        birdButtonCS.setOnClickListener(bh);
        nestButtonCS.setOnClickListener(bh);
        eggButtonCS.setOnClickListener(bh);
        housingButtonCS.setOnClickListener(bh);
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
