package com.bx001.levelupsociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BadgeDetailActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_badge_detail);

    Intent intent = getIntent();
    boolean grazerBadge = intent.getBooleanExtra("grazerBadge", false);
    ImageView badgeImage = findViewById(R.id.badge_image);
    if (grazerBadge) {
      badgeImage.setImageDrawable(getDrawable(R.drawable.page_grazer_unlocked));
    } else {
      badgeImage.setImageDrawable(getDrawable(R.drawable.page_graze_locked));
    }
  }

  public void goBack(View view) {
    this.finish();
  }
}