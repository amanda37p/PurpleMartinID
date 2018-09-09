package org.purplemartin.purplemartinid;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HouseSparrowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_sparrow_info);
        HouseSparrowInfoActivity.ButtonHandler bh = new HouseSparrowInfoActivity.ButtonHandler();
        Button birdButtonHS = findViewById(R.id.birdButtonHS);
        Button nestButtonHS = findViewById(R.id.nestButtonHS);
        Button eggButtonHS = findViewById(R.id.eggButtonHS);
        Button housingButtonHS = findViewById(R.id.housingButtonHS);
        birdButtonHS.setOnClickListener(bh);
        nestButtonHS.setOnClickListener(bh);
        eggButtonHS.setOnClickListener(bh);
        housingButtonHS.setOnClickListener(bh);
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
