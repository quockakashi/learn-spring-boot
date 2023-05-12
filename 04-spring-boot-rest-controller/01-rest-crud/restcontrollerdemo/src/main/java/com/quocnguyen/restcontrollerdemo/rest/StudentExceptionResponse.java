package com.quocnguyen.restcontrollerdemo.rest;

public class StudentExceptionResponse {
    private int status;
    private String message;
    private long timeStamp;

    public StudentExceptionResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public StudentExceptionResponse() {}

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
