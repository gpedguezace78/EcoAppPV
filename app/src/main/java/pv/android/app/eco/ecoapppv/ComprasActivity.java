package pv.android.app.eco.ecoapppv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComprasActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnventas, btnalmacen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);

        btnventas = (Button) findViewById(R.id.btnventas2);
        btnventas.setOnClickListener(this);
        btnalmacen  = (Button) findViewById(R.id.btnalmacen2);
        btnalmacen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnventas2:
                Intent intentvta = new Intent(this, VentasActivity.class);
                startActivity(intentvta);
                break;
            case R.id.btnalmacen2:
                Intent intentalmacen = new Intent(this, AlmacenActivity.class);
                startActivity(intentalmacen);
                break;
            default:
                break;
        }
    }
}
