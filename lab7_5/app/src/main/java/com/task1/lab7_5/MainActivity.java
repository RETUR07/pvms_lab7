package com.example.application;
import android.app.Activity;
import
        android.graphics.Color;
import
        android.graphics.drawable.AnimationDrawable;
import android.os.Bundle; import
        android.view.View; import
        android.view.View.OnClickListener; import
        android.view.animation.Animation; import
        android.view.animation.AnimationUtils; import
        android.widget.Button; import
        android.widget.ImageView;

import com.task1.lab7_5.R;

public class MainActivity extends Activity implements
        OnClickListener {

    private Button startFrameAnim;
    private Button startTransformAnim;
    private Button cancelAnim; private
    ImageView animationView;
    @Override public void onCreate(Bundle
                                           savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startFrameAnim = (Button) findViewById(R.id.frameAnimationStart);
        startTransformAnim= (Button) findViewById(R.id.transformAnimationStart);
        cancelAnim = (Button) findViewById(R.id.cancelAnimation);
        animationView = (ImageView) findViewById(R.id.animationView);

        startFrameAnim.setOnClickListener(this);
        startTransformAnim.setOnClickListener(this);
        cancelAnim.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (startFrameAnim.equals(v)) {
            animationView.setBackgroundResource(R.anim.frame_anim);
            AnimationDrawable animation =
                    (AnimationDrawable) animationView.getBackground();
            animation.start();
        } else if (startTransformAnim.equals(v)) {
            animationView.setBackgroundResource(R.drawable.ic_launcher);
            Animation transformAnimation =
                    AnimationUtils.loadAnimation(this, R.anim.transform_anim);
            animationView.startAnimation(transformAnimation);
        } else if (cancelAnim.equals(v)) {
            animationView.setBackgroundColor(Color.BLACK);
        }
    }
}