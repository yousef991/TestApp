package almutairi.yousef.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bt;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) this.findViewById(R.id.button);
        bt.setText("Click here");

        et = (EditText) findViewById(R.id.editText);

        //////////////
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               et.setText("...");
            }
        });
    }
}
