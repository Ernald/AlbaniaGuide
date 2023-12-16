/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 29/12/20 5:38 AM
 *
 *   Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 *   except in compliance with the License. You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENS... Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *    either express or implied. See the License for the specific language governing permissions and
 *    limitations under the License.
 * /
 *
 */

package GoogleMap;

import com.gohool.albaniaguide.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlbaniaMap extends AppCompatActivity implements OnMapReadyCallback {

    Toolbar toolbar;
    SupportMapFragment mapFragment;
    private GoogleMap mMap;
    private AdView adView;
    Spinner spType;
    Button btFind;
    FusedLocationProviderClient fusedLocationProviderClient;
    double currentLat =0,currentLong=0;

    //Cities
    ArrayList<LatLng> arrayList = new ArrayList<>();
    LatLng Albania = new LatLng(41.1533, 20.1683);
    LatLng Llogara = new LatLng(40.2177, 19.5628);
    LatLng Tirana = new LatLng(41.3275, 19.8187);
    LatLng Fieri = new LatLng(40.7275, 19.5628);
    LatLng Vlora = new LatLng(40.4661, 19.4914);
    LatLng Durres = new LatLng(41.3246, 19.4565);
    LatLng Shkodra = new LatLng(42.0693, 19.5033);
    LatLng Berati = new LatLng(40.7086, 19.9437);
    LatLng Saranda = new LatLng(39.8592, 20.0271);
    LatLng Gjirokastra = new LatLng(40.0673, 20.1045);
    LatLng Pogradeci = new LatLng(40.9015, 20.6556);
    LatLng Kruja = new LatLng(41.5095, 19.7711);
    LatLng Theth = new LatLng(42.4046, 19.7681);
    LatLng Korce = new LatLng(40.6141, 20.7778);
    LatLng Elbasan = new LatLng(41.1102, 20.0867);
    LatLng Peshkopi = new LatLng(41.6849, 20.4292);
    LatLng Librazhd = new LatLng(41.1829, 20.3175);
    //Beaches
    ArrayList<LatLng> arrayList2 = new ArrayList<>();
    LatLng Drymades = new LatLng(40.1510, 19.6416);
    LatLng Palase = new LatLng(40.1664, 19.6238);
    LatLng Dhermi = new LatLng(40.1510, 19.6416);
    LatLng Borsh = new LatLng(40.0559, 19.8514);
    LatLng Ksamil = new LatLng(40.7275, 19.5628);
    LatLng Gjipe = new LatLng(40.1264, 19.6654);
    LatLng Zvernec = new LatLng(40.5105, 19.4125);
    LatLng Seman = new LatLng(40.7939, 19.3759);
    LatLng Shengjin = new LatLng(41.8095, 19.5966);
    LatLng GjiriLalzit = new LatLng(41.4781, 19.5041);
    LatLng Currila = new LatLng(41.321460, 19.429087);
    LatLng Spile = new LatLng(40.1012, 19.7434);
    LatLng Radhime = new LatLng(40.3699, 19.4943);
    LatLng Himara = new LatLng(40.1035, 19.7502);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albania_map);

        toolbar = (Toolbar) findViewById(R.id.menu_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("PushPin Travel Map");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Ads----------------------------------------------------------------------------------
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }

        });
        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        //-------------------------------------------------------------------------------------Ads
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        //Adding location pins in map
        arrayList.add(Fieri);
        arrayList.add(Fieri);
        arrayList.add(Vlora);
        arrayList.add(Saranda);
        arrayList.add(Shkodra);
        arrayList.add(Durres);
        arrayList.add(Gjirokastra);
        arrayList.add(Theth);
        arrayList.add(Berati);
        arrayList.add(Pogradeci);
        arrayList.add(Kruja);
        arrayList.add(Tirana);
        arrayList.add(Albania);
        arrayList.add(Korce);
        arrayList.add(Elbasan);
        arrayList.add(Peshkopi);
        arrayList.add(Librazhd);

        arrayList2.add(Gjipe);
        arrayList2.add(GjiriLalzit);
        arrayList2.add(Shengjin);
        arrayList2.add(Palase);
        arrayList2.add(Drymades);
        arrayList2.add(Dhermi);
        arrayList2.add(Seman);
        arrayList2.add(Zvernec);
        arrayList2.add(Spile);
        arrayList2.add(Radhime);
        arrayList2.add(Currila);
        arrayList2.add(Himara);
        arrayList2.add(Borsh);
        arrayList2.add(Ksamil);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        try {
            boolean success = googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, R.raw.map_style));
        } catch (Resources.NotFoundException e) {
        }
        mMap = googleMap;
        for (int i = 0; i < arrayList.size(); i++) {
            mMap.addMarker(new MarkerOptions().position(arrayList.get(i)).title("Cities in Albania")
                    .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.map_ic_city)));
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            mMap.addMarker(new MarkerOptions().position(arrayList2.get(i)).title("Beach in Albania")
                    .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.beach_umbrella_map)));
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Albania,7));
    }

    private BitmapDescriptor bitmapDescriptorFromVector(Context context, int vectorResId) {
        Drawable vectorDrawable = ContextCompat.getDrawable(context,vectorResId);
        vectorDrawable.setBounds(0,0,vectorDrawable.getIntrinsicWidth(),
                vectorDrawable.getIntrinsicHeight());
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(),
                vectorDrawable.getIntrinsicHeight(),Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }

}