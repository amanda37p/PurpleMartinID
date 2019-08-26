package org.purplemartin.purplemartinid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HouseFinchInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_finch_info);
        HouseFinchInfoActivity.ButtonHandler bh = new HouseFinchInfoActivity.ButtonHandler();
        Button birdButtonHF = findViewById(R.id.birdButtonHF);
        Button nestButtonHF = findViewById(R.id.nestButtonHF);
        Button eggButtonHF = findViewById(R.id.eggButtonHF);
        Button housingButtonHF = findViewById(R.id.housingButtonHF);
        birdButtonHF.setOnClickListener(bh);
        nestButtonHF.setOnClickListener(bh);
        eggButtonHF.setOnClickListener(bh);
        housingButtonHF.setOnClickListener(bh);
    }

    private class ButtonHandler implements View.OnClickListener {
        public void onClick(View v) {
            Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            if (vb != null) {
                vb.vibrate(100);
            }

            switch(v.getId()) {
                case R.id.birdButtonHF:
                    Intent intent1 = new Intent(HouseFinchInfoActivity.this, HouseFinchBirdActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.nestButtonHF:
                    Intent intent2 = new Intent(HouseFinchInfoActivity.this, HouseFinchNestActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.eggButtonHF:
                    Intent intent3 = new Intent(HouseFinchInfoActivity.this, HouseFinchEggActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.housingButtonHF:
                    Intent intent4 = new Intent(HouseFinchInfoActivity.this, HouseFinchHousingActivity.class);
                    startActivity(intent4);
                    break;

            }
        }
    }
}
