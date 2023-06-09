package com.fortlom.answer.domain.AnswerAggregate.entity;
import com.fortlom.answer.domain.AnswerAggregate.valueobject.Forum;
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
@Table(name="forumcomments")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class ForumComment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long forumid;
    @Transient
    private Forum forum;
    private Long userId;

}
