package br.ceproirr.guidecity.repository;

import br.ceproirr.guidecity.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
