package ac.id.mercubuana.deretfibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnHitung;
    TextInputEditText jumlDeret;
    ArrayList<String> hasil;
    int deretSkrng = 1;
    int deretSebelumnya = 0;
    TextView hasilFib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHitung = findViewById(R.id.materialButton);
        jumlDeret = findViewById(R.id.textInputEditText);
        hasilFib = findViewById(R.id.hasilFib);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil = new ArrayList<>();
                deretSkrng = 1;
                deretSebelumnya = 0;
                hasil.add(String.valueOf(deretSebelumnya));
                hasil.add(String.valueOf(deretSkrng));
                for (int i = 0; i < Integer.parseInt(String.valueOf(jumlDeret.getText()))-2; i++) {
                    int deret = deretSkrng + deretSebelumnya;
                    deretSebelumnya = deretSkrng;
                    deretSkrng = deret;
                    hasil.add(String.valueOf(deret));
                }
                Log.i("Hasil: ", hasil.toString());
                hasilFib.setText(hasil.toString());
            }
        });
    }
}