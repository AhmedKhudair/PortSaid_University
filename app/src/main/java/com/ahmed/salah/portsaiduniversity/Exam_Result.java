package com.ahmed.salah.portsaiduniversity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import org.jetbrains.annotations.Nullable;

/**
 * Created by Ahmed on 3/13/2018.
 */

public class Exam_Result extends android.support.v4.app.Fragment {

    ProgressBar progressBar;
    String url = "http://195.246.39.39/misnatega/";
    WebView webView;

    private class MyWebViewClient extends WebViewClient {
        private MyWebViewClient() {
        }

        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
           progressBar.setVisibility(View.GONE);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.exam_result, null);
        this.webView = (WebView) v.findViewById(R.id.myWeb);
        this.progressBar = (ProgressBar) v.findViewById(R.id.myPro);
        this.webView.setWebViewClient(new MyWebViewClient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.loadUrl(this.url);
        return v;
    }



}
