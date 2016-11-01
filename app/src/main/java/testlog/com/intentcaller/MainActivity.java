package testlog.com.intentcaller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button sendBtn;
    EditText et_name;
    EditText et_age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBtn = (Button) findViewById(R.id.sendBtn);
        sendBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        et_name = (EditText)findViewById(R.id.et_name);
        et_age = (EditText)findViewById(R.id.et_age);

        Intent intent = new Intent(this, IntentCallee.class);
        intent.putExtra("name", et_name.getText());
        intent.putExtra("age", et_age.getText());
        startActivity(intent);

    }
}
