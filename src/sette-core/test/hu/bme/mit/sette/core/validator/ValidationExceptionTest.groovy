/*
 * SETTE - Symbolic Execution based Test Tool Evaluator
 *
 * SETTE is a tool to help the evaluation and comparison of symbolic execution based test input 
 * generator tools.
 *
 * Budapest University of Technology and Economics (BME)
 *
 * Authors: Lajos Cseppentő <lajos.cseppento@inf.mit.bme.hu>, Zoltán Micskei <micskeiz@mit.bme.hu>
 *
 * Copyright 2014-2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except 
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the 
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either 
 * express or implied. See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package hu.bme.mit.sette.core.validator

import org.junit.Test

import groovy.transform.TypeChecked;

/**
 * Tests for {@link ValidationException}.
 */
@TypeChecked
class ValidationExceptionTest {
    @Test(expected = NullPointerException)
    void testThrowsExceptionifNullValidator() {
        new ValidationException((Validator) null)
    }

    @Test(expected = IllegalArgumentException)
    void testThrowsExceptionifValidatorHasNoErrors() {
        new ValidationException(new Validator<>('subject'))
    }

    @Test
    void testExceptionMessageForValidator() {
        Validator<String> v = new Validator<>('subject')
        v.addError('error1')
        v.addError('error2')

        ValidationException ex = new ValidationException(v)

        assert ex.validator == v
        assert ex.message == 'Validation has failed for subject\n' + v.toString(5)
    }
}
