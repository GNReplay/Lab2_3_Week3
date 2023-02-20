package hcmute.edu.vn.lab2_3_week3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class fragment1 extends Fragment {

    View view;
    ItemViewModel viewModel;
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment1,container,false);
        Button button = view.findViewById(R.id.sendData1btn);

        return view;
    }

    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        Button button = view.findViewById(R.id.sendData1btn);
        EditText editText = view.findViewById(R.id.fragment1Data);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                viewModel.setData(editText.getText().toString());
            }
        });
    }
}
