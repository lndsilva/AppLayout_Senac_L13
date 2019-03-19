package sp.senac.br.applayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class GridListViewActivity extends AppCompatActivity {

    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_list_view_layout);

        gridView = (GridView) findViewById(R.id.glvPlanetas);

        String[] planetas = {"Mercúrio", "Venus", "Terra", "Marte", "Jupiter", "Saturno", "Urano", "Netuno", "Sol", "Plutão", "Mercúrio", "Venus", "Terra", "Marte", "Jupiter", "Saturno", "Urano", "Netuno", "Sol", "Plutão",};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, planetas);

        gridView.setAdapter(adapter);
    }
}
