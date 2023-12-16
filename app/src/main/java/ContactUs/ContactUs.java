/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 25/12/20 7:54 PM
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

package ContactUs;

import com.gohool.albaniaguide.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class ContactUs extends AppCompatActivity {

    Toolbar toolbar;
    EditText et_subject,et_message;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.menu_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Contact");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        et_subject = findViewById(R.id.email_subject);
        et_message = findViewById(R.id.email_message);
        btn = findViewById(R.id.email_send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject = et_subject.getText().toString().trim();
                String message = et_message.getText().toString().trim();
                String email = "naldisenior@gmail.com";
                if(subject.isEmpty())
                {
                    Toast.makeText(ContactUs.this, "Please add Subject", Toast.LENGTH_SHORT).show();
                }
                else if(message.isEmpty())
                {
                    Toast.makeText(ContactUs.this, "Please add some Message", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String mail = "mailto:" + email +
                            "?&subject=" + Uri.encode(subject) +
                            "&body=" + Uri.encode(message);
                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse(mail));
                    try {
                        startActivity(Intent.createChooser(intent,"Send Email.."));
                    }
                    catch (Exception e)
                    {
                        Toast.makeText(ContactUs.this, "Exception: "+e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}