package com.odero.bigbeats;

public class Category {
    String categoryName, categoryDescription, numberOfSongs;
    int imageId;

    public Category(String categoryName, String categoryDescription, String numberOfSongs, int imageId) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.numberOfSongs = numberOfSongs;
        this.imageId = imageId;
    }
}
