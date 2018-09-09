package org.purplemartin.purplemartinid;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GreatCrestedFlycatcherInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_great_crested_flycatcher_info);
        GreatCrestedFlycatcherInfoActivity.ButtonHandler bh = new GreatCrestedFlycatcherInfoActivity.ButtonHandler();
        Button birdButtonGCF = findViewById(R.id.birdButtonGCF);
        Button nestButtonGCF = findViewById(R.id.nestButtonGCF);
        Button eggButtonGCF = findViewById(R.id.eggButtonGCF);
        Button housingButtonGCF = findViewById(R.id.housingButtonGCF);
        birdButtonGCF.setOnClickListener(bh);
        nestButtonGCF.setOnClickListener(bh);
        eggButtonGCF.setOnClickListener(bh);
        housingButtonGCF.setOnClickListener(bh);
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
