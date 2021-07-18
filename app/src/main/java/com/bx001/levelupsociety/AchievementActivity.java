package com.bx001.levelupsociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AchievementActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_achievement);
  }

  public void goBack(View view) {
    Intent intent = new Intent(this, HomepageActivity.class);
    this.startActivity(intent);
  }
}