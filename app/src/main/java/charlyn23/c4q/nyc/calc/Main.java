package charlyn23.c4q.nyc.calc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Main extends ActionBarActivity {
    String express="";
    int expLength = 0;
    String answer ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bottonclick(View v){
        if(v.getId()==R.id.help){
            //TODO add activity and set explicit intent
        }
        if(v.getId()==R.id.deg){
            express+="*(180/PI)";
            expLength=8;
            
        } if(v.getId()==R.id.perm){

            
        } if(v.getId()==R.id.openParen){
            express+="(";
            expLength=1;
        } if(v.getId()==R.id.closeParen){
            express+=")";
            expLength=1;
        } if(v.getId()==R.id.percent){
            express+="%";
            expLength=1;
        } if(v.getId()==R.id.clear){
            express="";
        } if(v.getId()==R.id.tan){
            express+="TAN(";
            expLength=4;
        } if(v.getId()==R.id.point){
            express+=".";
            expLength=1;
        } if(v.getId()==R.id.sin){

        } if(v.getId()==R.id.ln){
            
        } if(v.getId()==R.id.cos){
            
        } if(v.getId()==R.id.one){
            
        } if(v.getId()==R.id.two){
            
        } if(v.getId()==R.id.three){
            
        } if(v.getId()==R.id.four){
            
        } if(v.getId()==R.id.five){
            
        } if(v.getId()==R.id.six){
            
        } if(v.getId()==R.id.seven){
            
        } if(v.getId()==R.id.eight){
            
        } if(v.getId()==R.id.nine){
            
        } if(v.getId()==R.id.zero){
            
        } if(v.getId()==R.id.div){
            
        } if(v.getId()==R.id.multiply){
            
        } if(v.getId()==R.id.minus){
            
        } if(v.getId()==R.id.plus){
            
        } if(v.getId()==R.id.pi){
            
        } if(v.getId()==R.id.e){
            
        } if(v.getId()==R.id.sqrt){
            
        } if(v.getId()==R.id.ans){
            
        } if(v.getId()==R.id.exp){
            
        } if(v.getId()==R.id.equals){
            
        } if(v.getId()==R.id.power){
            
        } if(v.getId()==R.id.percent){

        } if(v.getId()==R.id.inv){
            
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

//add on-click to buttons