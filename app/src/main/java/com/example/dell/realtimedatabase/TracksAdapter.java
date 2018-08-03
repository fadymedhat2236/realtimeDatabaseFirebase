package com.example.dell.realtimedatabase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TracksAdapter extends ArrayAdapter<Track> {
    public TracksAdapter(Activity context, ArrayList<Track> track)
    {
        super(context,0,track);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Track track=getItem(position);
        View listItemView=convertView;

        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.artistitem,parent,false);
        }

        TextView name=listItemView.findViewById(R.id.textViewName);
        name.setText(track.getTrackName());

        TextView genre=listItemView.findViewById(R.id.textViewGenre);
        genre.setText(String.valueOf(track.getRating()));

        return listItemView;
    }
}