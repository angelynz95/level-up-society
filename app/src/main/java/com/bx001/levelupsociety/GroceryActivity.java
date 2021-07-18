package com.bx001.levelupsociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GroceryActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_grocery);
  }

  public void addToCart(View view) {
    Intent intent = new Intent(this, CartActivity.class);
    this.startActivity(intent);
  }

  public void goBack(View view) {
    this.finish();
  }
}