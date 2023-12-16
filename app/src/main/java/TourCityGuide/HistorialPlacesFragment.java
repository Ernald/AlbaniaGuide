/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 25/12/20 6:25 PM
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
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class HistorialPlacesFragment extends Fragment {

    Activity context;

    public HistorialPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_historial_places, container, false);


        CardView t1 = (CardView) view.findViewById(R.id.place_albania);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), TourCityGuide.Activity_Historical_Albania.class);
                startActivity(i1);
            }
        });


        CardView t2 = (CardView) view.findViewById(R.id.place_tirana);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), TourCityGuide.Activity_Historical_Tirana.class);
                startActivity(i2);
            }
        });


        CardView t3 = (CardView) view.findViewById(R.id.place_gjirokastra);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), TourCityGuide.Activity_Historical_Gjirokastra.class);
                startActivity(i3);
            }
        });


        CardView t4 = (CardView) view.findViewById(R.id.place_vlora);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), TourCityGuide.Activity_Historical_Vlora.class);
                startActivity(i4);
            }
        });


        CardView t5 = (CardView) view.findViewById(R.id.place_berati);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), TourCityGuide.Activity_Historical_Berat.class);
                startActivity(i5);
            }
        });


        CardView t6 = (CardView) view.findViewById(R.id.place_fieri);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getActivity(), TourCityGuide.Activity_Historical_Fieri.class);
                startActivity(i6);
            }
        });


        CardView t7 = (CardView) view.findViewById(R.id.place_dajti);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getActivity(), TourCityGuide.Activity_Historicial_Dajti.class);
                startActivity(i7);
            }
        });


        CardView t8 = (CardView) view.findViewById(R.id.place_durres);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(getActivity(), TourCityGuide.Activity_Historicial_Durres.class);
                startActivity(i8);
            }
        });


        CardView t9 = (CardView) view.findViewById(R.id.place_koman);
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9 = new Intent(getActivity(), TourCityGuide.Activity_Historicial_Koman.class);
                startActivity(i9);
            }
        });


        CardView t10 = (CardView) view.findViewById(R.id.place_kruje);
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i10 = new Intent(getActivity(), TourCityGuide.Activity_Historicial_Kruje.class);
                startActivity(i10);
            }
        });


        CardView t11 = (CardView) view.findViewById(R.id.place_ksamil);
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i11 = new Intent(getActivity(), TourCityGuide.Activity_Historicial_Ksamil.class);
                startActivity(i11);
            }
        });


        CardView t12 = (CardView) view.findViewById(R.id.place_llogara);
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getActivity(), TourCityGuide.Activity_Historicial_Llogara.class);
                startActivity(i12);
            }
        });


        CardView t13 = (CardView) view.findViewById(R.id.place_pogradec);
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i13 = new Intent(getActivity(), TourCityGuide.Activity_Historicial_Pogradec.class);
                startActivity(i13);
            }
        });


        CardView t14 = (CardView) view.findViewById(R.id.place_sarande);
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i14 = new Intent(getActivity(), TourCityGuide.Activity_Historicial_Sarande.class);
                startActivity(i14);
            }
        });


        CardView t15 = (CardView) view.findViewById(R.id.place_theth);
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i15 = new Intent(getActivity(), TourCityGuide.Activity_Historicial_Theth.class);
                startActivity(i15);
            }
        });
        return view;
    }




}
