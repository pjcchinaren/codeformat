package cn.pjc.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv);

    }

    /**
     * @param i
     */
    private void method1(int i) {
        Toast.makeText(this, "hehe", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "hhe", Toast.LENGTH_SHORT).show();
    }
}