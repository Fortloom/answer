package com.fortlom.answer.interfaces.dto.PublicationComment;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class CreatePublicationCommentResource {
    private Date registerdate;
    private String commentdescription;
}
