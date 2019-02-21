package ng.com.starthub.swedigo;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class OnBoardingAdapter extends PagerAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private String[] mTitles ;
    private String[] mBodies ;
    public int[] mBackgrouds = {
            R.drawable.welcome_back,
            R.drawable.shopping,
            R.drawable.camera_back
        };
    public OnBoardingAdapter(Context context,String[] titles,String[] bodies) {
        mContext = context;
        mTitles=titles;
        mBodies=bodies;
    }
    @Override
    public int getCount() {
        return mBackgrouds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//        return super.instantiateItem(container, position);
         mInflater = (LayoutInflater) mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
        View view = mInflater.inflate(R.layout.slide_onboard,container,false);
        TextView title = view.findViewById(R.id.slide_title);
        TextView body = view.findViewById(R.id.slide_body);
        view.setBackgroundResource(mBackgrouds[position]);
        title.setText(mTitles[position]);
        body.setText(mBodies[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
