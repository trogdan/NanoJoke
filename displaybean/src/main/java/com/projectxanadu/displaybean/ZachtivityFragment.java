package com.projectxanadu.displaybean;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ZachtivityFragment extends Fragment {

    public ZachtivityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_zachtivity, container, false);
        Bundle bundle = getActivity().getIntent().getExtras();
        if (bundle != null)
        {
            String joke = bundle.getString(Zachtivity.JOKE_KEY);
            if (joke != null)
            {
                TextView text = (TextView)rootView.findViewById(R.id.joke_text_view);
                text.setText(joke);
            }
        }

        return rootView;
    }

}
