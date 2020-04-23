package app.traced.tracedctf;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class LoggedInActivity extends AppCompatActivity {
TextView flagTextView;
TextView ascii;
String flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        initialise();
    }
    protected void initialise(){
        flag = getIntent().getStringExtra("apiKey");
        flagTextView = findViewById(R.id.flag);
        ascii = findViewById(R.id.ascii);
        flagTextView.setText(flag);

        if (flag.length() > 9){
            ascii.setText(getResources().getString(R.string.aliveCow));
        }
    }

}
