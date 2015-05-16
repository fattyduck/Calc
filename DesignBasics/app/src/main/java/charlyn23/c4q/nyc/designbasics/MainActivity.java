package charlyn23.c4q.nyc.designbasics;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView textViewOne = null;
        TextView textViewOne = (TextView) findViewById(R.id.textViewOne);
        TextView textViewTwo = (TextView) findViewById(R.id.textViewtwo);
        TextView textViewThree = (TextView) findViewById(R.id.textViewThree);
        TextView r1TextView = (TextView) findViewById(R.id.r1TextView);
        TextView r2TextView = (TextView) findViewById(R.id.r2TextView);
        TextView r3TextView = (TextView) findViewById(R.id.r3TextView);


        Button oneButton = (Button) findViewById(R.id.oneButton);
        Button twoButton = (Button) findViewById(R.id.twoButton);
        Button threeButton = (Button) findViewById(R.id.threeButton);
        Button r1Button = (Button) findViewById(R.id.r1button);
        Button r2Button = (Button) findViewById(R.id.r2button);
        Button r3Button = (Button) findViewById(R.id.r3button);

        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(oneButton);
        buttons.add(twoButton);
        buttons.add(threeButton);
        buttons.add(r1Button);
        buttons.add(r2Button);
        buttons.add(r3Button);

        oneButton.setOnClickListener(new ButtonStuff());


        for (Button b: buttons) {
            b.setOnClickListener(new ButtonStuff());
    }
    }
    public class ButtonStuff implements View.OnClickListener {

        int clickCounter = 0;
        MainActivity m = new MainActivity();

        //TextView textViewOne = null;
        TextView textViewOne = (TextView) findViewById(R.id.textViewOne);
        TextView textViewTwo = (TextView) findViewById(R.id.textViewtwo);
        TextView textViewThree = (TextView) findViewById(R.id.textViewThree);
        TextView r1TextView = (TextView) findViewById(R.id.r1TextView);
        TextView r2TextView = (TextView) findViewById(R.id.r2TextView);
        TextView r3TextView = (TextView) findViewById(R.id.r3TextView);

        @Override
        public void onClick(View v) {

            if(v.getId()==R.id.oneButton){
                clickCounter += 1;
                textViewOne.setText(String.valueOf(clickCounter));

            }
            if(v.getId()==R.id.twoButton){
                clickCounter += 1;
                textViewTwo.setText(String.valueOf(clickCounter));
            }
            if(v.getId()==R.id.threeButton){
                clickCounter += 1;
                textViewThree.setText(String.valueOf(clickCounter));
            }
            if(v.getId()==R.id.r1button){
                clickCounter += 1;
                r1TextView.setText(String.valueOf(clickCounter));
            }
            if(v.getId()==R.id.r2button){
                clickCounter += 1;
                r2TextView.setText(String.valueOf(clickCounter));

            }
            if(v.getId()==R.id.r3button){
                clickCounter += 1;
                r3TextView.setText(String.valueOf(clickCounter));

            }
        }
    }

}

