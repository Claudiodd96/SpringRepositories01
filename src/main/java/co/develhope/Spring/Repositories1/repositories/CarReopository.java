package co.develhope.Spring.Repositories1.repositories;

import co.develhope.Spring.Repositories1.entities.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CarReopository extends JpaRepository<Car, Long> {}
