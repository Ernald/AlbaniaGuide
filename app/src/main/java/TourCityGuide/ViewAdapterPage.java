/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 22/12/20 3:59 PM
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
import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewAdapterPage extends FragmentPagerAdapter {

    Context mcontext;
    public ViewAdapterPage(Context context, FragmentManager fm)
    {
        super(fm);
        mcontext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if(position == 0)
        {
            return new HistorialPlacesFragment();
        }
        else if(position == 1)
        {
            return new FoodStreetFragment();
        }
        else if(position == 2)
        {
            return new ShoppingPlacesFragment();
        }
        else
        {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
        {
            return mcontext.getString(R.string.HistorialPlaces);
        }
        else if(position == 1)
        {
            return mcontext.getString(R.string.FoodStreets);
        }
        else if(position == 2)
        {
            return mcontext.getString(R.string.ShoppingPlaces);
        }
        else
        {
            return mcontext.getString(R.string.Hotels);
        }
    }


}
