package com.bx001.levelupsociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BadgeActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_badge);
  }

  public void viewProgressionMap(View view) {
//    Intent intent = new Intent(this, )
//    ToDo
  }

  public void getBadge(View view) {
//    ToDo
  }

  public void goBack(View view) {
    this.finish();
  }
}