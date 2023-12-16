/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 29/12/20 12:09 AM
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

package Content;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.gohool.albaniaguide.LoginActivity;
import com.gohool.albaniaguide.R;
import com.google.firebase.auth.FirebaseAuth;

import ContactUs.ContactUs;
import LearnAlbanian.LearnShqipMain;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    CardView cityInfo,albMessages,placeRadio,placeWeird,placeMap,placeTranslate;
    private AdView adView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        cityInfo = findViewById(R.id.place_city);
        albMessages = findViewById(R.id.place_message);
        placeRadio = findViewById(R.id.place_radio);
        placeWeird = findViewById(R.id.place_weird);
        placeMap = findViewById(R.id.place_map);
        placeTranslate = findViewById(R.id.place_translate);

        toolbar = (Toolbar) findViewById(R.id.menu_toolbar);
        //Activate action Bar
        setSupportActionBar(toolbar);

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





        //Hide or Show Items
        Menu menu = navigationView.getMenu();
        menu.findItem(R.id.nav_login).setVisible(false);

        //Navigation Drawer Menu
        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toogle);
        toogle.syncState();
        
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);


        placeTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LearnAlbanian.LearnShqipMain.class);
                startActivity(intent);
            }
        });


        placeMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GoogleMap.AlbaniaMap.class);
                startActivity(intent);
            }
        });

        cityInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TourCityGuide.MainActivityTour.class);
                startActivity(intent);
            }
        });

        albMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AlbMessage.MainActivity.class);
                startActivity(intent);
            }
        });

        placeRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MediaMPlayer.MusicMainActivity.class);
                startActivity(intent);
            }
        });


        placeWeird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Content.WeirdAlbania.class);
                startActivity(intent);
            }
        });




    }

    //-----------------------------------------------------------------Ad
    /** Called when leaving the activity */
    @Override
    public void onPause() {
        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    /** Called when returning to the activity */
    @Override
    public void onResume() {
        super.onResume();
        if (adView != null) {
            adView.resume();
        }
    }

    /** Called before the activity is destroyed */
    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    //------------------------------------------------------------------------Ad

    //Nav method
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuitem) {
        switch(menuitem.getItemId()){
            case R.id.nav_home:
                drawerLayout.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_place:
                Intent goExplore = new Intent(getApplicationContext(), TourCityGuide.MainActivityTour.class);
                startActivity(goExplore);
                break;
            case R.id.nav_music:
                Intent navM = new Intent(getApplicationContext(), MediaMPlayer.MusicMainActivity.class);
                startActivity(navM);
                break;
            case R.id.nav_weird:
                Intent navWeid = new Intent(getApplicationContext(), Content.WeirdAlbania.class);
                startActivity(navWeid);
                break;
            case R.id.nav_maps:
                Intent navMap = new Intent(getApplicationContext(), GoogleMap.AlbaniaMap.class);
                startActivity(navMap);
                break;
            case R.id.nav_AlbGroupMessage:
                Intent goMessages = new Intent(getApplicationContext(), AlbMessage.MainActivity.class);
                startActivity(goMessages);
                break;
            case R.id.nav_learn:
                Intent goLearn = new Intent(getApplicationContext(), LearnAlbanian.LearnShqipMain.class);
                startActivity(goLearn);
                break;
            case R.id.nav_logout:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();
                break;
            case R.id.nav_contact:
                Intent goContact = new Intent(getApplicationContext(), ContactUs.class);
                startActivity(goContact);
                break;
            case R.id.nav_share:
                try {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT,"Albania Guide");
                    i.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                    startActivity(Intent.createChooser(i,"Share With"));
                }catch(Exception e){
                    Toast.makeText(this,"Unable to share this app.",Toast.LENGTH_SHORT).show();
            }
                break;
            case R.id.nav_rate:
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                try {
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(this,"Unable to open\n"+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
                break;
        }

        return true;
    }
}