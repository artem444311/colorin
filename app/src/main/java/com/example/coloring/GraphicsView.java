package com.example.coloring;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEventSource;

interface GraphicsView extends Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource {
}
