package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    //Global or module level variables
    private EditText editTextName, editTextAge;
    private TextView textViewMessage;

    //onCreate = main() function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView shows the UI
        // R = resources class
        setContentView(R.layout.activity_main);

        //Linking UI to programme
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textViewMessage = (TextView) findViewById(R.id.TextViewMessage);
    }
    //Butttttttttttttttttttttttttttttttttttttttttoooooooooooonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
    //method that handle View must have a View parameter
    public void displayMessage(View view){
        String name;
        int age;
        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString())+1 ;
        textViewMessage.setText("Hi "+ name + ". Your age is "+ age );
    }


}
