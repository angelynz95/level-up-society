package com.bx001.levelupsociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bx001.levelupsociety.api.Api;
import com.bx001.levelupsociety.api.ApiImpl;
import com.bx001.levelupsociety.api.model.Banner;

import java.util.List;

public class HomepageActivity extends AppCompatActivity {
  private final Api api = new ApiImpl();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_homepage);
    setBanners();
  }

  public void getBadges(View view) {
    Intent intent = new Intent(this, BadgeActivity.class);
    startActivity(intent);
  }

  public void scanQrCode(View view) {
    Intent intent = new Intent(this, QrScannerActivity.class);
    startActivity(intent);
  }

  private void setBanners() {
    List<Banner> banners = api.getHomepageBanners();
//    ToDo set banners to the view
  }
}