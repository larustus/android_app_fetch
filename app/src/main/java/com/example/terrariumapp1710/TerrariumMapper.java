package com.example.terrariumapp1710;

import java.util.ArrayList;
import java.util.List;

public class TerrariumMapper {
    public static List<Terrarium> map(List<BackendTerrarium> backendTerrariums) {
        List<Terrarium> terrariums = new ArrayList<>();
        for (BackendTerrarium backendTerrarium : backendTerrariums) {
            terrariums.add(new Terrarium(
                    backendTerrarium.getName(),
                    backendTerrarium.getHumidity_goal(),
                    backendTerrarium.getTemperature_goal()
            ));
        }
        return terrariums;
    }
}
