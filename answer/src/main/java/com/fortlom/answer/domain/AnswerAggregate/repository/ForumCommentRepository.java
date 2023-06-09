package com.fortlom.answer.domain.AnswerAggregate.repository;
import com.fortlom.answer.domain.AnswerAggregate.entity.ForumComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForumCommentRepository extends JpaRepository<ForumComment,Long>{

    List<ForumComment> findByForumid(Long forumId);
    List<ForumComment> findByUserid (Long UserId);
}
