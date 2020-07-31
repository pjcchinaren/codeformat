package cn.pjc.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv);

    }

    /**
     *
     * @param i
     */
    private void method1(ini i) {
        android.widget.Toast.makeText(this, "nihao", Toast.LENGTH_SHORT).show();
        android.widget.Toast.makeText(this, "nihao", Toast.LENGTH_SHORT).show();
        android.widget.Toast.makeText(this, "nihao", Toast.LENGTH_SHORT).show();
    }
}