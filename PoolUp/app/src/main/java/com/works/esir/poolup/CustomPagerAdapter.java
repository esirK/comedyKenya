package com.works.esir.poolup;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by esir on 10/01/2017.
 */
public class CustomPagerAdapter extends FragmentStatePagerAdapter {

    protected Context mContext;
    public Players[]playerses;
    public CustomPagerAdapter(FragmentManager fragmentManager, Context context,Players []playerses) {
        super(fragmentManager);
        mContext=context;
        this.playerses=playerses;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=new PlayersSlideFragment();
        Bundle args=new Bundle();
        //Players players=new Players("es",3,0);
        args.putParcelable("player_points",playerses[position]);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
