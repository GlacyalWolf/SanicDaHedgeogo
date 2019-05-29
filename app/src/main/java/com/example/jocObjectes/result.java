package com.example.jocObjectes;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    private Typeface customFont;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        customFont = Typeface.createFromAsset(getAssets(), "NiseSegaSonic.TTF" );
        setContentView(R.layout.activity_result);

        TextView scoreLabel = findViewById(R.id.scoreLabel);
        scoreLabel.setTypeface(customFont);

        Button btn_tryagain = findViewById(R.id.btn_tryagain);
        btn_tryagain.setTypeface(customFont);

        int score = getIntent().getIntExtra("SCORE", 0);
        scoreLabel.setText(score + "");
    }

    public void tryAgain(View view){
        startActivity(new Intent(getApplicationContext(), main.class));
    }

    // Disable Return Button
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {

        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (event.getKeyCode()) {
                case KeyEvent.KEYCODE_BACK:
                    return true;
            }
        }

        return super.dispatchKeyEvent(event);
    }

}
