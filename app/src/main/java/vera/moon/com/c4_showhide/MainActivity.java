package vera.moon.com.c4_showhide;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        texto = (TextView)findViewById(R.id.textView);
    }

    public void showElement(View v){

        texto.setVisibility(View.VISIBLE);

    }
    public void hideElement(View v){

        texto.setVisibility(View.INVISIBLE);

    }
}
