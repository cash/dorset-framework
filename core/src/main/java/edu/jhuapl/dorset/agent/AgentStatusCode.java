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
package edu.jhuapl.dorset.agent;

import java.util.HashMap;
import java.util.Map;

/**
 * Status codes and messages for Agents
 */
public class AgentStatusCode {
    public static final int SUCCESS = 0;
    // the remote agent did not respond
    public static final int NO_RESPONSE = 100;
    // the agent did not understand the request
    public static final int BAD_REQUEST = 101;
    // the agent's response was invalid
    public static final int INVALID_RESPONSE = 102;
    // the agent did not know the answer
    public static final int UNKNOWN_ANSWER = 103;
    // the agent needs more information
    public static final int MORE_INFORMATION_NEEDED = 104;
    
    static private Map<Integer, String> map;
    static {
        map = new HashMap<Integer, String>();
        map.put(SUCCESS, "Success");
        map.put(NO_RESPONSE, "No response from the remote agent");
        map.put(BAD_REQUEST, "The agent did not understand the request");
        map.put(INVALID_RESPONSE, "The remote agent had an invalid response");
        map.put(UNKNOWN_ANSWER, "The agent did not know the answer to the question");
        map.put(MORE_INFORMATION_NEEDED, "The agent needs more information");
    }

    private final int code;
    private final String message;

    public AgentStatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
/*

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code == SUCCESS.getCode();
    }
    public static final int SUCCESS = 0;
    // the agent did not respond
    public static final int NO_RESPONSE = 100;
    // the agent did not understand the request
    public static final int BAD_REQUEST = 101;
    // the agent's response was invalid
    public static final int INVALID_RESPONSE = 102;
    // the agent did not know the answer
    public static final int UNKNOWN_ANSWER = 103;
    // the agent needs more information
    public static final int MORE_INFORMATION_NEEDED = 104;
*/
}
