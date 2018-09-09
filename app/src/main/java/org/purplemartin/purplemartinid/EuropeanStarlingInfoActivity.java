package org.purplemartin.purplemartinid;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EuropeanStarlingInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_european_starling_info);
        EuropeanStarlingInfoActivity.ButtonHandler bh = new EuropeanStarlingInfoActivity.ButtonHandler();
        Button birdButtonES = findViewById(R.id.birdButtonES);
        Button nestButtonES = findViewById(R.id.nestButtonES);
        Button eggButtonES = findViewById(R.id.eggButtonES);
        Button housingButtonES = findViewById(R.id.housingButtonES);
        birdButtonES.setOnClickListener(bh);
        nestButtonES.setOnClickListener(bh);
        eggButtonES.setOnClickListener(bh);
        housingButtonES.setOnClickListener(bh);
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
