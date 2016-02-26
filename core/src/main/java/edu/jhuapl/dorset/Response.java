/*
 * Copyright 2016 The Johns Hopkins University Applied Physics Laboratory LLC
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.jhuapl.dorset;

/**
 * Dorset Response
 *
 * Represents the response to a request to the application.
 *
 * If the statusCode is not AgentMessages.SUCCESS, the text field can be left blank.
 */
public class Response {
    private String text;
    private ResponseCode status;

    /**
     * Create a response
     * @param text the text of the response
     */
    public Response(String text) {
        this.text = text;
        this.status = ResponseCode.SUCCESS;
    }

    /**
     * Create a response
     * @param text the text of the response
     * @param status the status code
     */
    public Response(String text, ResponseCode status) {
        this.text = text;
        this.status = status;
    }

    /**
     * Create a response
     * @param code the status code
     */
    public Response(ResponseCode status) {
        this.status = status;
    }

    /**
     * Get the text of the response
     *
     * Can return a null if an error occurred.
     *
     * @return the text of the response
     */
    public String getText() {
        return text;
    }

    /**
     * Set the text of the response
     * @param text the text of the response
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Get the status of the response
     * @return the status
     */
    public ResponseCode getStatus() {
        return status;
    }

    /**
     * Set the status of the response
     * @param code the status
     */
    public void setStatusCode(ResponseCode status) {
        this.status = status;
    }
}
