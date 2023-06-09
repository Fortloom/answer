package com.fortlom.answer.domain.AnswerAggregate.entity;
import com.fortlom.answer.domain.AnswerAggregate.valueobject.Publication;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@With
@AllArgsConstructor
@Table(name="publicationcomments")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class PublicationComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long publicationid;

    @Transient
    private Publication publication;
    private Long userId;
}
