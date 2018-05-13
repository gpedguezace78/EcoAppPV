package pv.android.app.eco.ecoapppv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnAbrirVta;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbrirVta = (Button) findViewById(R.id.BtnIngresar);
        btnAbrirVta.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.BtnIngresar:
                Intent intentvta = new Intent(this, VentasActivity.class);
                startActivity(intentvta);
                break;
            default:
                break;
        }
    }
}
