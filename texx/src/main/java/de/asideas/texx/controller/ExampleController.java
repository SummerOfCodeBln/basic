package de.asideas.texx.controller;

import de.asideas.texx.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExampleController {

    @Autowired
    private RepositoryService repositoryService;

    @RequestMapping("/")
    public List<String> getLabels() {
        return repositoryService.getAllLabelNames();
    }

}

