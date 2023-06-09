package com.fortlom.answer.domain.AnswerAggregate.repository;
import com.fortlom.answer.domain.AnswerAggregate.entity.ForumComment;
import com.fortlom.answer.domain.AnswerAggregate.entity.childentity.ForumAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForumAnswerRepository extends JpaRepository<ForumAnswer,Long>{

    List<ForumAnswer> findByForumCommentId(Long forumCommentId);
    List<ForumAnswer> findByUserid (Long UserId);
}
