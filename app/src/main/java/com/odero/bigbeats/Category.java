package com.odero.bigbeats;

public class Category {
    private String categoryName, categoryDescription, numberOfSongs;
    private int imageId;

    public Category(String categoryName, String categoryDescription, String numberOfSongs, int imageId) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.numberOfSongs = numberOfSongs;
        this.imageId = imageId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(String numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
