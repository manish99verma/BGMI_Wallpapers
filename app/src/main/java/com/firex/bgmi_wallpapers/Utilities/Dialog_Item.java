package com.firex.bgmi_wallpapers.Utilities;


import androidx.annotation.NonNull;

public class Dialog_Item {
    public final String text;
    public final int icon;

    public Dialog_Item(String text, Integer icon) {
        this.text = text;
        this.icon = icon;
    }

    @NonNull
    @Override
    public String toString() {
        return text;
    }

}