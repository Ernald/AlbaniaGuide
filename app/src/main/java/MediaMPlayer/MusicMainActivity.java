/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 28/12/20 2:58 AM
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

package MediaMPlayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;
import com.gohool.albaniaguide.R;

import java.util.ArrayList;

public class MusicMainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_activity_main);

        toolbar = (Toolbar) findViewById(R.id.menu_toolbar);
        //Activate action Bar

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Alb Music");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("National Anthem", "Hymn to the Flag", R.raw.himni));
        arrayList.add(new Music("Valle Kosovare", "#Singer", R.raw.valle_kosovare));
        arrayList.add(new Music("Tironc", "#Singer", R.raw.tironc));
        arrayList.add(new Music("Albanian Beat", "Beat", R.raw.albanian_beat));
        arrayList.add(new Music("Albanian Folk", "Folk", R.raw.albanian_folk));
        arrayList.add(new Music("Albanian Summer", "Summer", R.raw.albanian_summer));
        arrayList.add(new Music("Albanian Hit", "Hit", R.raw.albanian_hit));
        arrayList.add(new Music("Aurela", "Mix", R.raw.aurela_mix));
        arrayList.add(new Music("#Name", "Kejsi Tola", R.raw.kejsi_tola));
        arrayList.add(new Music("Llokum", "#Singer", R.raw.llokum));

        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);
    }
}
