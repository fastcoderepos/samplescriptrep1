package com.fastcode.dvdrental.domain.core.filmactor;

import javax.persistence.*;
import java.time.*;
import com.fastcode.dvdrental.domain.core.film.FilmEntity;
import com.fastcode.dvdrental.domain.core.actor.ActorEntity;
import com.fastcode.dvdrental.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FILM_ACTOR")
@IdClass(FilmActorId.class)
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class FilmActorEntity extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "ACTOR_ID", nullable = false)
    private Integer actorId;
    
    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "FILM_ID", nullable = false)
    private Integer filmId;
    
    @Basic
    @Column(name = "LAST_UPDATE", nullable = true)
    private LocalDate lastUpdate;

    @ManyToOne
    @JoinColumn(name = "ACTOR_ID", insertable=false, updatable=false)
    private ActorEntity actor;

    @ManyToOne
    @JoinColumn(name = "FILM_ID", insertable=false, updatable=false)
    private FilmEntity film;


}



