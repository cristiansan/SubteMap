package com.lod.mapab;

import android.app.Activity;
import android.os.Bundle;

import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapquest.mapping.maps.MapView;
import com.mapquest.mapping.maps.MapboxMap;
import com.mapquest.mapping.maps.OnMapReadyCallback;

public class MainActivity extends Activity {
    /*private final LatLng SAN_FRAN = new LatLng(37.7749, -122.4194);*/
    private final LatLng SAN_FRAN = new LatLng(-34.6293, -58.4009);
    private MapboxMap mMapboxMap;
    private MapView mMapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mMapView = (MapView) findViewById(R.id.mapquestMapView);
        mMapView.onCreate(savedInstanceState);

        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mMapboxMap = mapboxMap;
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SAN_FRAN, 11));
                addMarker(mMapboxMap);
            }
        });
    }

    private void addMarker(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(SAN_FRAN);
        markerOptions.title("Inclan");
        markerOptions.snippet("Estación de la H!");
        mapboxMap.addMarker(markerOptions);
    }
}