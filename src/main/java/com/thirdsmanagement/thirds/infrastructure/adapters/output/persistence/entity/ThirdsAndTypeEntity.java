package com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity;

import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.identifiers.ThirdsAndTypeId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "THIRDS_AND_TYPE")
@IdClass(ThirdsAndTypeId.class)
public class ThirdsAndTypeEntity {

    @Id
    @Column(name = "th_id")
    private Long thId;

    @Id
    @Column(name = "tt_id")
    private Long ttId;

    @ManyToOne
    @JoinColumn(name = "th_id", referencedColumnName = "th_id", insertable = false, updatable = false)
    private ThirdEntity third;

    @ManyToOne
    @JoinColumn(name = "tt_id", referencedColumnName = "tt_id", insertable = false, updatable = false)
    private ThirdTypeEntity thirdType;
}
