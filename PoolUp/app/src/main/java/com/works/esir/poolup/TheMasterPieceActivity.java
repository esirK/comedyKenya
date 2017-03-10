package com.works.esir.poolup;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by esir on 10/01/2017.
 */

public class TheMasterPieceActivity extends AppCompatActivity implements View.OnClickListener {
    CustomPagerAdapter customPagerAdapter;
    ViewPager viewPager;
    Button zero,one,two,three,four,five,six,seven,eight,nine;
    Button add,subtract;
    Players[]players;

    public void addPlayer(Players player){
        for(int i=0;i<players.length;i++){
            if(players[i]==null){
                players[i]=player;
                break;
            }
        }
    }
    public Players a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_slide);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initialize();
        players=new Players[3];//GET THIS INFOR FROM REGISTRATION PaGE
        String[]players={"Esir","Kings","Jane"};
        for(String a:players){
            Players esir=new Players(a,1,0);
            addPlayer(esir);
        }
//        add.setOnClickListener(this);

        //GET A PLAYER
        /*
        * Loop Through all the players useing the done button
        * Players a=this.players[0];
        a.getTotal_points();
        a.setTotal_points(20);
        * */
        a=this.players[0];

        add.setOnClickListener(this);
        customPagerAdapter=new CustomPagerAdapter(getSupportFragmentManager(),this,this.players);
        viewPager=(ViewPager)findViewById(R.id.pager);
        viewPager.setAdapter(customPagerAdapter);
    }

    private void initialize() {
        add=(Button)findViewById(R.id.btn_add_points);
        subtract=(Button)findViewById(R.id.btn_sub_points);
        zero=(Button)findViewById(R.id.btn_zero);
        one=(Button)findViewById(R.id.btn_one);
        two=(Button)findViewById(R.id.btn_two);
        three=(Button)findViewById(R.id.btn_three);
        four=(Button)findViewById(R.id.btn_four);
        five=(Button)findViewById(R.id.btn_five);
        six=(Button)findViewById(R.id.btn_six);
        seven=(Button)findViewById(R.id.btn_seven);
        eight=(Button)findViewById(R.id.btn_eight);
        nine=(Button)findViewById(R.id.btn_nine);
    }
    int result,num1,num2;
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_add_points:
        a.setTotal_points(10);
                break;
            case R.id.btn_sub_points:
                break;
            case R.id.btn_done:
                break;
            case R.id.btn_zero:
                break;
            case R.id.btn_one:
                break;
            case R.id.btn_two:
                break;
            case R.id.btn_three:
                break;
            case R.id.btn_four:
                break;
            case R.id.btn_five:
                break;
            case R.id.btn_seven:
                break;
            case R.id.btn_eight:
                break;
            case R.id.btn_nine:
                break;
        }
    }
}
