package com.example.terrariumapp1710.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.terrariumapp1710.ApiService;
import com.example.terrariumapp1710.BackendTerrarium;
import com.example.terrariumapp1710.R;
import com.example.terrariumapp1710.Terrarium;
import com.example.terrariumapp1710.databinding.FragmentHomeBinding;
import com.example.terrariumapp1710.ApiClient;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.example.terrariumapp1710.TerrariumMapper;
public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Integer> numberList;
    private NumberAdapter numberAdapter;
    private List<Terrarium> terrariumList;
    private TerrariumAdapter terrariumAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Log.d("HomeFragment", "onResponse not yet called");
        ApiService apiService = ApiClient.getClient().create(ApiService.class);
        apiService.getTerrarium().enqueue(new Callback<BackendTerrarium>() {
            @Override
            public void onResponse(Call<BackendTerrarium> call, Response<BackendTerrarium> response) {
                Log.d("HomeFragment", "onResponse called");
                if (response.isSuccessful() && response.body() != null){
                    ArrayList<BackendTerrarium> temp = new ArrayList<>();
                    temp.add(response.body());
                    temp.add(response.body());
                    List<Terrarium> terrariumList = TerrariumMapper.map(temp);
                    terrariumAdapter = new TerrariumAdapter(terrariumList);
                    recyclerView.setAdapter(terrariumAdapter);
                }

            }

            @Override
            public void onFailure(Call<BackendTerrarium> call, Throwable t) {

            }
        });
        //recyclerView.setHasFixedSize(true);

//        numberList = new ArrayList<>();
//        numberList.add(17);
//        numberList.add(42);  // Add your second number here
//
//        numberAdapter = new NumberAdapter(numberList);
//        recyclerView.setAdapter(numberAdapter);
//        terrariumList = new ArrayList<>();
//        terrariumList.add(new Terrarium("Terrarium 1", 50, 25));
//        terrariumList.add(new Terrarium("Terrarium 2", 60, 29));
//        terrariumList.add(new Terrarium("Terrarium 3", 40, 23));
//
//        terrariumAdapter = new TerrariumAdapter(terrariumList);
//        recyclerView.setAdapter(terrariumAdapter);
        return view;
    }
}
