package mx.ipn.cic.geo.databindingactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button noDataBindingStartButton;
    private Button dataBindingFirstSampleStartButton;
    private Button dataBindingSecondSampleStartButton;
    private Button dataBindingThirdSampleStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noDataBindingStartButton = (Button)findViewById(R.id.noDataBindingStartButton);
        dataBindingFirstSampleStartButton = (Button)findViewById(R.id.dataBindingFirstSampleStartButton);
        dataBindingSecondSampleStartButton = (Button)findViewById(R.id.dataBindingSecondSampleStartButton);
        dataBindingThirdSampleStartButton = (Button)findViewById(R.id.dataBindingThirdSampleStartButton);
        SetOnClickListeners();
    }

    private void SetOnClickListeners()
    {
        noDataBindingStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NoDataBindingActivity.class);
                startActivity(intent);
            }
        });

        dataBindingFirstSampleStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DataBindingFirstSampleActivity.class);
                startActivity(intent);
            }
        });

        dataBindingSecondSampleStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DataBindingSecondSampleActivity.class);
                startActivity(intent);
            }
        });

        dataBindingThirdSampleStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DataBindingThirdSampleActivity.class);
                startActivity(intent);
            }
        });

    }
}
