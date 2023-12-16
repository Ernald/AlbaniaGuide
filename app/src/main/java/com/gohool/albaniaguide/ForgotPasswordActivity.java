/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 16/12/20 3:56 PM
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

package com.gohool.albaniaguide;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class ForgotPasswordActivity extends AppCompatActivity {

    private TextView emailHolder;
    private Button sendRequest;
    FirebaseAuth fAuth;
    private ProgressBar progressBar;
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        emailHolder = (TextView) findViewById(R.id.et_email);
        sendRequest = (Button) findViewById(R.id.button_send);
        fAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar_);

        toolbar = (Toolbar) findViewById(R.id.menu_toolbar);
        //Activate action Bar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Forgot Password");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            //Create send button
            sendRequest.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String holderEmail = emailHolder.getText().toString();
                    if(!holderEmail.isEmpty()) {
                        progressBar.setVisibility(View.VISIBLE);
                        fAuth.sendPasswordResetEmail(emailHolder.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(ForgotPasswordActivity.this, "Reset link sent to your E-mail.", Toast.LENGTH_SHORT).show();
                                    progressBar.setVisibility(View.GONE);
                                } else {
                                    Toast.makeText(ForgotPasswordActivity.this, "Failed! Try again.", Toast.LENGTH_SHORT).show();
                                    progressBar.setVisibility(View.GONE);
                                }
                            }
                        });
                    }
                    else Toast.makeText(ForgotPasswordActivity.this, "No email!", Toast.LENGTH_SHORT).show();
                }
            });
    }
}