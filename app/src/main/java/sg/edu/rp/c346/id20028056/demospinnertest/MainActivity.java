package sg.edu.rp.c346.id20028056.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Spinner spnYesNo;
TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnYesNo=findViewById(R.id.spinner);
        tvDisplay=findViewById(R.id.tvDisplay);

        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
             String output="";
                switch (i){
                    case 0:
                        output="Spinner Item, Yes Selected";
                        break;
                    case 1:
                        output="Spinner Item, No Selected";
                        break;
                }
                tvDisplay.setText(output);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}