package com.lod.mapab;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapquest.mapping.maps.MapView;
import com.mapquest.mapping.maps.MapboxMap;
import com.mapquest.mapping.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private final LatLng INCLAN = new LatLng(-34.6293, -58.4009);
    private final LatLng CASEROS = new LatLng(-34.6357, -58.3989);
    private final LatLng HUMBERTOPRIMO = new LatLng(-34.6230, -58.4023);
    private final LatLng VENEZUELA = new LatLng(-34.6152, -58.4047);
    private final LatLng ONCE = new LatLng(-34.6089, -58.4060);
    private final LatLng CORRIENTES = new LatLng(-34.6044, -58.4054);
    private final LatLng PARQUEPATRICIOS = new LatLng(-34.6384, -58.4057);
    private final LatLng HOSPITALES = new LatLng(-34.6412, -58.4123);
    private final LatLng CORDOBA = new LatLng(-34.5984, -58.4037);
    private final LatLng SANTAFE = new LatLng(-34.5948, -58.4024);
    private final LatLng LASHERAS = new LatLng(-34.5874, -58.3972);

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
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(INCLAN, 11));
                addMarker(mMapboxMap);
                setPoyline(mMapboxMap);
                setLineA(mMapboxMap);

            }
            private void setPoyline(MapboxMap mapboxMap) {
                List<LatLng> coordinates = new ArrayList<>();
                coordinates.add(new LatLng(-34.5874, -58.3972));//lasheras
                coordinates.add(new LatLng(-34.5948, -58.4024));//santafe
                coordinates.add(new LatLng(-34.5984, -58.4037));//cordoba
                coordinates.add(new LatLng(-34.6044, -58.4054));//corrientes
                coordinates.add(new LatLng(-34.6089, -58.4060));//once
                coordinates.add(new LatLng(-34.6152, -58.4047));//venezuela
                coordinates.add(new LatLng(-34.6230, -58.4023));//humberto 1°
                coordinates.add(new LatLng(-34.6293, -58.4009));//inclan
                coordinates.add(new LatLng(-34.6357, -58.3989));//caseros
                coordinates.add(new LatLng(-34.6384, -58.4057));//patricios
                coordinates.add(new LatLng(-34.6412, -58.4123));//hospitales

                PolylineOptions polyline = new PolylineOptions();
                polyline.addAll(coordinates);
                polyline.width(13);
                polyline.color(Color.YELLOW);
                mapboxMap.addPolyline(polyline);
            }

            private void setLineA(MapboxMap mapboxMap) {
                List<LatLng> coordinates = new ArrayList<>();
                coordinates.add(new LatLng(-34.6087073, -58.3706188));//plaza de mayo
                coordinates.add(new LatLng(-34.6085571, -58.374567));//peru
                coordinates.add(new LatLng(-34.6089898, -58.3806825));//piedras
                coordinates.add(new LatLng(-34.6091068, -58.3825198));//lima
                coordinates.add(new LatLng(-34.6109625,-58.3949675));//saenzpeña
                coordinates.add(new LatLng(-34.6092415, -58.3926719));//congreso
                coordinates.add(new LatLng(-34.6096653, -58.3983395));//paso
                coordinates.add(new LatLng(-34.6098331, -58.4007186));//alberti
                coordinates.add(new LatLng(-34.6096874, -58.4068125));//miserere
                coordinates.add(new LatLng(-34.6108111, -58.4151542));//loria
                coordinates.add(new LatLng(-34.6117647, -58.4217283));//castrobarros
                coordinates.add(new LatLng(-34.6180364, -58.4358609));//acoyte
                coordinates.add(new LatLng(-34.6204596, -58.4414023));//primerajunta
                coordinates.add(new LatLng(-34.6235718, -58.4487891));//puan
                coordinates.add(new LatLng(-34.6264235, -58.4560445));//carabobo
                coordinates.add(new LatLng(-34.6290543, -58.4635359));//sanjose
                coordinates.add(new LatLng(-34.6309215, -58.4704345));//sanpedrito




                PolylineOptions polyline = new PolylineOptions();
                polyline.addAll(coordinates);
                polyline.width(13);
                polyline.color(Color.CYAN);
                mapboxMap.addPolyline(polyline);
            }


        });

        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mMapboxMap = mapboxMap;
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CASEROS, 11));
                addMarkerCaseros(mMapboxMap);
            }
        });
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mMapboxMap = mapboxMap;
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HUMBERTOPRIMO, 11));
                addMarkerHumpertoPrimo(mMapboxMap);
            }
        });
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mMapboxMap = mapboxMap;
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(VENEZUELA, 11));
                addMarkerVenezuela(mMapboxMap);
            }
        });
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mMapboxMap = mapboxMap;
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ONCE, 11));
                addMarkerOnce(mMapboxMap);
            }
        });
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mMapboxMap = mapboxMap;
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CORRIENTES, 11));
                addMarkerCorrientes(mMapboxMap);
            }
        });
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mMapboxMap = mapboxMap;
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(PARQUEPATRICIOS, 11));
                addMarkerParquePatricios(mMapboxMap);
            }
        });
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mMapboxMap = mapboxMap;
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HOSPITALES, 11));
                addMarkerHospitales(mMapboxMap);
            }
        });
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mMapboxMap = mapboxMap;
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CORDOBA, 11));
                addMarkerCordoba(mMapboxMap);
            }
        });
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mMapboxMap = mapboxMap;
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SANTAFE, 11));
                addMarkerSantaFe(mMapboxMap);
            }
        });
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mMapboxMap = mapboxMap;
                mMapboxMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LASHERAS, 11));
                addMarkerLasHeras(mMapboxMap);
            }
        });
    }

    private void addMarker(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(INCLAN);
        markerOptions.title("Inclan");
        markerOptions.snippet("Línea H!");
        mapboxMap.addMarker(markerOptions);
    }
    private void addMarkerCaseros(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(CASEROS);
        markerOptions.title("Caseros");
        markerOptions.snippet("Estación de la H!");
        mapboxMap.addMarker(markerOptions);
    }
    private void addMarkerHumpertoPrimo(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(HUMBERTOPRIMO);
        markerOptions.title("Humberto Primo");
        markerOptions.snippet("Estación de la H!");
        mapboxMap.addMarker(markerOptions);
    }
    private void addMarkerVenezuela(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(VENEZUELA);
        markerOptions.title("Venezuela");
        markerOptions.snippet("Estación de la H!");
        mapboxMap.addMarker(markerOptions);
    }
    private void addMarkerOnce(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(ONCE);
        markerOptions.title("Once");
        markerOptions.snippet("Estación de la H!");
        mapboxMap.addMarker(markerOptions);
    }
    private void addMarkerCorrientes(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(CORRIENTES);
        markerOptions.title("Corrientes");
        markerOptions.snippet("Estación de la H!");
        mapboxMap.addMarker(markerOptions);
    }
    private void addMarkerParquePatricios(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(PARQUEPATRICIOS);
        markerOptions.title("Parque Patricios");
        markerOptions.snippet("Estación de la H!");
        mapboxMap.addMarker(markerOptions);
    }
    private void addMarkerHospitales(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(HOSPITALES);
        markerOptions.title("Hospitales");
        markerOptions.snippet("Estación de la H!");
        mapboxMap.addMarker(markerOptions);
    }
    private void addMarkerCordoba(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(CORDOBA);
        markerOptions.title("Córdoba");
        markerOptions.snippet("Estación de la H!");
        mapboxMap.addMarker(markerOptions);
    }
    private void addMarkerSantaFe(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(SANTAFE);
        markerOptions.title("Santa Fe");
        markerOptions.snippet("Estación de la H!");
        mapboxMap.addMarker(markerOptions);
    }
    private void addMarkerLasHeras(MapboxMap mapboxMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(LASHERAS);
        markerOptions.title("Las Heras");
        markerOptions.snippet("Estación de la H!");
        mapboxMap.addMarker(markerOptions);
    }
}
