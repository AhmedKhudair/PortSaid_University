package com.ahmed.salah.portsaiduniversity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class News extends AppCompatActivity {

    ProgressBar progressBar;

    private class MyWebViewClient extends WebViewClient {
        private MyWebViewClient() {
        }

        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            News.this.progressBar.setVisibility(View.GONE);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        WebView webView = (WebView) findViewById(R.id.webview);
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar3);
        webView.setWebViewClient(new MyWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(getIntent().getExtras().getString("Link"));
    }
}
