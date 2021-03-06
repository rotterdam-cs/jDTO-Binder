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

package org.jdto.dtos;

import org.jdto.annotation.DTOConstructor;
import org.jdto.annotation.Source;

/**
 * Immutable class for testing Immutable DTOs
 * @author Juan Alberto Lopez Cavallotti
 */
public final class SimpleImmutableDTO {
    private final String firstString;
    private final String secondString;
    
    //make this the DTO constructor.
    @DTOConstructor
    public SimpleImmutableDTO(@Source("myString") String firstString, @Source("related.aString") String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }
    
    public SimpleImmutableDTO(String firstString, String secondString, String thirdString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }
    
    public String getFirstString() {
        return firstString;
    }

    public String getSecondString() {
        return secondString;
    }
    
}
