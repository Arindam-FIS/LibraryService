package com.futurex.services.FutureXCourseApp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@JsonIgnoreProperties
public class SUBSCRIPTION {
    @Id
    private String subscribername;
    private String dos;
    private String dor;
    private String bookid;

    public String getSubscribername() {
        return subscribername;
    }

    public void setSubscribername(String subscribername) {
        this.subscribername = subscribername;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }

    public String getDor() {
        return dor;
    }

    public void setDor(String dor) {
        this.dor = dor;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }
}
