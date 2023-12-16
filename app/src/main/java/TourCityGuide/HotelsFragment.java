/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 22/12/20 11:20 PM
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
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotels, container, false);

        // No:-1
        // Luxus Grand hotel action perform and open new activity ( activity_Hotels_Luxus )

        CardView t1 = (CardView) view.findViewById(R.id.luxus_hotel_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), TourCityGuide.activity_Hotels_Tirana_International.class);
                startActivity(i1);
            }
        });


        // No:2
        // Heritage luxury suites action perform and open new activity ( activity_hotels_Heritage_luxury )

        CardView t2 = (CardView)view.findViewById(R.id.heritage_hotel_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), TourCityGuide.activity_hotels_Plaza.class);
                startActivity(i2);
            }
        });



        // No:- 3
        // Pearl COntinental action perform and open new activity ( activity_Hotels_PC )

        CardView t3 = (CardView)view.findViewById(R.id.pc_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), TourCityGuide.activity_Hotels_Colosseo.class);
                startActivity(i3);
            }
        });

        // No:- 4
        // Nishat hotel action perform and open new activity ( activity_Hotels_nishat )

        CardView t4 = (CardView)view.findViewById(R.id.Nishat_hotel_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), TourCityGuide.activity_Hotels_Palace.class);
                startActivity(i4);
            }
        });

        // No:5
        // Avari lahore action perform and open new activity ( actvity_hotels_avari )

        CardView t5 = (CardView)view.findViewById(R.id.Avari_hotel_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), TourCityGuide.activity_hotels_Fieri.class);
                startActivity(i5);
            }
        });





        return view;
    }


}
