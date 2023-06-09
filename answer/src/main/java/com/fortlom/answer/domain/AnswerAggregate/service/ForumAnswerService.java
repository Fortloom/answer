package com.fortlom.answer.domain.AnswerAggregate.service;

import com.fortlom.answer.domain.AnswerAggregate.entity.ForumComment;
import com.fortlom.answer.domain.AnswerAggregate.entity.childentity.ForumAnswer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ForumAnswerService {

    List<ForumAnswer> getAll();
    Page<ForumAnswer> getAll(Pageable pageable);
    ForumAnswer getById(Long forumanswerId);
    ForumAnswer create(Long userId, Long forumId, ForumComment forumcomment);
    List<ForumAnswer> getForumAnswerByForumCommentId(Long forumcommentId);
    ResponseEntity<?> delete(Long forumanswerId);
}
