package com.bx001.levelupsociety;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BadgeActivity extends AppCompatActivity {
  private boolean grazerBadge;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_badge);

    Intent intent = getIntent();
    grazerBadge = intent.getBooleanExtra("grazerBadge", false);
    ImageView badgesImage = findViewById(R.id.badges_image);
    if (grazerBadge) {
      badgesImage.setImageDrawable(getDrawable(R.drawable.page_badges_unlocked));
    } else {
      badgesImage.setImageDrawable(getDrawable(R.drawable.page_badges_locked));
    }
  }

  public void viewProgressionMap(View view) {
    String progressionMap = grazerBadge ? "https://photos.app.goo.gl/SXHWRJHsR9Uaq2YGA" : "https://photos.app.goo.gl/irHNenrsJeoji1867";
    Uri uri = Uri.parse(progressionMap);
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    intent.putExtra("grazerBadge", grazerBadge);
    this.startActivity(intent);
  }

  public void getBadge(View view) {
    Intent intent = new Intent(this, BadgeDetailActivity.class);
    intent.putExtra("grazerBadge", grazerBadge);
    this.startActivity(intent);
  }

  public void goBack(View view) {
    this.finish();
  }
}