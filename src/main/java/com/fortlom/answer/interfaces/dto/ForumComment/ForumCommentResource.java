package com.fortlom.answer.interfaces.dto.ForumComment;


import com.fortlom.answer.domain.AnswerAggregate.valueobject.Forum;
import com.fortlom.answer.domain.AnswerAggregate.valueobject.UserAccount;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import java.util.Date;

@Setter
@Getter
public class ForumCommentResource {

    private Long id;

    private Date registerdate;
    private String commentdescription;
    private Long userid;
    private UserAccount userAccount;
    private Long forumid;

    private Forum forum;
}
