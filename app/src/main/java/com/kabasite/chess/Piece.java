package com.kabasite.chess;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.jetbrains.annotations.NotNull;


public class Piece extends androidx.appcompat.widget.AppCompatImageView {
    private int tileColor;
    private Drawable tileIcon;

    public Piece(@NonNull @NotNull Context context) {
        super(context);
    }
    public Piece(@NonNull @NotNull Context context, int tileColor) {
        super(context);
        this.tileColor = tileColor;
    }

    public Piece(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Piece(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public int getTileColor() {
        return tileColor;
    }

    public void setTileColor(int tileColor) {
        this.tileColor = tileColor;
    }

    public Drawable getTileIcon() {
        return tileIcon;
    }

    public void setTileIcon(Drawable tileIcon) {
        this.tileIcon = tileIcon;
    }
}
