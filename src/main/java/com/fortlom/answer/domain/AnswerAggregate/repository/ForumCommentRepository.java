package com.fortlom.answer.domain.AnswerAggregate.repository;
import com.fortlom.answer.domain.AnswerAggregate.entity.ForumComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForumCommentRepository extends JpaRepository<ForumComment,Long>{
    @Query("select x from ForumComment x where x.forumCommentid = ?1")
    List<ForumComment> findByForumid(Long forumId);
    @Query("select x from ForumComment x where x.userId = ?1")
    List<ForumComment> findByUserid (Long UserId);
}
