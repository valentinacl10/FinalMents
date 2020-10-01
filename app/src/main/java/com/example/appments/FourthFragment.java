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

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class FourthFragment extends Fragment {
    private int c1=1;
    private int c2=1;
    private int c3=1;
    private int c4=1;
    private int c5=1;
    private int c6=1;
    private int c7=1;
    private int c8=1;
    private int total=8;
    private Fragment4Listener listener;

    public interface Fragment4Listener{

        void total4(int input);

    }
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button4_anterior).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FourthFragment.this)
                        .navigate(R.id.action_FourthFragment_to_ThirdFragment);
            }
        });
        view.findViewById(R.id.button4_finalizar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FourthFragmentDirections.ActionFinalResult action=
                        FourthFragmentDirections.actionFinalResult();
                action.setTotal(total);
                NavHostFragment.findNavController(FourthFragment.this)
                        .navigate(action);

            }
        });

        final int totparc= FourthFragmentArgs.fromBundle(getArguments()).getTotal3();
        final TextView cantidadnum=view.findViewById(R.id.cuenta3);
        total=+totparc;
        final SeekBar cuenta1=view.findViewById(R.id.seekbarP31);
        final SeekBar cuenta2=view.findViewById(R.id.seekbarP32);
        final SeekBar cuenta3=view.findViewById(R.id.seekbarP33);
        final SeekBar cuenta4=view.findViewById(R.id.seekbarP34);
        final SeekBar cuenta5=view.findViewById(R.id.seekbarP35);
        final SeekBar cuenta6=view.findViewById(R.id.seekbarP36);
        final SeekBar cuenta7=view.findViewById(R.id.seekbarP37);
        final SeekBar cuenta8=view.findViewById(R.id.seekbarP38);

        cuenta1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                c1=i+1;
                total=c1+c2+c3+c4+c5+c6+c7+c8+totparc;
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
                total=c1+c2+c3+c4+c5+c6+c7+c8+totparc;
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
                total=c1+c2+c3+c4+c5+c6+c7+c8+totparc;
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
                total=c1+c2+c3+c4+c5+c6+c7+c8+totparc;
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
                total=c1+c2+c3+c4+c5+c6+c7+c8+totparc;
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
                total=c1+c2+c3+c4+c5+c6+c7+c8+totparc;
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
                total=c1+c2+c3+c4+c5+c6+c7+c8+totparc;
                cantidadnum.setText("score: "+total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        cuenta8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                c8=i+1;
                total=c1+c2+c3+c4+c5+c6+c7+c8+totparc;
                cantidadnum.setText("score: "+total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


}