package com.example.appments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

/**

 * create an instance of this fragment.
 */
public class FifthFragment extends Fragment {
    TextView txtData;
    private int total=50;
    private int umbral=0;
    private int total1;
    private int total2;
    private int total3;
    private int flot;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    @Nullable
    private Bundle savedInstanceState;



    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.retry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FifthFragment.this)
                        .navigate(R.id.action_Tryagain);
            }
        });
        super.onViewCreated(view, savedInstanceState);

        int tot=FifthFragmentArgs.fromBundle(getArguments()).getTotal();
        //total=getArguments().getInt("total", 0);
        final TextView scoree=view.findViewById(R.id.scorefinal);
        scoree.setText("El puntaje final es: " + tot);
        final TextView umbrte=view.findViewById(R.id.umbraltext);
        final SeekBar umbrse=view.findViewById(R.id.umbralseek);
        final TextView decision=view.findViewById(R.id.resultfinal);
        final Button calcul=view.findViewById(R.id.calcularbot);
        final int total=tot;
        umbrse.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                umbral= (int) Math.round(i*1.05);
                umbrte.setText("Umbral: "+ umbral);
                       // decision.setText(total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        view.findViewById(R.id.calcularbot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(umbral!=0) {

                    if (umbral < total) {
                        decision.setText("Se debería posponer la cirugía");

                    }
                    else{

                        decision.setText("Se puede hacer la cirugía");
                    }
                }

            }


        });


    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }



    public void displayReceivedData(String message) {

        txtData.setText(message);

    }

}