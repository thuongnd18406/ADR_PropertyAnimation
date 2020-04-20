package dangthuongngo.com.hocpropreti;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLiObjectAnimator(View view) {
        Button btnObjectAnimator=findViewById(R.id.btnObjectAnimator);
        ObjectAnimator objectAnimator= (ObjectAnimator) AnimatorInflater.loadAnimator(this,R.animator.object_animater);
        objectAnimator.setTarget(btnObjectAnimator);
        objectAnimator.start();
    }

    public void xuLiObjectAnimatorSet(View view) {
        Button btnObjectAnimatorSet=findViewById(R.id.btnObjectAnimatorSet);
        AnimatorSet animatorSet= (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.object_animator_set);
        animatorSet.setTarget(btnObjectAnimatorSet);
        animatorSet.start();
    }
}
