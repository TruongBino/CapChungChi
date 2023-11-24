package com.example.capchungchi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CertificateActivity extends AppCompatActivity {
    private ImageView certificateImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);
        certificateImageView = findViewById(R.id.certificateImageView);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        String taskName = intent.getStringExtra("taskName");
        createCertificate(userName, taskName);
    }

    private void createCertificate(String userName, String taskName) {
        // Tạo bitmap từ mẫu chứng chỉ
        Bitmap certificateBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.certificate_template); // Thay your_image bằng tên hình ảnh thực tế
        Bitmap mutableBitmap = certificateBitmap.copy(Bitmap.Config.ARGB_8888, true);
        // Tạo canvas để vẽ lên bitmap
        Canvas canvas = new Canvas(mutableBitmap);

        // Vẽ thông tin lên chứng chỉ
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setTextSize(150);
        canvas.drawText("" + taskName, 1000, 1000, paint);
        canvas.drawText("" + userName, 1100, 1150, paint);
        // Vẽ thêm thông tin khác


        // Hiển thị chứng chỉ lên ImageView
        certificateImageView.setImageBitmap(mutableBitmap);
    }
}