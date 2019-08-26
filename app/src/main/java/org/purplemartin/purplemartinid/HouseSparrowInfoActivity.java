package org.purplemartin.purplemartinid;

import android.content.Context;
import android.content.Intent;
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

            switch(v.getId()) {
                case R.id.birdButtonHS:
                    Intent intent1 = new Intent(HouseSparrowInfoActivity.this, HouseSparrowBirdActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.nestButtonHS:
                    Intent intent2 = new Intent(HouseSparrowInfoActivity.this, HouseSparrowNestActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.eggButtonHS:
                    Intent intent3 = new Intent(HouseSparrowInfoActivity.this, HouseSparrowEggActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.housingButtonHS:
                    Intent intent4 = new Intent(HouseSparrowInfoActivity.this, HouseSparrowHousingActivity.class);
                    startActivity(intent4);
                    break;

            }
        }
    }
}
