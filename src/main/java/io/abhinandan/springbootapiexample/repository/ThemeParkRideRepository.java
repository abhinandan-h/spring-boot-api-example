package io.abhinandan.springbootapiexample.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import io.abhinandan.springbootapiexample.enitity.ThemeParkRide;

@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long>
{
    List<ThemeParkRide> findByName (String name); 
}
