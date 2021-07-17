package com.bx001.levelupsociety;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bx001.levelupsociety.api.Api;
import com.bx001.levelupsociety.api.ApiImpl;
import com.bx001.levelupsociety.api.model.Banner;

import java.util.List;

public class Homepage extends AppCompatActivity {
  private final Api api = new ApiImpl();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_homepage);
    setBanners();
  }

  private void setBanners() {
    List<Banner> banners = api.getHomepageBanners();
//    ToDo set banners to the view
  }
}