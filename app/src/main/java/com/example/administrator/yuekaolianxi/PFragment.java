package com.example.administrator.yuekaolianxi;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by Administrator on 2017/3/29.
 */

public class PFragment extends DialogFragment {
    private Button bt1;

    public static final PFragment getInface()
    {
        PFragment pf=new PFragment();
        return pf;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        View v=inflater.inflate(R.layout.tan,null);
        bt1= (Button) v.findViewById(R.id.button3);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        final Animation animation= AnimationUtils.loadAnimation(getActivity(),R.anim.ain);
        animation.setDuration(3000);
        v.setAnimation(animation);
        return v;
    }

    @Override
    public void onStart() {
        getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        super.onStart();
    }
}

