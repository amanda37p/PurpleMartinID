package org.purplemartin.purplemartinid;

import android.content.Context;
import android.content.Intent;
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

            switch(v.getId()) {
                case R.id.birdButtonBNS:
                    Intent intent1 = new Intent(BarnSwallowInfoActivity.this, BarnSwallowBirdActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.nestButtonBNS:
                    Intent intent2 = new Intent(BarnSwallowInfoActivity.this, BarnSwallowNestActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.eggButtonBNS:
                    Intent intent3 = new Intent(BarnSwallowInfoActivity.this, BarnSwallowEggActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.housingButtonBNS:
                    Intent intent4 = new Intent(BarnSwallowInfoActivity.this, BarnSwallowHousingActivity.class);
                    startActivity(intent4);
                    break;

            }
        }
    }
}
