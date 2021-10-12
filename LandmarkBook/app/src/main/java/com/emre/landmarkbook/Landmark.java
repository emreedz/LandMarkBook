package com.emre.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {

    int landmarkimage;
    String landmarkName;
    String landmarkCountry;

    public Landmark(int landmark, String landmarkName, String landmarkCountry) {
        this.landmarkimage = landmark;
        this.landmarkName = landmarkName;
        this.landmarkCountry = landmarkCountry;
    }
}
