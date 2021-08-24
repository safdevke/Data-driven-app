package com.app.model;

public class Publication {

    final String title;
    final String author;
    final String url;

    public Publication(String title, String author, String url) {
        this.title = title;
        this.author = author;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getUrl() {
        return url;
    }
}
