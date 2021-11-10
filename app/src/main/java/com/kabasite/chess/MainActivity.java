package com.kabasite.chess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Piece> pieceList = new ArrayList<>(64);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridViewId);
        initPieces();
        GridAdapter adapter = new GridAdapter(this,0, pieceList);
        gridView.setAdapter(adapter);
    }

    private void initPieces(){
        for(int i=0;i<64;++i){
            pieceList.add(new Piece(this, 0));
        }
        for(int i=0;i<64;i=i+16) for(int j=1;j<8;j=j+2) pieceList.get(j+i).setTileColor(1);
        for(int i=8;i<64;i=i+16) for(int j=0;j<8;j=j+2) pieceList.get(j+i).setTileColor(1);
        pieceList.get(0).setTileIcon(getDrawable(R.drawable.b_rook));
        pieceList.get(1).setTileIcon(getDrawable(R.drawable.b_knight));
        pieceList.get(2).setTileIcon(getDrawable(R.drawable.b_bishop));
        pieceList.get(3).setTileIcon(getDrawable(R.drawable.b_queen));
        pieceList.get(4).setTileIcon(getDrawable(R.drawable.b_king));
        pieceList.get(5).setTileIcon(getDrawable(R.drawable.b_bishop));
        pieceList.get(6).setTileIcon(getDrawable(R.drawable.b_knight));
        pieceList.get(7).setTileIcon(getDrawable(R.drawable.b_rook));
        for(int i=8;i<16;++i) pieceList.get(i).setTileIcon(getDrawable(R.drawable.b_pawn));
        pieceList.get(56).setTileIcon(getDrawable(R.drawable.w_rook));
        pieceList.get(57).setTileIcon(getDrawable(R.drawable.w_knight));
        pieceList.get(58).setTileIcon(getDrawable(R.drawable.w_bishop));
        pieceList.get(59).setTileIcon(getDrawable(R.drawable.w_queen));
        pieceList.get(60).setTileIcon(getDrawable(R.drawable.w_king));
        pieceList.get(61).setTileIcon(getDrawable(R.drawable.w_bishop));
        pieceList.get(62).setTileIcon(getDrawable(R.drawable.w_knight));
        pieceList.get(63).setTileIcon(getDrawable(R.drawable.w_rook));
        for(int i=48;i<56;++i) pieceList.get(i).setTileIcon(getDrawable(R.drawable.w_pawn));
    }
}