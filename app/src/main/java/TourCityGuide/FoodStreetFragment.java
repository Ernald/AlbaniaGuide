/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 22/12/20 9:33 PM
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


public class FoodStreetFragment extends Fragment {

    public FoodStreetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food_street, container, false);

        // No:- 1 Haleem activity

        CardView t1 = (CardView) view.findViewById(R.id.haleem_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), TourCityGuide.Activity_Foods_Bakllava.class);
                startActivity(i1);
            }
        });

        // No:-2 Seekh kabab Activity

        CardView t2 = (CardView) view.findViewById(R.id.seekh_kebab_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), TourCityGuide.Activity_Foods_Byrek.class);
                startActivity(i2);
            }
        });

        // No.3 Biryani activity

        CardView t3 = (CardView) view.findViewById(R.id.biryani_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), TourCityGuide.Activity_Foods_Tarator.class);
                startActivity(i3);
            }
        });

        // No.4 halwa puri activty

        CardView t4 = (CardView) view.findViewById(R.id.halwa_puri_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), TourCityGuide.Activity_Foods_Raki_Rrushi.class);
                startActivity(i4);
            }
        });

        // No. 5 Methi lassi activity

        CardView t5 = (CardView) view.findViewById(R.id.Lassi_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), TourCityGuide.Activity_Foods_Ferges.class);
                startActivity(i5);
            }
        });


        // No.6 Channay

        CardView t6 = (CardView) view.findViewById(R.id.Chanay_textView);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getActivity(), TourCityGuide.Activity_Foods_Ashure.class);
                startActivity(i6);
            }
        });

        // No.7 Karahi

        CardView t7 = (CardView) view.findViewById(R.id.karahi_textView);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getActivity(), TourCityGuide.Activity_Foods_Tavkosi.class);
                startActivity(i7);
            }
        });


        return view;
    }

}
