package com.spring.springcomputers.models.artefact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtefactService implements IArtefactService {

    @Autowired
    private ArtefactRepository repository;

    @Override
    public List<Artefact> findAll() {

        List<Artefact> artefactList = (List<Artefact>) repository.findAll();

        return artefactList;
    }
}
