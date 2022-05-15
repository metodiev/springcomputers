package com.spring.springcomputers.models.artefact;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtefactRepository extends CrudRepository<Artefact, Long> {
}
