package org.example;

public class ColisionResult {
    private Integer[] coordinates;
    private String errorMessage;

    public ColisionResult(Integer[] coordinates) {
        this.coordinates = coordinates;
    }

    public ColisionResult(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean hasError() {
        return errorMessage != null;
    }

    public Integer[] getCoordinates() {
        return coordinates;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
