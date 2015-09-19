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
 * Copyright 2014-2015
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
package hu.bme.mit.sette.common.exceptions;

/**
 * Exception class for configuration exceptions.
 */
public final class ConfigurationException extends SetteException {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5487930232210124752L;

    /**
     * Instantiates a new configuration exception.
     *
     * @param message
     *            the message
     */
    public ConfigurationException(String message) {
        this(message, null);
    }

    /**
     * Instantiates a new configuration exception.
     *
     * @param message
     *            the message
     * @param cause
     *            the cause
     */
    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}