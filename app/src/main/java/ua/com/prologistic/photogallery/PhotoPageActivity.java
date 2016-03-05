package ua.com.prologistic.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by Andrew on 05.03.2016.
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new PhotoPageFragment();
    }
}
