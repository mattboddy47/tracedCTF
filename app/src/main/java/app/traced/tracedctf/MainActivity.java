package app.traced.tracedctf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private TextView loginLockedTV;
    private TextView attemptsLeftTV;
    private TextView numberOfRemainingLoginAttemptsTV;
    int numberOfRemainingLoginAttempts = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialise();
    }

    public void authenticateLogin(View view) {
        Intent loginIntent = new Intent(this, LoggedInActivity.class);
        // username and password 1
        APIKey apiKey = new APIKey(username.getText().toString(), password.getText().toString(), this);

       if (apiKey.getKey() != null) {
            //username7 and password7 success
            loginIntent.putExtra("apiKey", apiKey.getKey());
            startActivity(loginIntent);
        } else {
            String failureMessage;
            if (numberOfRemainingLoginAttempts == 3) {
                failureMessage ="WRONG!";
            } else if (numberOfRemainingLoginAttempts == 2){
                failureMessage ="Think about the strings you're looking for!";
            }  else if (numberOfRemainingLoginAttempts == 1){
                failureMessage ="Last chance!";
            } else {
                failureMessage = "INCORRECT!";
            }
            Toast.makeText(getApplicationContext(), failureMessage,
                    Toast.LENGTH_LONG).show();
            numberOfRemainingLoginAttempts--;
            attemptsLeftTV.setVisibility(View.VISIBLE);
            numberOfRemainingLoginAttemptsTV.setVisibility(View.VISIBLE);
            numberOfRemainingLoginAttemptsTV.setText(Integer.toString(numberOfRemainingLoginAttempts));

            if (numberOfRemainingLoginAttempts == 0) {
                login.setEnabled(false);
                loginLockedTV.setVisibility(View.VISIBLE);
                loginLockedTV.setBackgroundColor(Color.RED);
                loginLockedTV.setText("LOGIN LOCKED!!!");
            }
        }
    }
    private void initialise() {
        username =  findViewById(R.id.editTextUsername);
        password =  findViewById(R.id.editTextPassword);
        login =  findViewById(R.id.buttonLogin);
        loginLockedTV =  findViewById(R.id.textViewLoginLocked);
        attemptsLeftTV =  findViewById(R.id.textViewAttemptsLeft);
        numberOfRemainingLoginAttemptsTV =  findViewById(R.id.textViewRemainingLoginAttempts);
        numberOfRemainingLoginAttemptsTV.setText(Integer.toString(numberOfRemainingLoginAttempts));
    }
}
