/*
 * Author : Naveen Kumar
 * Date : 30-01-2023
 * Created With : IntelliJ IDEA Community Edition
 */

package com.niit.domain;

public class Artist {
    int artistId;
    String artistName;

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", artistName='" + artistName + '\'' +
                '}';
    }

    public Artist() {
    }

    public Artist(int artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }
}
