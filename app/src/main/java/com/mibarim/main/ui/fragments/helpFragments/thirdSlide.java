package com.mibarim.main.ui.fragments.helpFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.mibarim.main.BootstrapApplication;
import com.mibarim.main.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hamed on 5/3/2016.
 */
public class thirdSlide extends Fragment {

    private Tracker mTracker;
    @Bind(R.id.slide_3_msg)
    protected TextView slide_3_msg;

    private Animation slideUp;
    private Animation slideDown;

    public thirdSlide() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BootstrapApplication application = (BootstrapApplication) getActivity().getApplication();
        mTracker = application.getDefaultTracker();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.slide_3, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mTracker.setScreenName("thirdSlide");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
        mTracker.send(new HitBuilders.EventBuilder().setCategory("Help").setAction("thirdSlide").build());

        ButterKnife.bind(this, getView());
        /*slideUp = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_up);
        slideDown = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_down);
        slide_3_msg.setAnimation(slideUp);*/
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (slide_3_msg != null) {
            /*if (isVisibleToUser) {
                slide_3_msg.startAnimation(slideDown);
            } else {
                slide_3_msg.startAnimation(slideUp);
            }*/
        }
    }


}