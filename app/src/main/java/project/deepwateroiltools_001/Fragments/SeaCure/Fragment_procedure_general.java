package project.deepwateroiltools_001.Fragments.SeaCure;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import project.deepwateroiltools_001.R;
import project.dto.service.ProcedureSlide;

/**
 * Created by janos on 20/02/2018.
 */

public class Fragment_procedure_general  extends Fragment {
    View view;
    ProcedureSlide procedureSlide;
    TextView lbl_procGeneral;


    public void setProcedureSlide(ProcedureSlide procedureSlide) {
        this.procedureSlide = procedureSlide;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_procedure_general, container, false);
        lbl_procGeneral = (TextView) view.findViewById(R.id.lbl_procGeneral);
        lbl_procGeneral.setText(procedureSlide.getTitle());



        Log.d("fragmant created", "gen");

        return view;



    }

}
