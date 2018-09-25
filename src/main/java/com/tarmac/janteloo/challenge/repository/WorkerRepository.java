package com.tarmac.janteloo.challenge.repository;

import com.tarmac.janteloo.challenge.model.Worker;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "workers", collectionResourceRel = "workers")
public interface WorkerRepository extends PagingAndSortingRepository<Worker, Long> {

    @RestResource(path = "byName", rel = "byName")
    public Page<Worker> findByNameContainingIgnoreCase(@Param("name") String name, Pageable pageable);

    @RestResource(path = "byRole", rel = "byRole")
    public Page<Worker> findByRoleContainingIgnoreCase(@Param("role") String role, Pageable pageable);

}
