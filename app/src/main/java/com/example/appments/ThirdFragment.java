package com.example.appments;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
 * create an instance of this fragment.
 */
public class ThirdFragment extends Fragment {
    private int c1=1;
    private int c2=1;
    private int c3=1;
    private int c4=1;
    private int c5=1;
    private int c6=1;
    private int total=6;
    private int pasa=0;
    private Fragment3Listener listener;

    public interface Fragment3Listener{

        void total3(int input);

    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button3_anterior).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_SecondFragment);
            }
        });
        view.findViewById(R.id.button3_siguiente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirdFragmentDirections.ActionThirdFragmentToFourthFragment action=
                        ThirdFragmentDirections.actionThirdFragmentToFourthFragment();
                action.setTotal3(total);
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(action);



            }

        });
        final int totparc=ThirdFragmentArgs.fromBundle(getArguments()).getTotal2();

        final TextView cantidadnum=view.findViewById(R.id.cuenta2);
        final SeekBar cuenta1=view.findViewById(R.id.seekbarP21);
        final SeekBar cuenta2=view.findViewById(R.id.seekbarP22);
        final SeekBar cuenta3=view.findViewById(R.id.seekbarP23);
        final SeekBar cuenta4=view.findViewById(R.id.seekbarP24);
        final SeekBar cuenta5=view.findViewById(R.id.seekbarP25);
        final SeekBar cuenta6=view.findViewById(R.id.seekbarP26);

        cuenta1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                c1=i+1;
                total=c1+c2+c3+c4+c5+c6+totparc;
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
                total=c1+c2+c3+c4+c5+c6+totparc;
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
                total=c1+c2+c3+c4+c5+c6+totparc;
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
                total=c1+c2+c3+c4+c5+c6+totparc;
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
                total=c1+c2+c3+c4+c5+c6+totparc;
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
                total=c1+c2+c3+c4+c5+c6+totparc;
                cantidadnum.setText("score: "+total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        view.findViewById(R.id.F1DA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor1 = new AlertDialog.Builder(getContext());
                factor1.setMessage("1: No disponible \n" +
                        "2: Disponible, 40% efectivo como la cirugía \n" +
                        "3: Disponible, 40% a 60% efectivo como la cirugía, \n" +
                        "4: Disponible, 61% a 95% efectivo como la cirugía \n" +
                        "5: Disponible, igualmente efectivo")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor1.create();
                titulo.setTitle("Efectividad de la opción de tratamiento no quirúrgico ");
                titulo.show();

            }

        });

        view.findViewById(R.id.F2DA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor2 = new AlertDialog.Builder(getContext());
                factor2.setMessage("1: Significativamente peor/no aplica \n" +
                        "2: Algo peor \n" +
                        "3: Equivalente \n" +
                        "4: Algo mejor \n" +
                        "5: Significativamente mejor")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor2.create();
                titulo.setTitle("Riesgo de exposición de la opción de tratamiento no quirúrgico");
                titulo.show();

            }

        });

        view.findViewById(R.id.F3DA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor3 = new AlertDialog.Builder(getContext());
                factor3.setMessage("1: Significativamente peor \n" +
                        "2: Peor \n" +
                        "3: Moderadamente peor \n" +
                        "4: Un poco peor \n" +
                        "5: No es peor")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor3.create();
                titulo.setTitle("Impacto de un retraso de 2 semanas en el resultado de la enfermedad");
                titulo.show();

            }

        });

        view.findViewById(R.id.F4PQ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor4 = new AlertDialog.Builder(getContext());
                factor4.setMessage("1: Significativamente peor \n" +
                        "2: Peor \n" +
                        "3: Moderadamente peor \n" +
                        "4: Un poco peor \n" +
                        "5: No es peor")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor4.create();
                titulo.setTitle("Impacto de un retraso de 2 semanas en la dificultad/riesgo de la cirugía");
                titulo.show();

            }

        });

        view.findViewById(R.id.F5DA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor5 = new AlertDialog.Builder(getContext());
                factor5.setMessage("1: Significativamente peor \n" +
                        "2: Peor \n" +
                        "3: Moderadamente peor \n" +
                        "4: Un poco peor \n" +
                        "5: No es peor")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor5.create();
                titulo.setTitle("Impacto de un retraso de 6 semanas en el resultado de la enfermedad");
                titulo.show();

            }

        });

        view.findViewById(R.id.F6DA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder factor6 = new AlertDialog.Builder(getContext());
                factor6.setMessage("1: Significativamente peor \n" +
                        "2: Peor \n" +
                        "3: Moderadamente peor \n" +
                        "4: Un poco peor \n" +
                        "5: No es peor")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = factor6.create();
                titulo.setTitle("Impacto de un retraso de 6 semanas en la dificultad/riesgo de la cirugía");
                titulo.show();

            }

        });

    }

}