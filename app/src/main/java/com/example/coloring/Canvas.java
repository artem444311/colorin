package com.example.coloring;

import android.app.Activity;
import android.os.Bundle;

public class Canvas {
    public class GraphicsDemo extends Activity implements GraphicsDemo1 {
        @Override
        public void OnCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(new GraphicsView(this));
        }

        private void setContentView(GraphicsView graphicsView) {
        }

    }
    
}
