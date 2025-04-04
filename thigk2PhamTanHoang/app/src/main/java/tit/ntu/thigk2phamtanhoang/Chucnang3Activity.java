package tit.ntu.thigk2phamtanhoang;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Chucnang3Activity extends AppCompatActivity {
    ListView listViewCacMon;
    ArrayList<String> dsCacMon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chucnang3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
            listViewCacMon = findViewById(R.id.LVmon);
            dsCacMon = new ArrayList<String>();
            dsCacMon.add("Tin học đại cương");
            dsCacMon.add("Lập Trình Java");
            dsCacMon.add("Phát triển ứng dụng web");
            dsCacMon.add("Khai phá dữ liệu lớn");
            dsCacMon.add("Kinh tế chính trị Mác -Lê nin");
            dsCacMon.add("...");

            ArrayAdapter<String> adapterMon;
            adapterMon = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsCacMon);
            listViewCacMon.setAdapter(adapterMon);
            listViewCacMon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String giaTriDuocChon =  dsCacMon.get(position);
                    Toast.makeText(Chucnang3Activity.this, giaTriDuocChon, Toast.LENGTH_SHORT).show();

                }
                                                  }
            );
        }
    }
