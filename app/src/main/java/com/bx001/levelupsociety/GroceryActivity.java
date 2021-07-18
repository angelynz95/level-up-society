package com.bx001.levelupsociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GroceryActivity extends AppCompatActivity {
  private boolean grazerBadge;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_grocery);

    Intent intent = getIntent();
    TextView discountText = findViewById(R.id.grocery_discount);
    TextView promoText = findViewById(R.id.grocery_promo);
    grazerBadge = intent.getBooleanExtra("grazerBadge", false);
    if (grazerBadge) {
      discountText.setVisibility(View.VISIBLE);
      promoText.setVisibility(View.VISIBLE);
    } else {
      discountText.setVisibility(View.INVISIBLE);
      promoText.setVisibility(View.INVISIBLE);
    }
  }

  public void addToCart(View view) {
    Intent intent = new Intent(this, CartActivity.class);
    intent.putExtra("grazerBadge", grazerBadge);
    this.startActivity(intent);
  }

  public void goBack(View view) {
    this.finish();
  }
}