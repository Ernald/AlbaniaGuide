/*
 *
 *   Created Ernald Zykaj on 29/12/20 10:26 PM
 *   Copyright Ⓒ 2020. All rights reserved Ⓒ 2020
 *   Last modified: 18/12/20 12:55 AM
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

package AlbMessage;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class FireHelper {

    private static FireHelper single_instance = null;


    public String s;
    private static FirebaseAuth mAuth;
    private static FirebaseUser mUser;

    private FireHelper()
    {
        s = "Hello I am a string part of Singleton class";
    }

    // static method to create instance of Singleton class
    public static FireHelper getInstance()
    {
        if (single_instance == null)
            single_instance = new FireHelper();

        return single_instance;
    }

    public static FirebaseAuth AuthInit() {

        mAuth = FirebaseAuth.getInstance();

        return mAuth;

    }

    public static FirebaseUser getCurrentUser() {

        mUser = FirebaseAuth.getInstance().getCurrentUser();

        return mUser;

    }



}
