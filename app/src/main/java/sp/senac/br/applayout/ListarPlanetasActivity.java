package sp.senac.br.applayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class ListarPlanetasActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_planetas_layout);


        listView = (ListView) findViewById(R.id.lstPlanetas);

        String[] planetas = {"Mercúrio", "Venus", "Terra", "Marte", "Jupiter", "Saturno", "Urano", "Netuno", "Sol","Plutão",};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, planetas);

        listView.setAdapter(adapter);
    }
}
