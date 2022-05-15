package com.spring.springcomputers.controllers;

import com.spring.springcomputers.models.artefact.Artefact;
import com.spring.springcomputers.models.artefact.IArtefactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class ArtefactController {

    @Autowired
    private IArtefactService artefactService;

    @GetMapping("/showArtefacts")
    public String findArtefacts(Model model) {

        List<Artefact> artefacts = (List<Artefact>) artefactService.findAll();

        model.addAttribute("artefacts", artefacts);

        return "showArtefacts";
    }

    @GetMapping("artefacts")
    public List <Artefact> getArtefacts() {
        return this.artefactService.findAll();
    }
}
