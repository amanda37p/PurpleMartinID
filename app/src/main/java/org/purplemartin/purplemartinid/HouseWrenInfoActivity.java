package org.purplemartin.purplemartinid;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HouseWrenInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_wren_info);
        HouseWrenInfoActivity.ButtonHandler bh = new HouseWrenInfoActivity.ButtonHandler();
        Button birdButtonHW = findViewById(R.id.birdButtonHW);
        Button nestButtonHW = findViewById(R.id.nestButtonHW);
        Button eggButtonHW = findViewById(R.id.eggButtonHW);
        Button housingButtonHW = findViewById(R.id.housingButtonHW);
        birdButtonHW.setOnClickListener(bh);
        nestButtonHW.setOnClickListener(bh);
        eggButtonHW.setOnClickListener(bh);
        housingButtonHW.setOnClickListener(bh);
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
