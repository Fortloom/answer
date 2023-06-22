package com.fortlom.answer.interfaces.dto.PublicationComment;


import com.fortlom.answer.domain.AnswerAggregate.valueobject.Publication;
import com.fortlom.answer.domain.AnswerAggregate.valueobject.UserAccount;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Transient;
import java.util.Date;

@Getter
@Setter
public class PublicationCommentResource {
    private Long id;

    private Date registerdate;

    private Long userid;
    private UserAccount userAccount;
    private String commentdescription;
    private Long publicationid;

    private Publication publication;
}
