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

public class LamThemActivity extends AppCompatActivity {
    ListView listViewGame;
    ArrayList<String> dsGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lam_them);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listViewGame = findViewById(R.id.lvGame);
        dsGame = new ArrayList<String>();
        dsGame.add("Đột kích");
        dsGame.add("Valorant");
        dsGame.add("Liên minh");
        dsGame.add("Wuthering wave");
        dsGame.add("...");

        ArrayAdapter<String> adapterGame;
        adapterGame = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsGame);
        listViewGame.setAdapter(adapterGame);
        listViewGame.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giaTriDuocChon =  dsGame.get(position);
                Toast.makeText(LamThemActivity.this, giaTriDuocChon, Toast.LENGTH_SHORT).show();

            }
        }
        );
    }
}

