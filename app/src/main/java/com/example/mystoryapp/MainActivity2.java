package com.example.mystoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    WebView webview;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webview = (WebView)findViewById(R.id.webview);
//        WebSettings webSettings = webview.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        Intent intent = getIntent();
//        String url = intent.getStringExtra("file");
//        webview.loadUrl("file:///android_asset/" + url + ".html");
//        webview.setWebViewClient(new WebViewClient());
      int position = getIntent().getIntExtra("story key",0);
//        webview.loadUrl();
        if(position==0){
            webview.loadUrl("file:///android_asset/BirbalTheJust.html");
        }

        else if(position==1){
            webview.loadUrl("file:///android_asset/CompanionshipAmongFriends.html");
        }
        else if(position==2){
            webview.loadUrl("file:///android_asset/NasirWish.html");
        }
        else if(position==3){
            webview.loadUrl("file:///android_asset/TenaliRamanAndAHandfulOfGrain.html");
        }
        else if(position==4){
            webview.loadUrl("file:///android_asset/TenaliRamanAndTheWeightLifter.html");
        }
        else if(position==5){
            webview.loadUrl("file:///android_asset/TheBestFriend.html");
        }
        else if(position==6){
            webview.loadUrl("file:///android_asset/TheCrabAndTheStork.html");
        }
        else if(position==7){
            webview.loadUrl("file:///android_asset/TheCunningWolf.html");
        }
        else if(position==8){
            webview.loadUrl("file:///android_asset/TheFoolishGoat.html");
        }
        else if(position==9){
            webview.loadUrl("file:///android_asset/TheHonestWoodCutter.html");
        }
        else if(position==10){
            webview.loadUrl("file:///android_asset/TheOldTreeWithGreatMoral.html");
        }
        else if(position==11){
            webview.loadUrl("file:///android_asset/TheRichManSon.html");
        }
        else if(position==12){
            webview.loadUrl("file:///android_asset/TheThirstyCrow.html");
        }
        else if(position==13){
            webview.loadUrl("file:///android_asset/TortoiseAndBird.html");
        }
    }
}