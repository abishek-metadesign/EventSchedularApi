package uk.co.metadesignsolutions.javachallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.metadesignsolutions.javachallenge.models.Event;

public interface EventRepository extends JpaRepository<Event,Long> {

}
