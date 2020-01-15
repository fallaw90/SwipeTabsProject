package com.fallntic.swipetabsproject;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("PagerAdapter", "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null)
            Log.d("PagerAdapter", "onCreate FIRST TIME");
        else
            Log.d("PagerAdapter", "onCreate SUBSEQUENT TIME");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Log.d("PagerAdapter", "onCreateView");

        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("PagerAdapter", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("PagerAdapter", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("PagerAdapter", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("PagerAdapter", "onPause");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("PagerAdapter", "onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("PagerAdapter", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("PagerAdapter", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("PagerAdapter", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("PagerAdapter", "onDetach");
    }
}
