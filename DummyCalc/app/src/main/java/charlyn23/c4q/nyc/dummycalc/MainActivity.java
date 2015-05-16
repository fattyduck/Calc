package charlyn23.c4q.nyc.dummycalc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    String equation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView numberReadout = (TextView) findViewById(R.id.numberReadout);
        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button minus = (Button)  findViewById(R.id.minus);
        Button plus = (Button) findViewById(R.id.plus);


        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(four);
        buttons.add(five);
        buttons.add(six);
        buttons.add(minus);
        buttons.add(plus);

        for (Button b : buttons) {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.one) {
                        equation += "1";
                        numberReadout.setText(equation);
                    }
                    if (v.getId() == R.id.two) {
                        equation += "2";
                        numberReadout.setText(equation);

                    }
                    if (v.getId() == R.id.three) {
                        equation += "3";
                        numberReadout.setText(equation);
                    }
                    if (v.getId() == R.id.four){
                        equation += "4";
                        numberReadout.setText(equation);
                    }
                    if (v.getId() == R.id.five){
                        equation += "5";
                        numberReadout.setText(equation);
                    }
                    if (v.getId() == R.id.plus) {
                        equation += " + ";
                        numberReadout.setText(equation);
                    }
                    if (v.getId() == R.id.minus) {
                        equation += " - ";
                        numberReadout.setText(equation);
                    }

                }


            });

        }


    }
}

