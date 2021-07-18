package com.bx001.levelupsociety;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

import java.io.IOException;

public class QrScannerActivity extends AppCompatActivity {
  private SurfaceView surfaceView;
  private BarcodeDetector barcodeDetector;
  private CameraSource cameraSource;
  private static final int REQUEST_CAMERA_PERMISSION = 201;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_qr_scanner);
    surfaceView = findViewById(R.id.surfaceView);
  }

  @Override
  protected void onPause() {
    super.onPause();
    cameraSource.release();
  }

  @Override
  protected void onResume() {
    super.onResume();
    initQrScanner();
  }

  private void initQrScanner() {
    Toast.makeText(getApplicationContext(), "Scan a Growcherish QR code", Toast.LENGTH_SHORT).show();
    barcodeDetector = new BarcodeDetector.Builder(this)
            .setBarcodeFormats(Barcode.ALL_FORMATS)
            .build();

    cameraSource = new CameraSource.Builder(this, barcodeDetector)
            .setRequestedPreviewSize(1080, 1920)
            .setAutoFocusEnabled(true) //you should add this feature
            .build();

    surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
      @Override
      public void surfaceCreated(SurfaceHolder holder) {
        try {
          if (ActivityCompat.checkSelfPermission(QrScannerActivity.this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
            cameraSource.start(surfaceView.getHolder());
          } else {
            ActivityCompat.requestPermissions(QrScannerActivity.this, new
                    String[]{Manifest.permission.CAMERA}, REQUEST_CAMERA_PERMISSION);
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

      @Override
      public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
      }

      @Override
      public void surfaceDestroyed(SurfaceHolder holder) {
        cameraSource.stop();
      }
    });

    barcodeDetector.setProcessor(new Detector.Processor<Barcode>() {
      @Override
      public void release() {
      }

      @Override
      public void receiveDetections(Detector.Detections<Barcode> detections) {
        final SparseArray<Barcode> barcodes = detections.getDetectedItems();
        if (barcodes.size() != 0) {
          String qrCodeValue = barcodes.valueAt(0).displayValue;
//          ToDo open cart
        }
      }
    });
  }
}