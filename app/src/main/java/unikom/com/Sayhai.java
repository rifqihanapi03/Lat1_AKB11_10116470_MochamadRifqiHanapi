package unikom.com;
//NIM     : 10116470
//Nama    : Mochamad Rifqi Hanapi
//Kelas   : IF-11 / AKB-11
//Tanggal : 7-April-2019

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

class Sayhai extends AppCompatActivity {

    private String KEY_NAME = "kamu";
    private String nama;
    TextView textSayhai;
    Button btn_Sayhai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);

        textSayhai = (TextView) findViewById(R.id.txtSayhai);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        textSayhai.setText("Beres! Sekarang " + nama + " udah bisa ngecek penggunan HP mu tiap hari buat bantu kamu ngatur waktu :)");

        btn_Sayhai = (Button) findViewById(R.id.Oke);
        btn_Sayhai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sayhai.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
            }
        });
    }
}
