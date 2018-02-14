package com.example.narroju.heroins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

   public  static final String EXTRA_MESSAGE = "DishaPatani";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*we call the method from a button View using Onclick:"method(button)name", we must need the
    same method for future use also in another Button or View with OnClick attribute in it, so insted
    of calling that method using particular view only ex: dishaBaby(Botton b) we can use the parent class
    of all the Views that is View itself.
     */
        public void dishaBaby(View v){ //The parameter gets the argument from the View through which it is called

             TextView DishaPatani = (TextView) findViewById(R.id.Disha_Button);// Disha_Button is a static inner field
            // in static class activity of R.java file where that field button is given an int value

            EditText Search = (EditText) findViewById(R.id.Edit_search);

            Search.setText(DishaPatani.getText());

            EditText input = (EditText) findViewById(R.id.Edit_search);

            String typedText = input.getText().toString();

            Toast.makeText(this,  typedText + "opened", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this, DishaPatani.class);
            Button intentMsg = (Button) findViewById(R.id.Disha_Button);
            String message = intentMsg.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);

        }

        public void AnuBaby(View v){

            TextView  Anushka = (TextView) findViewById(R.id.Anu_Button);

            EditText Search = findViewById(R.id.Edit_search);

            Search.setText(Anushka.getText());

            EditText input = (EditText) findViewById(R.id.Edit_search);

            String typedText = input.getText().toString();

            Toast.makeText(this,  typedText + "  opened", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this, Anushka.class);

              startActivity(intent);
        }

        public void Search(View v) {

//          This trial is to try if use the text in EditText view  to search accordingly
//          TextView Disha = (TextView) findViewById(R.id.Disha_Button);
//            String refer = Disha.getText().toString();
//            TextView Anu = (TextView) findViewById(R.id.Anu_Button);
//            String refer2 = Anu.getText().toString();
//            TextView Search = findViewById(R.id.Edit_search);

//            if(dishaBaby(null).typedText == "Disha") {
//                Intent intent = new Intent(this, DishaPatani.class);
//               Button intentMsg = (Button) findViewById(R.id.Disha_Button);
//                String message = intentMsg.getText().toString();
//                intent.putExtra(EXTRA_MESSAGE, message);
//                startActivity(intent);
//            }
//            else if (AnuBaby(null).typedText == "Anushka") {
//
//                Intent intent = new Intent(this, Anushka.class);
//
//                startActivity(intent);
//            }


        }
}
