package cn.pjc.myapplication;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityManager activityManager = (ActivityManager) MainActivity.this.getSystemService(Context.ACTIVITY_SERVICE);
                int memoryClass = activityManager.getMemoryClass();
            }
        });

    }

    private void m(){
        //1
    }
    /**
     * @param i
     */
    private void method1(int i) {
        //dfsaf
        //
        Toast.makeText(this, "hahahahahahhahahahahahhahahahahahhahahahahahhahahahahahhahahahahahhahahahahahhahahahahahhahahahahahhahahahahahhahahahahahhahahahahahhahahahahah", Toast.LENGTH_SHORT).show();
//adfk

        Toast.makeText(this, "hehe", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "hhe", Toast.LENGTH_SHORT).show();


        // fsdajflk
    }

    private void a() {


    }

    private void method2() {

        Log.e("aaa", "1");

        Log.e("aaa", "1");
        Log.e("aaa", "1");
    }
}
