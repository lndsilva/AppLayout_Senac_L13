package sp.senac.br.applayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ListarImagensActivity extends AppCompatActivity {

    TextView listdata;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_imagens_layout);

        listdata = findViewById(R.id.listdata);
        imageView = findViewById(R.id.imageView);
        Intent intent = getIntent();
        String receivedName = intent.getStringExtra("nome");
        int receivedImage = intent.getIntExtra("imagem", 0);

        listdata.setText(receivedName);
        imageView.setImageResource(receivedImage);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
}
