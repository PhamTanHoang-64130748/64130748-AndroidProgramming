package tit.ntu.thigk2phamtanhoang;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Chucnang2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chucnang2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XuLyCong(View view){
        EditText editTextDGK = findViewById(R.id.edtDGK);
        EditText editTextDCK = findViewById(R.id.edtDCK);
        EditText editTextSoKetQua = findViewById(R.id.edtKQ);
// Lấy dữ liệu về
        String strA = editTextDGK.getText().toString();
        String strB = editTextDCK.getText().toString();
        // Chuyển dữ liệu
        int so_A= Integer.parseInt(strA);
        int so_B= Integer.parseInt(strB);

        int Tong = (int)((so_A * 0.5) + (so_B * 0.5));
        String strTong = String.valueOf(Tong);
        editTextSoKetQua.setText(strTong);
    }
}
