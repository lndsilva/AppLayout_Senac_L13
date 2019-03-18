package sp.senac.br.applayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.txtUsuario);
        senha = (EditText) findViewById(R.id.txtSenha);

        usuario.requestFocus();
    }

    public void fecharApp(View view) {
        finish();

    }

    public void sendMessage(View view){

    }
    public void entrarSistema(View view) {

        String txtUsuario, txtSenha;

        txtUsuario = usuario.getText().toString();
        txtSenha = senha.getText().toString();



        if ((txtUsuario.equals("senac")) && (txtSenha.equals("senac"))) {

            Toast toast = Toast.makeText(getApplicationContext(), "Obrigado por acessar o sistema", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 250);
            toast.show();

            Intent intent = new Intent(this,MinhaActivity.class);
            intent.putExtra("NomeDaPessoa",txtUsuario);

            startActivity(intent);

        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 250);
            toast.show();
            usuario.requestFocus();
            usuario.setText("");
            senha.setText("");
        }

        //Toast.makeText(getApplicationContext(),"Obrigado por acessar o sistema",Toast.LENGTH_SHORT).show();
    }
}
