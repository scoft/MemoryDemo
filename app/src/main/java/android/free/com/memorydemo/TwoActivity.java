package android.free.com.memorydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        startThread();
    }


    class InnerThread extends Thread{
        @Override
        public void run() {
            super.run();
            int index = 0;
            while (index < Integer.MAX_VALUE){
                index ++;
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void startThread(){
        InnerThread thread = new InnerThread();
        thread.start();
    }
}
