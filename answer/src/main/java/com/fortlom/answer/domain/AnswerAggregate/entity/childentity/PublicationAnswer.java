package com.fortlom.answer.domain.AnswerAggregate.entity.childentity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "publicationanswers")
@Inheritance(strategy = InheritanceType.JOINED)
public class PublicationAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date registerdate;

    private Long userid;
}
