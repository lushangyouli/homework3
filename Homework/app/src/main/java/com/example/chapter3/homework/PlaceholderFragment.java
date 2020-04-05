package com.example.chapter3.homework;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class PlaceholderFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO ex3-3: 修改 fragment_placeholder，添加 loading 控件和列表视图控件
        return inflater.inflate(R.layout.fragment_placeholder, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final TextView tv1=getView().findViewById(R.id.tv0);
        final TextView tv2=getView().findViewById(R.id.tv1);
        final TextView tv3=getView().findViewById(R.id.tv2);
        final TextView tv4=getView().findViewById(R.id.tv3);
        final TextView tv5=getView().findViewById(R.id.tv4);
        final TextView tv6=getView().findViewById(R.id.tv5);
        final TextView tv7=getView().findViewById(R.id.tv6);


        //在xml文件设置
        /*tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);*/

        tv1.animate().alpha(0);
        tv2.animate().alpha(0);
        tv3.animate().alpha(0);
        tv4.animate().alpha(0);
        tv5.animate().alpha(0);
        tv6.animate().alpha(0);
        tv7.animate().alpha(0);




        final LottieAnimationView animationView = getView().findViewById(R.id.animation_view);

        animationView.setVisibility(View.VISIBLE);
        animationView.animate().alpha(1);

        getView().postDelayed(new Runnable() {
            @Override
            public void run() {
                // 这里会在 5s 后执行
                // TODO ex3-4：实现动画，将 lottie 控件淡出，列表数据淡入
                //animationView.setVisibility(View.INVISIBLE);

                animationView.animate().alpha(0).setDuration(500);

                tv1.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.VISIBLE);
                tv6.setVisibility(View.VISIBLE);
                tv7.setVisibility(View.VISIBLE);

                tv1.animate().alpha(1).setDuration(1000);
                tv2.animate().alpha(1).setDuration(1000);
                tv3.animate().alpha(1).setDuration(1000);
                tv4.animate().alpha(1).setDuration(1000);
                tv5.animate().alpha(1).setDuration(1000);
                tv6.animate().alpha(1).setDuration(1000);
                tv7.animate().alpha(1).setDuration(1000);


            }
        }, 5000);
    }
}
