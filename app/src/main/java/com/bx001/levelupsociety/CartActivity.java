package com.bx001.levelupsociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {
  private boolean grazerBadge;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_cart);

    Intent intent = getIntent();
    TextView discountText = findViewById(R.id.grocery_discount);
    TextView promoText = findViewById(R.id.grocery_promo);
    TextView totalPrice = findViewById(R.id.grocery_total);
    grazerBadge = intent.getBooleanExtra("grazerBadge", false);
    if (grazerBadge) {
      discountText.setVisibility(View.VISIBLE);
      promoText.setVisibility(View.VISIBLE);
      totalPrice.setText("£ 1.04");
    } else {
      discountText.setVisibility(View.INVISIBLE);
      promoText.setVisibility(View.INVISIBLE);
      totalPrice.setText("£ 1.30");
    }
  }

  public void pay(View view) {
    Intent intent;
    if (grazerBadge) {
      intent = new Intent(this, HomepageActivity.class);
    } else {
      intent = new Intent(this, AchievementActivity.class);
    }
    intent.putExtra("grazerBadge", grazerBadge);
    this.startActivity(intent);
  }

  public void goBack(View view) {
    this.finish();
  }
}