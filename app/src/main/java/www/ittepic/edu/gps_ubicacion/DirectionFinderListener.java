package www.ittepic.edu.gps_ubicacion;


import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import www.ittepic.edu.gps_ubicacion.Route;

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}