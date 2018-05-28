package com.ngocdiem.map;


import java.util.ArrayList;

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(ArrayList<Route> item);
}
