package pv.android.app.eco.ecoapppv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlmacenActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnventas, btncompras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almacen);

        btnventas = (Button) findViewById(R.id.btnventas3);
        btnventas.setOnClickListener(this);
        btncompras  = (Button) findViewById(R.id.btncompras3);
        btncompras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnventas3:
                Intent intentvta = new Intent(this, VentasActivity.class);
                startActivity(intentvta);
                break;
            case R.id.btncompras3:
                Intent intentcompras = new Intent(this, ComprasActivity.class);
                startActivity(intentcompras);
                break;
            default:
                break;
        }
    }
}
