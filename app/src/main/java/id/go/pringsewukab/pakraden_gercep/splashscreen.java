package id.go.pringsewukab.pakraden_gercep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {
    Animation animation, button;
    ImageView image;
    TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        image = findViewById(R.id.image1);
        text1 = findViewById(R.id.tv1);
        text2 = findViewById(R.id.tv2);

        animation = AnimationUtils.loadAnimation(this, R.anim.side_anim);
        button = AnimationUtils.loadAnimation(this, R.anim.button_anim);
        image.setAnimation(animation);
        text1.setAnimation(button);
        text2.setAnimation(button);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}