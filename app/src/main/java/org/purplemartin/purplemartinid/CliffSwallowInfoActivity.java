package org.purplemartin.purplemartinid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CliffSwallowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliff_swallow_info);
        CliffSwallowInfoActivity.ButtonHandler bh = new CliffSwallowInfoActivity.ButtonHandler();
        Button birdButtonCS = findViewById(R.id.birdButtonCS);
        Button nestButtonCS = findViewById(R.id.nestButtonCS);
        Button eggButtonCS = findViewById(R.id.eggButtonCS);
        Button housingButtonCS = findViewById(R.id.housingButtonCS);
        birdButtonCS.setOnClickListener(bh);
        nestButtonCS.setOnClickListener(bh);
        eggButtonCS.setOnClickListener(bh);
        housingButtonCS.setOnClickListener(bh);
    }

    private class ButtonHandler implements View.OnClickListener {
        public void onClick(View v) {
            Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            if (vb != null) {
                vb.vibrate(100);
            }

            switch(v.getId()) {
                case R.id.birdButtonCS:
                    Intent intent1 = new Intent(CliffSwallowInfoActivity.this, CliffSwallowBirdActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.nestButtonCS:
                    Intent intent2 = new Intent(CliffSwallowInfoActivity.this, CliffSwallowNestActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.eggButtonCS:
                    Intent intent3 = new Intent(CliffSwallowInfoActivity.this, CliffSwallowEggActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.housingButtonCS:
                    Intent intent4 = new Intent(CliffSwallowInfoActivity.this, CliffSwallowHousingActivity.class);
                    startActivity(intent4);
                    break;

            }
        }
    }
}
