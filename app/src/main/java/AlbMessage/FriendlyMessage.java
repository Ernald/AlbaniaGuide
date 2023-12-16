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


import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

// [START comment_class]
@IgnoreExtraProperties
public class FriendlyMessage implements Serializable {

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    private String text;
    private String name;
    private String timeStamp;
    private String fromUserId;

    public FriendlyMessage() {

    }

    public FriendlyMessage(String text, String name, String fromUserId, String timeStamp) {
        this.text = text;
        this.name = name;
        this.fromUserId = fromUserId;
        this.timeStamp = timeStamp;
    }

}
