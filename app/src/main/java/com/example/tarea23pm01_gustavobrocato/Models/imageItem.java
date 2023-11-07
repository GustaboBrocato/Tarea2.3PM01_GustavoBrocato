package com.example.tarea23pm01_gustavobrocato.Models;

import android.graphics.Bitmap;

public class imageItem {
    private Bitmap imageBitmap;
    private String itemDescription;

    public imageItem(Bitmap imageBitmap, String itemDescription) {
        this.itemDescription = itemDescription;
        this.imageBitmap = imageBitmap;
    }

    public Bitmap getImageBitmap() {
        return imageBitmap;
    }

    public String getItemDescription() {
        return itemDescription;
    }
}
