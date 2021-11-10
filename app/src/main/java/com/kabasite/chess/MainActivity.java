package com.kabasite.chess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridViewId);

        ArrayList<Piece> pieceList = new ArrayList<>();
        for(int i=0;i<64;++i){
            pieceList.add(new Piece(this, 0));
        }
        for(int i=0;i<64;i=i+16) for(int j=1;j<8;j=j+2) pieceList.get(j+i).setTileColor(1);
        for(int i=8;i<64;i=i+16) for(int j=0;j<8;j=j+2) pieceList.get(j+i).setTileColor(1);
        
        GridAdapter adapter = new GridAdapter(this,0, pieceList);
        gridView.setAdapter(adapter);
    }
}