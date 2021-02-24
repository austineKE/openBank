package com.api.openBank.home.transactions;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * this is the metadata object
 * holds image url
 */
public class Metadata {

    private String image_URL;

    public String getImage_URL() {
        return image_URL;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
    }
}
