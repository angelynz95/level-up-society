package com.bx001.levelupsociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CartActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_cart);
  }

  public void pay(View view) {
    Intent intent = new Intent(this, AchievementActivity.class);
    this.startActivity(intent);
  }

  public void goBack(View view) {
    this.finish();
  }
}