package org.purplemartin.purplemartinid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BirdListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_listing);
        Button purpleMartinButton = findViewById(R.id.purpleMartinButton);
        Button treeSwallowButton = findViewById(R.id.treeSwallowButton);
        Button barnSwallowButton = findViewById(R.id.barnSwallowButton);
        Button europeanStarlingButton =  findViewById(R.id.europeanStarlingButton);
        Button bankSwallowButton = findViewById(R.id.bankSwallowButton);
        Button cliffSwallowButton = findViewById(R.id.cliffSwallowButton);
        Button greatCrestedFlycatcherButton = findViewById(R.id.greatCrestedFlycatcherButton);
        Button houseWrenButton = findViewById(R.id.houseWrenButton);
        Button easternBluebirdButton = findViewById(R.id.easternBluebirdButton);
        Button houseFinchButton = findViewById(R.id.houseFinchButton);
        Button houseSparrowButton = findViewById(R.id.houseSparrowButton);
        ButtonHandler bh = new ButtonHandler();
        purpleMartinButton.setOnClickListener(bh);
        treeSwallowButton.setOnClickListener(bh);
        barnSwallowButton.setOnClickListener(bh);
        europeanStarlingButton.setOnClickListener(bh);
        bankSwallowButton.setOnClickListener(bh);
        cliffSwallowButton.setOnClickListener(bh);
        greatCrestedFlycatcherButton.setOnClickListener(bh);
        houseWrenButton.setOnClickListener(bh);
        easternBluebirdButton.setOnClickListener(bh);
        houseFinchButton.setOnClickListener(bh);
        houseSparrowButton.setOnClickListener(bh);
    }

    private class ButtonHandler implements View.OnClickListener{
        public void onClick(View v){
            Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
            if(vb != null) {
                vb.vibrate(100);
            }

            switch(v.getId()) {
                case R.id.purpleMartinButton:
                    Intent intent1 = new Intent(BirdListingActivity.this, PurpleMartinInfoActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.treeSwallowButton:
                    Intent intent2 = new Intent(BirdListingActivity.this, TreeSwallowInfoActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.barnSwallowButton:
                    Intent intent3 = new Intent(BirdListingActivity.this, BarnSwallowInfoActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.europeanStarlingButton:
                    Intent intent4 = new Intent(BirdListingActivity.this, EuropeanStarlingInfoActivity.class);
                    startActivity(intent4);
                    break;
                case R.id.bankSwallowButton:
                    Intent intent5 = new Intent(BirdListingActivity.this, BankSwallowInfoActivity.class);
                    startActivity(intent5);
                    break;
                case R.id.cliffSwallowButton:
                    Intent intent6 = new Intent(BirdListingActivity.this, CliffSwallowInfoActivity.class);
                    startActivity(intent6);
                    break;
                case R.id.greatCrestedFlycatcherButton:
                    Intent intent7 = new Intent(BirdListingActivity.this, GreatCrestedFlycatcherInfoActivity.class);
                    startActivity(intent7);
                    break;
                case R.id.houseWrenButton:
                    Intent intent8 = new Intent(BirdListingActivity.this, HouseWrenInfoActivity.class);
                    startActivity(intent8);
                    break;
                case R.id.easternBluebirdButton:
                    Intent intent9 = new Intent(BirdListingActivity.this, EasternBluebirdInfoActivity.class);
                    startActivity(intent9);
                    break;
                case R.id.houseFinchButton:
                    Intent intent10 = new Intent(BirdListingActivity.this, HouseFinchInfoActivity.class);
                    startActivity(intent10);
                    break;
                case R.id.houseSparrowButton:
                    Intent intent11 = new Intent(BirdListingActivity.this, HouseSparrowInfoActivity.class);
                    startActivity(intent11);
                    break;
            }
        }
    }
}
