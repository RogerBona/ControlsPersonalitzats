package cat.dam.roger.controlspersonalitzats;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static ToggleButton falcons;
    static TextView espai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Exemple ToggleButton personalitzat");
        setContentView(R.layout.activity_main);

        falcons = (ToggleButton) findViewById(R.id.falcons);
        espai = (TextView) findViewById(R.id.espai);

        falcons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (falcons.isChecked())
                    espai.setText("Propulció espacial");
                else
                    espai.setText("Frenada espacial");
            }
        });


    }

}
