package com.example.ammaryasser.portsaidtourguide;

public class Card {

    private int placeName;
    private int placeDescription;
    private int placeOpenTime;
    private int placeCloseTime;
    private int placeImageRId;

    /**
     * Create a new Card object with the name, description, open, close times and a photo of the
     * place
     *
     * @param placeName        is used to set the place name for the word object.
     * @param placeDescription is used to set the description text that appear in the bottom of the
     *                         card
     * @param placeOpenTime    is used to set the time the place is supposed to open in 24-hour format
     * @param placeCloseTime   is used to set the time the place is supposed to close in 24-hour
     *                         format
     * @param placeImageRId    is used to set the image for the place in the card
     */

    public Card(int placeName, int placeDescription, int placeOpenTime, int placeCloseTime,
                int placeImageRId) {
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.placeOpenTime = placeOpenTime;
        this.placeCloseTime = placeCloseTime;
        this.placeImageRId = placeImageRId;
    }

    public int getPlaceName() {
        return placeName;
    }

    public void setPlaceName(int placeName) {
        this.placeName = placeName;
    }

    public int getPlaceDescription() {
        return placeDescription;
    }

    public void setPlaceDescription(int placeDescription) {
        this.placeDescription = placeDescription;
    }

    public int getPlaceOpenTime() {
        return placeOpenTime;
    }

    public void setPlaceOpenTime(int placeOpenTime) {
        this.placeOpenTime = placeOpenTime;
    }

    public int getPlaceCloseTime() {
        return placeCloseTime;
    }

    public void setPlaceCloseTime(int placeCloseTime) {
        this.placeCloseTime = placeCloseTime;
    }

    public int getPlaceImageRId() {
        return placeImageRId;
    }

    public void setPlaceImageRId(int placeImageRId) {
        this.placeImageRId = placeImageRId;
    }
}

