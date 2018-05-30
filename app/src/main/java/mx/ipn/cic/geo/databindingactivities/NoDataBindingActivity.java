package mx.ipn.cic.geo.databindingactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class NoDataBindingActivity extends AppCompatActivity {
    private Button firstNameNoDataBindingButton;
    private Button lastNameNoDataBindingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_databinding);

        // Cambiar propiedad Text de los Botones sin hacer uso de DatBinding
        firstNameNoDataBindingButton = (Button)this.findViewById(R.id.firstNameNoDataBindingButton);
        lastNameNoDataBindingButton = (Button)this.findViewById(R.id.lastNameNoDataBindingButton);
        firstNameNoDataBindingButton.setText("EJEMPLO DE CAMBIO PROPIEDAD TEXT");
        lastNameNoDataBindingButton.setText("SIN USAR DATABINDING");
    }
}
