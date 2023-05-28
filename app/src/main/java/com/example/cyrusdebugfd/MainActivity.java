package com.example.cyrusdebugfd;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.cyrusTextView);
        textView.setText("Cyrus Debug Fd");
        Log.d("CyrusDebugFd", "Application started ~~~");
    }
}
