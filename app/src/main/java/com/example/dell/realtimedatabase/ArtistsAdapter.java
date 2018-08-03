package com.example.dell.realtimedatabase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistsAdapter extends ArrayAdapter<Artist> {
    public ArtistsAdapter(Activity context, ArrayList<Artist> artists)
    {
        super(context,0,artists);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Artist artist=getItem(position);
        View listItemView=convertView;

        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.artistitem,parent,false);
        }

        TextView name=listItemView.findViewById(R.id.textViewName);
        name.setText(artist.getArtistName());

        TextView genre=listItemView.findViewById(R.id.textViewGenre);
        genre.setText(artist.getArtistGenre());

        return listItemView;
    }
}
