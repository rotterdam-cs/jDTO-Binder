/*
 *    Copyright 2011 Juan Alberto López Cavallotti
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jdto.entities;

/**
 * Simple business object with association.
 * @author Juan Alberto Lopez Cavallotti
 */
public class SimpleAssociation {
    
    private SimpleEntity related;
    
    private String myString;

    public SimpleAssociation() {
    }

    public SimpleAssociation(SimpleEntity related, String myString) {
        this.related = related;
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public SimpleEntity getRelated() {
        return related;
    }

    public void setRelated(SimpleEntity related) {
        this.related = related;
    }
    
}
