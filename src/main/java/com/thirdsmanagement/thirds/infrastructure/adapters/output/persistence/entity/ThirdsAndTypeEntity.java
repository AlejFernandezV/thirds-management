package com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity;

import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.identifiers.ThirdsAndTypeId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "THIRDS_AND_TYPE")
@IdClass(ThirdsAndTypeId.class)
public class ThirdsAndTypeEntity {

    @Id
    @Column(name = "th_id")
    private Long thId;

    @Id
    @Column(name = "ent_id")
    private Long entId;

    @Id
    @Column(name = "tt_id")
    private Long ttId;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "th_id", referencedColumnName = "th_id", insertable = false, updatable = false),
        @JoinColumn(name = "ent_id", referencedColumnName = "ent_id", insertable = false, updatable = false)
    })
    private ThirdEntity third;

    @ManyToOne
    @JoinColumn(name = "tt_id", referencedColumnName = "tt_id", insertable = false, updatable = false)
    private ThirdTypeEntity thirdType;
}
