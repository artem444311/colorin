package com.example.coloring.utill;

import android.app.Activity;
import android.os.Bundle;

public class Canvas {
    public static class GraphicsDemo<GraphicsDemo1> extends Activity implements com.example.coloring.utill.GraphicsDemo<GraphicsDemo1> {
        @Override
        public void OnCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(new com.example.coloring.GraphicsDemo.GraphicsView(this));
        }

        private void setContentView(com.example.coloring.GraphicsDemo.GraphicsView graphicsView) {
        }

    }
    
}
