package pv.android.app.eco.ecoapppv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VentasActivity extends AppCompatActivity implements View.OnClickListener{
    Button btncompras, btnalmacen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventas);

        btncompras = (Button) findViewById(R.id.btncompras);
        btncompras.setOnClickListener(this);
        btnalmacen = (Button) findViewById(R.id.btnalmacen);
        btnalmacen.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncompras:
                Intent intentcompra = new Intent(this, ComprasActivity.class);
                startActivity(intentcompra);
                break;
            case R.id.btnalmacen:
                Intent interalmacen = new Intent(this, AlmacenActivity.class);
                startActivity(interalmacen);
            default:
                break;
        }
    }
}
