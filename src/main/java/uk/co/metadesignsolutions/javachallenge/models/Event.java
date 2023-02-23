package uk.co.metadesignsolutions.javachallenge.models;

import lombok.Getter;
import lombok.Setter;
import uk.co.metadesignsolutions.javachallenge.enums.TimePeriod;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Double priority;

    private LocalDate startDate;

    private LocalDate endDate;

    private TimePeriod timePeriod;

    private LocalDate scheduledDate;

    private String startTime;

    private String endTime;


}
