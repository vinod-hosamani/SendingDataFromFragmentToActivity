package com.example.client1.sendingdatafromfragmenttoactivity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by client1 on 1/4/2018.
 */

public class FragmentOne extends Fragment implements CustomAdapter.onClick {

    RecyclerView recyclerView;
    ArrayList<CustModel> dataLogList;
    CustomAdapter customAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.frag_one, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.reyclerVIew);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        customAdapter = new CustomAdapter(prepareData(), this);
        recyclerView.setAdapter(customAdapter);
        return view;
    }

    private ArrayList<CustModel> prepareData() {
        dataLogList = new ArrayList<>();

        CustModel modelList;

        modelList = new CustModel();
        modelList.firstName = "john";
        modelList.lastName = "cena";
        dataLogList.add(modelList);

        modelList = new CustModel();
        modelList.firstName = "rock";
        modelList.lastName = "body";
        dataLogList.add(modelList);

        modelList = new CustModel();
        modelList.firstName = "david";
        modelList.lastName = "batista";
        dataLogList.add(modelList);

        modelList = new CustModel();
        modelList.firstName = "michael";
        modelList.lastName = "jackson";
        dataLogList.add(modelList);
        return dataLogList;
    }

    @Override
    public void onClick(View view, int position) {
        /*CustModel custModel = dataLogList.get(position);
        Fragment fragment = FragmentTwo.newInstance(custModel);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, fragment); // fragment container id in first parameter is the  container(Main layout id) of Activity
        transaction.addToBackStack(null);  // this will manage backstack
        transaction.commit();*/

        /*
        * Intent intent=new Intent(this,FirstClassActivity.class);
        Bundle bundle=new Bundle();
        bundle.putParcelable("data", dataLogList.get(position));
        Log.d(TAG, "MyClass.getView() — get item number " + dataLogList +"pos   "+position);
        intent.putExtras(bundle);

        startActivity(intent);
        * */

      //  CustModel custModel=dataLogList.get(position);
        Intent intent=new Intent(getActivity(),SecondActivity.class);
        Bundle  bundle=new Bundle();
        bundle.putParcelable("data",dataLogList.get(position));
        intent.putExtras(bundle);
        startActivity(intent);



    }
}
