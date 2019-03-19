package sp.senac.br.applayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListarImagemActivity extends AppCompatActivity {

    ListView listView;

    String[] frutasNames = {"Maça","Laranja","Kiwi","Melância","Banana"};
    int[] frutasImages = {R.drawable.apple,R.drawable.oranges,R.drawable.kiwi,R.drawable.watermelon,R.drawable.banana};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_imagem_layout);

        //finding listview
        listView = findViewById(R.id.lstImagens);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),ListarImagensActivity.class);
                intent.putExtra("name",frutasNames[i]);
                intent.putExtra("image",frutasImages[i]);
                startActivity(intent);

            }
        });
    }

    private class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return frutasImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.imagem_data,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.fruits);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(frutasNames[i]);
            image.setImageResource(frutasImages[i]);
            return view1;



        }
    }

}

