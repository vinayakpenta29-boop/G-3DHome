package com.myhome3d;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        WebView webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        
        // Enable JavaScript to run the 3D engine
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        
        // Load your 3D home design
        webView.loadUrl("file:///android_asset/index.html");
    }
}
