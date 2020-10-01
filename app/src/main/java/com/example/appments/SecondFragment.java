package com.example.appments;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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



    @SuppressLint("WrongViewCast")
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
        view.findViewById(R.id.F1PQ).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder factor1 = new AlertDialog.Builder(getContext());
                    factor1.setMessage("1: <30 \n 2: 31-60 \n 3: 61-120 \n 4: 121-180 \n 5: >180")
                            .setCancelable(false)
                            .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                    dialog.cancel();
                                }
                            });
                    AlertDialog titulo = factor1.create();
                    titulo.setTitle("Tiempo quirófano (min)");
                    titulo.show();

                }

            });

        view.findViewById(R.id.F2PQ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor2 = new AlertDialog.Builder(getContext());
                factor2.setMessage("1: Ambulatoria \n 2: <23 h \n 3: 24-48 h \n 4: 2-3 d \n 5: >3 d")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor2.create();
                titulo.setTitle("Duración de hospitalización");
                titulo.show();

            }

        });

        view.findViewById(R.id.F3PQ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor3 = new AlertDialog.Builder(getContext());
                factor3.setMessage("1: Improbable \n 2: <5 \n 3: 5-10 \n 4: 11-25 \n 5: >25")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor3.create();
                titulo.setTitle("Necesidad UCI (%)");
                titulo.show();

            }

        });

        view.findViewById(R.id.F4PQ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor4 = new AlertDialog.Builder(getContext());
                factor4.setMessage("1: < 100 \n 2: 100-250 \n 3: 250-500 \n 4: 500-750 \n 5: >750")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor4.create();
                titulo.setTitle("Pérdida sanguínea anticipada (cc)");
                titulo.show();

            }

        });

        view.findViewById(R.id.F5PQ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor5 = new AlertDialog.Builder(getContext());
                factor5.setMessage("1: 1 \n 2: 1-5 \n 3: 6-10 \n 4: 11-25 \n 5: >25")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor5.create();
                titulo.setTitle("Tamaño equipo de cirugía (n)");
                titulo.show();

            }

        });

        view.findViewById(R.id.F6PQ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor6 = new AlertDialog.Builder(getContext());
                factor6.setMessage("1: <1 \n " +
                        "2: 1-5 \n " +
                        "3: 6-10 \n " +
                        "4: 11-25 \n " +
                        "5: >25")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor6.create();
                titulo.setTitle("Probabilidad de intubación (%)");
                titulo.show();

            }

        });

        view.findViewById(R.id.F7PQ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor7 = new AlertDialog.Builder(getContext());
                factor7.setMessage("1: Otro \n " +
                        "2: Abdominopélvico MI \n " +
                        "3: cirugía abierta abdominopélvica infraumbilical \n " +
                        "4: cirugía abierta abdominopélvica supraumbilical \n " +
                        "5: Oto laringología, cirugía de cabeza o cuello, torácica o gastrointestinal")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor7.create();
                titulo.setTitle("Sitio quirúrgico");
                titulo.show();

            }

        });
    }



}