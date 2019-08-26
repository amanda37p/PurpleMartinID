package org.purplemartin.purplemartinid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BankSwallowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_swallow_info);
        BankSwallowInfoActivity.ButtonHandler bh = new BankSwallowInfoActivity.ButtonHandler();
        Button birdButtonBKS = findViewById(R.id.birdButtonBKS);
        Button nestButtonBKS = findViewById(R.id.nestButtonBKS);
        Button eggButtonBKS = findViewById(R.id.eggButtonBKS);
        Button housingButtonBKS = findViewById(R.id.housingButtonBKS);
        birdButtonBKS.setOnClickListener(bh);
        nestButtonBKS.setOnClickListener(bh);
        eggButtonBKS.setOnClickListener(bh);
        housingButtonBKS.setOnClickListener(bh);
    }

    private class ButtonHandler implements View.OnClickListener {
        public void onClick(View v) {
            Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            if (vb != null) {
                vb.vibrate(100);
            }

            switch(v.getId()) {
                case R.id.birdButtonBKS:
                    Intent intent1 = new Intent(BankSwallowInfoActivity.this, BankSwallowBirdActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.nestButtonBKS:
                    Intent intent2 = new Intent(BankSwallowInfoActivity.this, BankSwallowNestActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.eggButtonBKS:
                    Intent intent3 = new Intent(BankSwallowInfoActivity.this, BankSwallowEggActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.housingButtonBKS:
                    Intent intent4 = new Intent(BankSwallowInfoActivity.this, BankSwallowHousingActivity.class);
                    startActivity(intent4);
                    break;

            }
        }
    }
}
