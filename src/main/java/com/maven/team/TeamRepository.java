package com.maven.team;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TeamRepository extends CrudRepository<Team, Long>{
}
