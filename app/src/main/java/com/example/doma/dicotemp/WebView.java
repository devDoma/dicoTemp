package com.example.doma.dicotemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class WebView extends AppCompatActivity {

    private android.webkit.WebView mWebView;
    private WebSettings mWebSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        mWebView = (android.webkit.WebView) findViewById(R.id.webView_test);
        mWebView.setWebViewClient(new WebViewClient());
        mWebSetting = mWebView.getSettings();
        mWebSetting.setJavaScriptEnabled(true);
        mWebView.addJavascriptInterface(new JsObject(), "injectedObject");
        mWebView.loadData("", "text/html", null);
//        mWebView.loadUrl("javascript:alert(injectedObject.toString())");
        mWebView.loadUrl("http://disfrutacorea.com");

    }
    class JsObject {
        @JavascriptInterface
        public String toString() { return "fuck"; }
    }
}
