package edu.jhuapl.dorset;

/**
 * Response codes and messages
 *
 */
public enum ResponseCode {
    SUCCESS(0, "Success"),
    INTERNAL_ERROR(100, "Something failed with this request."),
    UNKNOWN_REQUEST(101, "We don't know how to handle this request."),
    AGENT_SPECIFIC_ERROR(200, "");

    private final int code;
    private final String message;

    private ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the status code
     * @return status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Get the status message
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * Is this a successful response
     * @return boolean
     */
    public boolean isSuccess() {
        return code == SUCCESS.getCode();
    }
}
