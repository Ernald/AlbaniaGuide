/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 28/12/20 11:21 PM
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
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class ShoppingPlacesFragment extends Fragment {


    public ShoppingPlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_shopping_places, container, false);

        // No.1
        // make new activty ( activity_shoppingPlaces_emporium )

        CardView t1 = (CardView) view.findViewById(R.id.emporium_mall_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), activity_shoppingPlaces_Toptani.class);
                startActivity(i1);
            }
        });

        // No:2
        // make new activity ( activity_shoppingPlaces_fortress

        CardView t2 = (CardView) view.findViewById(R.id.Fortress_sqaure_mall_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), TourCityGuide.activity_shoppingPlaces_Teg.class);
                startActivity(i2);
            }
        });


        // No.3
        // make new activity ( activity_shoppingPlaces_mall_lahore )

        CardView t3 = (CardView) view.findViewById(R.id.mall_of_Lahore_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), TourCityGuide.activity_shoppingPlaces_Ring.class);
                startActivity(i3);
            }
        });

        // No.4
        // make activity ( activity_shoppingPlaces_amanaah_mall )

        CardView t4 = (CardView) view.findViewById(R.id.amanah_Mall_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), TourCityGuide.activity_shoppingPlaces_Qtu.class);
                startActivity(i4);
            }
        });

        // No.5
        // make activity ( activity_shoppingPlaces_packages )

        CardView t5 = (CardView) view.findViewById(R.id.packages_Mall_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), TourCityGuide.activity_shoppingPlaces_Etc.class);
                startActivity(i5);
            }
        });




        return view;
    }


}
