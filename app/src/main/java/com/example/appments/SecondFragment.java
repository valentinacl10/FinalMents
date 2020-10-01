package com.example.appments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {
    private int c1=1;
    private int c2=1;
    private int c3=1;
    private int c4=1;
    private int c5=1;
    private int c6=1;
    private int c7=1;
    private int total=7;


    private Fragment2Listener listener;
    public int tot=50;
    public interface Fragment2Listener{

        void total2(int input);

    }



    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }



    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);





        final TextView cantidadnum=view.findViewById(R.id.cuenta1);
        final SeekBar cuenta1=view.findViewById(R.id.seekbarP1);
        final SeekBar cuenta2=view.findViewById(R.id.seekbarP2);
        final SeekBar cuenta3=view.findViewById(R.id.seekbarP3);
        final SeekBar cuenta4=view.findViewById(R.id.seekbarP4);
        final SeekBar cuenta5=view.findViewById(R.id.seekbarP5);
        final SeekBar cuenta6=view.findViewById(R.id.seekbarP6);
        final SeekBar cuenta7=view.findViewById(R.id.seekbarP7);

        cuenta1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                c1=i+1;
                total=c1+c2+c3+c4+c5+c6+c7;
                cantidadnum.setText("score: "+total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        cuenta2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                c2=i+1;
                total=c1+c2+c3+c4+c5+c6+c7;
                cantidadnum.setText("score: "+total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        cuenta3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                c3=i+1;
                total=c1+c2+c3+c4+c5+c6+c7;
                cantidadnum.setText("score: "+total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        cuenta4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                c4=i+1;
                total=c1+c2+c3+c4+c5+c6+c7;
                cantidadnum.setText("score: "+total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        cuenta5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                c5=i+1;
                total=c1+c2+c3+c4+c5+c6+c7;
                cantidadnum.setText("score: "+total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        cuenta6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                c6=i+1;
                total=c1+c2+c3+c4+c5+c6+c7;
                cantidadnum.setText("score: "+total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        cuenta7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                c7=i+1;
                total=c1+c2+c3+c4+c5+c6+c7;
                cantidadnum.setText("score: "+total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                SecondFragmentDirections.ActionSecondFragmentToThirdFragment action =
                        SecondFragmentDirections.actionSecondFragmentToThirdFragment();
                action.setTotal2(total);
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(action);


            }

        });


    }



}