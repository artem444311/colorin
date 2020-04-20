package com.example.coloring.utill;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

interface GraphicsDemo<GraphicsDemo1> extends LayoutInflater.Factory2, Window.Callback, KeyEvent.Callback, View.OnCreateContextMenuListener, ComponentCallbacks2 {
    void OnCreate(Bundle savedInstanceState);
}
