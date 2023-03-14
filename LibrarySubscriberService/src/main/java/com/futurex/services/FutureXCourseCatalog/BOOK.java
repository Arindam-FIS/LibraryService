package com.futurex.services.FutureXCourseCatalog;

public class BOOK {

    private String bookid;
    private String bookname;
    private String author;
    private Integer availablecopies;
    private Integer totalcopies;

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAvailablecopies() {
        return availablecopies;
    }

    public void setAvailablecopies(Integer availablecopies) {
        this.availablecopies = availablecopies;
    }

    public Integer getTotalcopies() {
        return totalcopies;
    }

    public void setTotalcopies(Integer totalcopies) {
        this.totalcopies = totalcopies;
    }
}
