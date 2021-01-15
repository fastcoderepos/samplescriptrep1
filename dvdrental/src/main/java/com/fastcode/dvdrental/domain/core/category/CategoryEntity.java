package com.fastcode.dvdrental.domain.core.category;

import javax.persistence.*;
import java.time.*;
import com.fastcode.dvdrental.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CATEGORY")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class CategoryEntity extends AbstractEntity {

    @Basic
    @Column(name = "name", nullable = false,length =25)
    private String name;

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "CATEGORY_ID", nullable = false)
    private Integer categoryId;
    
    @Basic
    @Column(name = "LAST_UPDATE", nullable = true)
    private LocalDate lastUpdate;


}



