package testlog.com.intentcaller;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by next on 2016. 11. 1..
 */
public class IntentCallee extends AppCompatActivity implements View.OnClickListener{


    TextView text_name;
    TextView text_age;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentcallee);

        Button finishBtn = (Button)findViewById(R.id.finishBtn);
        finishBtn.setOnClickListener(this);

        this.setData();

    }

    public void setData(){

        Intent intent = getIntent();
        String name = intent.getExtras().get("name").toString();
        String age = intent.getExtras().get("age").toString();

        text_name = (TextView)findViewById(R.id.Text_name);
        text_age = (TextView)findViewById(R.id.Text_age);

        text_name.setText(name);
        text_age.setText(age);
        
    }


    @Override
    public void onClick(View view) {
        finish();
    }
}
