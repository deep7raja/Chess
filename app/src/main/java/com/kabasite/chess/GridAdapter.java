package com.kabasite.chess;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends ArrayAdapter<Piece> {
    private ArrayList<Piece> pieceList;
    private Context mContext;

    public GridAdapter(@NonNull Context context, int resource, @NonNull List<Piece> objects) {
        super(context, resource, objects);
        pieceList = (ArrayList<Piece>) objects;
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_piece_view, parent, false);
        }
        if(pieceList.get(position).getTileColor()==0){
            listitemView.findViewById(R.id.pieceViewId).setBackgroundColor(mContext.getResources().getColor(R.color.c_tile_b));
        }
        else{
            listitemView.findViewById(R.id.pieceViewId).setBackgroundColor(mContext.getResources().getColor(R.color.c_tile_w));

        }
        return listitemView;
    }


}
