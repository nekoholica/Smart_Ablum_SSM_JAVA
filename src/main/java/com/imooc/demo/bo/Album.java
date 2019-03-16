package com.imooc.demo.bo;

import javax.xml.crypto.Data;
import java.util.Date;

public class Album {
    private int albumId;
    private String albumName;
    private Date albumCreateTime;
    private String albumCover;
    private int userId;
    private String albumDescribtion;

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Date getAlbumCreateTime() {
        return albumCreateTime;
    }

    public void setAlbumCreateTime(Date albumCreateTime) {
        this.albumCreateTime = albumCreateTime;
    }

    public String getAlbumCover() {
        return albumCover;
    }

    public void setAlbumCover(String albumCover) {
        this.albumCover = albumCover;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAlbumDescribtion() {
        return albumDescribtion;
    }

    public void setAlbumDescribtion(String albumDescribtion) {
        this.albumDescribtion = albumDescribtion;
    }
}