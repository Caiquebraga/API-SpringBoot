package com.seoai.company.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.time.Instant;

@Entity @Table(name = "companies")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank @Column(nullable = false)
    private String name;

    private String website;

    @Column(nullable = false, updatable = false)
    @Builder.Default
    private Instant createAt = Instant.now();

}
