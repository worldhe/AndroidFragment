package com.zhaowh.fragment.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.zhaowh.fragment.FiveActivity;
import com.zhaowh.fragment.R;

public class ThirdFragment extends Fragment implements View.OnClickListener {

    private EditText et;
    private Button btn;
    private StringBuilder stringBuilder = new StringBuilder();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        et = (EditText) view.findViewById(R.id.et);
        btn = (Button) view.findViewById(R.id.btn);
        btn.setOnClickListener(this);
        Bundle bundle = getArguments();
        if(bundle != null){
            String s = bundle.getString("lemon");
            stringBuilder.append(bundle.getString("lemon"));
            if(!s.equals(null) && !s.equals("")){
                et.setText(s);
            }
        }


        return view;
    }

    @Override
    public void onClick(View v) {
        System.out.println("-------->1");
        switch (v.getId()){
            case R.id.btn:
                System.out.println("-------->2stringBuilder.toString()   "+stringBuilder.toString());
                Intent intent = new Intent(getContext(), FiveActivity.class);
                intent.putExtra("lemon", stringBuilder.toString());
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
