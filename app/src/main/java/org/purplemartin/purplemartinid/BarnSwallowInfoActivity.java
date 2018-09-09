package org.purplemartin.purplemartinid;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BarnSwallowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barn_swallow_info);
        BarnSwallowInfoActivity.ButtonHandler bh = new BarnSwallowInfoActivity.ButtonHandler();
        Button birdButtonBNS = findViewById(R.id.birdButtonBNS);
        Button nestButtonBNS = findViewById(R.id.nestButtonBNS);
        Button eggButtonBNS = findViewById(R.id.eggButtonBNS);
        Button housingButtonBNS = findViewById(R.id.housingButtonBNS);
        birdButtonBNS.setOnClickListener(bh);
        nestButtonBNS.setOnClickListener(bh);
        eggButtonBNS.setOnClickListener(bh);
        housingButtonBNS.setOnClickListener(bh);
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
