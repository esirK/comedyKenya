package com.works.esir.poolup;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by esir on 11/01/2017.
 */

public class Players implements Parcelable {
    String player_name;
    int current_number,total_points;

    public Players(String player_name,int current_number,int total_points){
        this.player_name=player_name;
        this.current_number=current_number;
        this.total_points=total_points;
    }
    public Players(Parcel in) {
        this.player_name=in.readString();
        this.current_number=in.readInt();
        this.total_points=in.readInt();
    }

    public static final Creator<Players> CREATOR = new Creator<Players>() {
        @Override
        public Players createFromParcel(Parcel in) {
            return new Players(in);
        }

        @Override
        public Players[] newArray(int size) {
            return new Players[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(player_name);
        dest.writeInt(current_number);
        dest.writeInt(total_points);

    }
    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public int getCurrent_number() {
        return current_number;
    }

    public void setCurrent_number(int current_number) {
        this.current_number = current_number;
    }

    public int getTotal_points() {
        return total_points;
    }

    public void setTotal_points(int total_points) {
        this.total_points = total_points;
    }

}
