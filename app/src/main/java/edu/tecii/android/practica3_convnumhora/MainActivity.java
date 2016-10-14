package edu.tecii.android.practica3_convnumhora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.inputNumber)
    EditText inputNumber;
    @Bind(R.id.btnConvertion)
    Button btnConvertion;
    @Bind(R.id.inputHour)
    TextView inputHour;
    @Bind(R.id.inputMinut)
    TextView inputMinut;
    @Bind(R.id.inputSecond)
    TextView inputSecond;
    @Bind(R.id.inputDecSecond)
    TextView inputDecSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnConvertion)
    public void convertion(){
        String num = inputNumber.getText().toString();
        if (!num.isEmpty()){
            int hr, min, sec, dsec;
            double numdec = Double.parseDouble(num);

            hr = (int)(numdec);
            numdec = (numdec - hr) * 60;
            min = (int)(numdec);
            numdec = (numdec - min) * 60;
            sec = (int)(numdec);
            numdec = (numdec - sec) * 60;
            dsec = (int)(numdec);

            String h = "";
            String m = "";
            String s = "";
            String ds = "";
            h = "El total de horas es: " + hr + "";
            m = "El total de minutos es: " + min + "";
            s = "El total de segundos es: " + sec + "";
            ds = "El total de decimos de segundo es: " + dsec + "";

            inputHour.setText(h);
            inputMinut.setText(m);
            inputSecond.setText(s);
            inputDecSecond.setText(ds);

        }
    }

}
