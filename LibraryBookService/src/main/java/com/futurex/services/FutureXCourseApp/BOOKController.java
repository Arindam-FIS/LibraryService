package com.futurex.services.FutureXCourseApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
public class BOOKController {

    @Autowired
    private BOOKRepository BOOKRepo;
    @RequestMapping("/")
    public String getLibraryAppHome() {

        return ("Library App Home");
    }

    @RequestMapping("/books")
    public List<BOOK> getBooks() {

        return BOOKRepo.findAll();
    }

    @RequestMapping("/{id}")
    public BOOK getSpecificCourse(@PathVariable("id") String id ) {
        return BOOKRepo.getOne(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/books")
    public void saveBook(@RequestBody BOOK book) {
        BOOKRepo.save(book);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{id}")
    public void deleteBook(@PathVariable String id) {
        BOOKRepo.deleteById(id);
    }



    @Autowired
    private SUBSCRIPTIONSRepository SUBSRepo;

    @RequestMapping("/subscriptions")
    public List<SUBSCRIPTION> getsubscriptions() {

        return SUBSRepo.findAll();
    }
}

