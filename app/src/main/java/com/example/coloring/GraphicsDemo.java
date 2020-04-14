package com.example.coloring;

interface GraphicsDemo {
    static public class GraphicsView extends View {
        public GraphicsView(Canvas.GraphicsDemo context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            // ваши команды для рисования
        }
    }
}
