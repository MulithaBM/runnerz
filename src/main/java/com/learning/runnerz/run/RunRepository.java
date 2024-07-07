package com.learning.runnerz.run;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface RunRepository /*extends ListCrudRepository<Run, Integer>*/ {
    List<Run> findAll();

    Optional<Run> findById(Integer id);

    void create(Run run);

    void update(Integer id, Run run);

    void delete(Integer id);

    int count();

    void saveAll(List<Run> runs);

    List<Run> findByLocation(String location);
}
