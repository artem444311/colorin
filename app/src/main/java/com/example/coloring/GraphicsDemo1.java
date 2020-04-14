package com.example.coloring;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

interface GraphicsDemo1 extends LayoutInflater.Factory2, Window.Callback, KeyEvent.Callback, View.OnCreateContextMenuListener, ComponentCallbacks2, GraphicsDemo {
    void OnCreate(Bundle savedInstanceState);
}
