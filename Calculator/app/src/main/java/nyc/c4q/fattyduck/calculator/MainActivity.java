package nyc.c4q.fattyduck.calculator;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;


public class MainActivity extends ActionBarActivity {
    String express = "";
    int length=0;
    String answer="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myClick(View v){

        TextView text = (TextView)findViewById(R.id.tv);
        BigDecimal results=null;

        text.setText(express);

        switch(v.getId()){
            case R.id.openParen:
                express+="(";
                length=1;
                break;
            case R.id.closeParen:
                express+=")";
                length=1;
                break;
            case R.id.percent:
                express+="%";
                length=1;
                break;
            case R.id.clear:
                express="";
                break;
            case R.id.division:
                express+="/";
                length=1;
                break;
            case R.id.multiply:
                express+="*";
                length=1;
                break;
            case R.id.times:
                express+="*";
                length=1;
                break;
            case R.id.minus:
                express+="-";
                length=1;
                break;
            case R.id.plus:
                express+="+";
                length=1;
                break;
            case R.id.one:
                express+="1";
                length=1;
                break;
            case R.id.two:
                express+="2";
                length=1;
                break;
            case R.id.three:
                express+="3";
                length=1;
                break;
            case R.id.four:
                express+="4";
                length=1;
                break;
            case R.id.five:
                express+="5";
                length=1;
                break;
            case R.id.six:
                express+="6";
                length=1;
                break;
            case R.id.seven:
                express+="7";
                length=1;
                break;
            case R.id.eight:
                express+="8";
                length=1;
                break;
            case R.id.nine:
                express+="9";
                length=1;
                break;
            case R.id.point:
                express+=".";
                length=1;
                break;
            case R.id.equals:
                try{
                    Expression expression = new Expression(express);
                    results = expression.eval();
                    answer = String.valueOf(results.doubleValue());
                    text.setText(answer);

                }catch (Exception e){
                    text.setText("ERROR");
                    text.setTextColor(Color.RED);
                }


        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
