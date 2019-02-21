package ng.com.starthub.swedigo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OnboardingActivity extends AppCompatActivity {
    ViewPager mSlidePager;
    Button mSkipButton;
    OnBoardingAdapter mOnBoardingAdapter;
    LinearLayout mDotLayout;
    TextView[] mDots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        mSlidePager = findViewById(R.id.slide_vp);
        mSkipButton = findViewById(R.id.slide_skip);
        mDotLayout = findViewById(R.id.dotLayout);
        String[] titles = getResources().getStringArray(R.array.onboarding_title);
        String[] bodies = getResources().getStringArray(R.array.onboarding_bodies);
        mOnBoardingAdapter = new OnBoardingAdapter(this,titles,bodies);
        mSlidePager.setAdapter(mOnBoardingAdapter);
        addDotIndicator(0);
        mSlidePager.addOnPageChangeListener(viewListener);



    }
    public void addDotIndicator(int position){
        mDots = new TextView[3];
        mDotLayout.removeAllViews();
        for(int i =0; i < mDots.length;i++){
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));
            mDotLayout.addView(mDots[i]);

        }
        if(mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotIndicator(i);
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
