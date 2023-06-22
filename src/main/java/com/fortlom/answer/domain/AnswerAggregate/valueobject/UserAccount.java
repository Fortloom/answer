package com.fortlom.answer.domain.AnswerAggregate.valueobject;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAccount {

    private Long id;

    private String username;

    private String realname;

    private String lastname;

    private String email;

    private String password;
}
