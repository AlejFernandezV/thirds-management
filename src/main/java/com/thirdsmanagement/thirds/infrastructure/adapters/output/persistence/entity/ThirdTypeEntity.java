package com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "THIRD_TYPE")
public class ThirdTypeEntity {
    @Id
    @Column(name = "tt_id")
    private Long ttId;

    @Column(name = "tt_name")
    private String ttName;
}
