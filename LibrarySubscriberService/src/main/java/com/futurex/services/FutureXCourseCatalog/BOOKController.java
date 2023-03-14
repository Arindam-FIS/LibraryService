package com.futurex.services.FutureXCourseCatalog;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BOOKController {

    @Autowired
    private EurekaClient client;

    @RequestMapping("/")
    public String getBookHome() {
        String bookAppMessage = "";
        //String courseAppURL = "http://localhost:8081/";
        RestTemplate restTemplate = new RestTemplate();
        InstanceInfo instanceInfo = client.getNextServerFromEureka("lib-book-service",false);
        String bookAppURL = instanceInfo.getHomePageUrl();
        bookAppMessage = restTemplate.getForObject(bookAppURL,String.class);

        return("Welcome to Book Catalog "+bookAppMessage);
    }

    @RequestMapping("/books")
    public String getBooks() {
        String books = "";
        //String bookAppURL = "http://localhost:8081/books";
        InstanceInfo instanceInfo = client.getNextServerFromEureka("lib-book-service",false);
        String bookAppURL = instanceInfo.getHomePageUrl();
        bookAppURL = bookAppURL+"/books";
        RestTemplate restTemplate = new RestTemplate();
        books = restTemplate.getForObject(bookAppURL,String.class);

        return("Available books are "+books);
    }

    @RequestMapping("/{id}")
    public String getSpecificBook(@PathVariable("id") String id ) {
        BOOK book = new BOOK();
        //String bookAppURL = "http://localhost:8081/'B1212'";
        InstanceInfo instanceInfo = client.getNextServerFromEureka("lib-book-service",false);
        String bookAppURL = instanceInfo.getHomePageUrl();
        bookAppURL = bookAppURL+"/"+id;
        RestTemplate restTemplate = new RestTemplate();

        book = restTemplate.getForObject(bookAppURL,BOOK.class);

        return("Respective Book name is "+book.getBookname());
    }
}
