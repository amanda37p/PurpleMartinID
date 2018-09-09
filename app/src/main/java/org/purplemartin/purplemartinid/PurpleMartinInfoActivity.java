package org.purplemartin.purplemartinid;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PurpleMartinInfoActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purple_martin_info);
        PurpleMartinInfoActivity.ButtonHandler bh = new PurpleMartinInfoActivity.ButtonHandler();
        Button birdButtonPM = findViewById(R.id.birdButtonPM);
        Button nestButtonPM = findViewById(R.id.nestButtonPM);
        Button eggButtonPM = findViewById(R.id.eggButtonPM);
        Button housingButtonPM = findViewById(R.id.housingButtonPM);
        birdButtonPM.setOnClickListener(bh);
        nestButtonPM.setOnClickListener(bh);
        eggButtonPM.setOnClickListener(bh);
        housingButtonPM.setOnClickListener(bh);
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
