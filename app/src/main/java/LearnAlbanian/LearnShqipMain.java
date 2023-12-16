/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 27/12/20 8:12 PM
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

package LearnAlbanian;

import com.gohool.albaniaguide.R;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LearnShqipMain extends AppCompatActivity {

    Toolbar toolbar;
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_shqip_main);

        toolbar = (Toolbar) findViewById(R.id.menu_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Learn Albanian");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        c1 = findViewById(R.id.learn_alphabet);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),ShowWebFile.class);
                startActivity(n1);
            }
        });

        c2 = findViewById(R.id.learn_number);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),LearnNumbers.class);
                startActivity(n1);
            }
        });

        c3 = findViewById(R.id.learn_essential);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),LearnEssentials.class);
                startActivity(n1);
            }
        });

        c4 = findViewById(R.id.learn_conservation);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),LearnConversation.class);
                startActivity(n1);
            }
        });

        c5 = findViewById(R.id.learn_looking);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),LookingForSomeone.class);
                startActivity(n1);
            }
        });

        c6 = findViewById(R.id.learn_time);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),LearnTime.class);
                startActivity(n1);
            }
        });

        c7 = findViewById(R.id.learn_parting);
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),LearnParty.class);
                startActivity(n1);
            }
        });

        c8 = findViewById(R.id.learn_bar);
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),LearnBar.class);
                startActivity(n1);
            }
        });

        c9 = findViewById(R.id.learn_restaurant);
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),LearnRestaurant.class);
                startActivity(n1);
            }
        });

        c10 = findViewById(R.id.learn_taxi);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),LearnTaxi.class);
                startActivity(n1);
            }
        });


        c11 = findViewById(R.id.learn_beach);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),LearnBeach.class);
                startActivity(n1);
            }
        });


        c12 = findViewById(R.id.learn_hotel);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(getApplicationContext(),LearnHotel.class);
                startActivity(n1);
            }
        });


    }
}