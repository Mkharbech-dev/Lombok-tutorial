package org.gs;

import lombok.*;

import java.net.URL;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Movie {
    private Long id;
    private String title;
    private String description;
    private String country;
    private int rating;
    private URL officialSite;
    private String language;
    // ajouter une annotaion pour le niveau d'acces à l'attribut
    @Getter(AccessLevel.PRIVATE)
    private final int minutes = 120;
}
