package tit.ntu.kidlearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Đặt giao diện màn hình chờ (Splash)

        // Chờ 1 giây trước khi chuyển sang HomePage
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, HomePage.class);
                startActivity(intent);
                finish(); // Đóng MainActivity để không quay lại màn hình chờ
            }
        }, 2000); //
    }
}