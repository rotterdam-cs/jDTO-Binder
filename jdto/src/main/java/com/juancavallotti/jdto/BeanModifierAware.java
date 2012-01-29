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

package com.juancavallotti.jdto;

/**
 * Makes this object aware of the current bean modifier used by the DTO binder
 * instance. Injection is performed by setter dependency injection.
 * @author juan
 */
public interface BeanModifierAware {
    
    /**
     * Expose the BeanModifer to the implementing class.
     * @param modifier the bean modifier instance.
     */
    void setBeanModifier(BeanModifier modifier);
}
