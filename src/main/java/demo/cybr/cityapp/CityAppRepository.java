package demo.cybr.cityapp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityAppRepository extends JpaRepository<City, Integer>
{
    @Query(value="SELECT city.name as city, country.name as country, city.district as district, city.population as population FROM city,country WHERE city.CountryCode = country.Code ORDER BY RAND() LIMIT 0,1", nativeQuery = true)
    List <City> getRandomCity();
}