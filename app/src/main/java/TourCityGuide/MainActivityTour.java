/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 22/12/20 6:56 PM
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

package TourCityGuide;

import com.gohool.albaniaguide.R;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivityTour extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tour);

        toolbar = (Toolbar) findViewById(R.id.menu_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Explore");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewPager viewpager = (ViewPager)findViewById(R.id.view_pager);

        TourCityGuide.ViewAdapterPage adpter = new TourCityGuide.ViewAdapterPage(this, getSupportFragmentManager());

        viewpager.setAdapter(adpter);

        TabLayout tablayout = (TabLayout)findViewById(R.id.tab_layout);
        tablayout.setupWithViewPager(viewpager);

    }
}
