package com.example.coloring;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;

public class Bitmap {
    public void onClick(View view) {
        ImageView imageView = null;
        imageView = (ImageView) imageView.findViewById();
        Bitmap bitmap = Bitmap.createBitmap(100, 100,
                Config.ARGB_8888);
        bitmap.eraseColor(Color.BLUE);
        imageView.setImageBitmap(bitmap);
    }

    private void eraseColor(int blue) {
    }

    public class Config {
    }
} Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.catpic);
    int mPhotoWidth = bitmap.getWidth();
    int mPhotoHeight = bitmap.getHeight();
}