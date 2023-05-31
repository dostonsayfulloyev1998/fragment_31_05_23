package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private ListView listView;
    private ListAdapter adapter;
    private ArrayList<String> arrayList;
    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment1, container,false);
        listView = view.findViewById(R.id.list);
        loadData();
        adapter = new ListAdapter(arrayList,getContext());
       listView.setAdapter(adapter);
        return view;
    }

    private void loadData() {
        arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add("item "+i);
        }
    }
}
