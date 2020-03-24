package com.example.syafila.projectsyafila.model;

import com.google.gson.annotations.SerializedName;

public class MovieData {
    @SerializedName("poster_path")
    public  String posterPath;
    @SerializedName("adult")
    public  String adult;
    @SerializedName("overview")
    public  String overview;
    @SerializedName("release_date")
    public  String releaseDate;
    @SerializedName("genre_ids")
    public  String genreIds;
    @SerializedName("id")
    public  String id;
    @SerializedName("original_title")
    public  String originalTitle;
    @SerializedName("original_language")
    public  String originalLanguage;
    @SerializedName("title")
    public  String title;

    public MovieData() {
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(String genreIds) {
        this.genreIds = genreIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    @SerializedName("backdrop_path")
    public  String backdropPath;
    @SerializedName("popularity")
    public  String popularity;
    @SerializedName("vote_count")
    public  String voteCount;
    @SerializedName("video")
    public  String video;
    @SerializedName("vote_average")
    public  String voteAverage;
}
