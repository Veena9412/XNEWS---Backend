package com.crio.xnews;

import java.util.ArrayList;
import java.util.List;

public class NewsApiResponse {
    private String status;
    private int totalResults;
    private List<NewsArticle> articles = new ArrayList<>();

    public NewsApiResponse(){

    }
    public NewsApiResponse(String status, int totalResults, List<NewsArticle> articles){
        this.status=status;
        this.totalResults=totalResults;
        this.articles=articles;

    }

// TODO: CRIO_TASK_MODULE_PROJECT
// Use your IDE to generate getters and setters for the variables declared above.
// Use your IDE to generate the toString method to provide a string representation of the variables.
    public void setStatus(String status){
        this.status=status;
    }
    public void setTotalResults(int totalResults){
        this.totalResults=totalResults;
    }
    public void setArticles(List<NewsArticle> articles){
        this.articles=articles;
    }
    public List<NewsArticle> getArticles(){
        return articles;
    }
    public String getStatus(){
        return status;
    }
    public int getTotalResults(){
        return totalResults;
    }
    
    @Override
    public String toString() {
        
        return "NewsApiResponse [Status " +status+", totalResults="+totalResults+", <NewsArticle>="+articles+"]";
    }
   
}
