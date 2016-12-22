package info.androidhive.navigationdrawer.fragment;

/**
 * Created by 100rabh on 12/21/2016.
 */
import java.util.List;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter  {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TabTruck tab1 = new TabTruck();
                return tab1;
            case 1:
                TabPayLoad tab2 = new TabPayLoad();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
