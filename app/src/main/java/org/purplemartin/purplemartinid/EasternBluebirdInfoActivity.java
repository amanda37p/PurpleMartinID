package org.purplemartin.purplemartinid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EasternBluebirdInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eastern_bluebird_info);
        EasternBluebirdInfoActivity.ButtonHandler bh = new EasternBluebirdInfoActivity.ButtonHandler();
        Button birdButtonEB = findViewById(R.id.birdButtonEB);
        Button nestButtonEB = findViewById(R.id.nestButtonEB);
        Button eggButtonEB = findViewById(R.id.eggButtonEB);
        Button housingButtonEB = findViewById(R.id.housingButtonEB);
        birdButtonEB.setOnClickListener(bh);
        nestButtonEB.setOnClickListener(bh);
        eggButtonEB.setOnClickListener(bh);
        housingButtonEB.setOnClickListener(bh);
    }

    private class ButtonHandler implements View.OnClickListener {
        public void onClick(View v) {
            Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            if (vb != null) {
                vb.vibrate(100);
            }

            switch(v.getId()) {
                case R.id.birdButtonEB:
                    Intent intent1 = new Intent(EasternBluebirdInfoActivity.this, EasternBluebirdBirdActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.nestButtonEB:
                    Intent intent2 = new Intent(EasternBluebirdInfoActivity.this, EasternBluebirdNestActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.eggButtonEB:
                    Intent intent3 = new Intent(EasternBluebirdInfoActivity.this, EasternBluebirdEggActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.housingButtonEB:
                    Intent intent4 = new Intent(EasternBluebirdInfoActivity.this, EasternBluebirdHousingActivity.class);
                    startActivity(intent4);
                    break;

            }
        }
    }
}
