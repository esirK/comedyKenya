package com.works.esir.poolup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by esir on 10/01/2017.
 */

public class PlayersSlideFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup=(ViewGroup)inflater.inflate(R.layout.player_slide_frag,container,false);
        Bundle args=getArguments();
        Players p=args.getParcelable("player_points");
        ((TextView)viewGroup.findViewById(R.id.player_points_tv)).setText("Total Points: "+p.total_points);
        ((TextView)viewGroup.findViewById(R.id.player_position_tv)).setText("Position: "+p.current_number);
        ((TextView)viewGroup.findViewById(R.id.player_slide_tv)).setText("NAME: "+p.player_name);
        ((TextView)viewGroup.findViewById(R.id.player_sum_tv)).setText("NAME: "+p.total_points);
        return viewGroup;
    }
}
