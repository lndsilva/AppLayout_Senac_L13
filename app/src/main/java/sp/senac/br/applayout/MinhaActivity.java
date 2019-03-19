package sp.senac.br.applayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import sp.senac.br.applayout.R;

public class MinhaActivity extends AppCompatActivity {

    TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minha_layout);

        Intent intent = getIntent();
        String parametro = (String) intent.getSerializableExtra("NomeDaPessoa");

        TextView nome = (TextView) findViewById(R.id.txtNomePrincipal);
        TextView email = (TextView) findViewById(R.id.edtEmailPrincipal);

        nome.setText("Olá " + parametro + " Seja Bem Vindo!!!");

        email.requestFocus();
    }

    public void abrirJanelaWorld(View view) {

        Intent intent =  new Intent(MinhaActivity.this, WorldActivity.class);
        startActivity(intent);

    }
}
