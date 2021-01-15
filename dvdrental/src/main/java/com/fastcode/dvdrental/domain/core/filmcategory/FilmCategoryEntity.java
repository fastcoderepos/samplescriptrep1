package com.fastcode.dvdrental.domain.core.filmcategory;

import javax.persistence.*;
import java.time.*;
import com.fastcode.dvdrental.domain.core.category.CategoryEntity;
import com.fastcode.dvdrental.domain.core.film.FilmEntity;
import com.fastcode.dvdrental.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FILM_CATEGORY")
@IdClass(FilmCategoryId.class)
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class FilmCategoryEntity extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "CATEGORY_ID", nullable = false)
    private Integer categoryId;
    
    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "FILM_ID", nullable = false)
    private Integer filmId;
    
    @Basic
    @Column(name = "LAST_UPDATE", nullable = true)
    private LocalDate lastUpdate;

    @ManyToOne
    @JoinColumn(name = "FILM_ID", insertable=false, updatable=false)
    private FilmEntity film;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", insertable=false, updatable=false)
    private CategoryEntity category;


}



