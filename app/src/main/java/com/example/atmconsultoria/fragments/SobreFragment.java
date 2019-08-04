package com.example.atmconsultoria.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmconsultoria.Adapter.MyAdapter;
import com.example.atmconsultoria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {


    private RecyclerView recyclerView;


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sobre, container, false);


        recyclerView = view.findViewById(R.id.recyclerView);

        MyAdapter adapter = new MyAdapter();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        return view;


    }

}
