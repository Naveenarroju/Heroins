package com.example.narroju.heroins;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   public  static final String EXTRA_MESSAGE = "DishaPatani";

   private Button mDishaPatani;
   private Button mAnushka;
   private Button mSearch;
   private EditText mEditSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDishaPatani = (Button) findViewById(R.id.Disha_Button);
        mAnushka = (Button) findViewById(R.id.Anu_Button);
        mSearch = (Button) findViewById(R.id.textView);
        mEditSearch = (EditText) findViewById(R.id.Edit_search);
    }

    /*we call the method from a button View using Onclick:"method(button)name", we must need the
    same method for future use also in another Button or View with OnClick attribute in it, so insted
    of calling that method using particular view only ex: dishaBaby(Botton b) we can use the parent class
    of all the Views that is View itself.
     */
        public void dishaBaby(View v){ //The parameter gets the argument from the View through which it is called

            // This line is not required since it is already declared in onCreate
//             TextView DishaPatani = (TextView) findViewById(R.id.Disha_Button);// Disha_Button is a static inner field
            // in static class activity of R.java file where that field button is given an int value

            // This line is not required since it is already declared in onCreate
//            EditText Search = (EditText) findViewById(R.id.Edit_search);

            Log.e("Disha text", mDishaPatani.getText().toString());
            mEditSearch.setText(mDishaPatani.getText());

            // This line is not required since it is already declared in onCreate
//            EditText input = (EditText) findViewById(R.id.Edit_search);

            String typedText = mEditSearch.getText().toString();
            Toast.makeText(this,  typedText + "opened", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, DishaPatani.class);

            // This line is not required since it is already declared in onCreate
//            Button intentMsg = (Button) findViewById(R.id.Disha_Button);

            String message = mDishaPatani.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);

        }

        public void AnuBaby(View v){

//            TextView  Anushka = (TextView) findViewById(R.id.Anu_Button);

//            EditText Search = findViewById(R.id.Edit_search);

            mEditSearch.setText(mAnushka.getText());

//            EditText input = (EditText) findViewById(R.id.Edit_search);

            String typedText = mEditSearch.getText().toString();
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
