package com.fortlom.answer.domain.AnswerAggregate.repository;
import com.fortlom.answer.domain.AnswerAggregate.entity.ForumComment;
import com.fortlom.answer.domain.AnswerAggregate.entity.childentity.ForumAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForumAnswerRepository extends JpaRepository<ForumAnswer,Long>{

    @Query("select x from ForumAnswer x where x.forumCommentId = ?1")
    List<ForumAnswer> findByForumCommentId(Long forumCommentId);
    @Query("select x from ForumAnswer x where x.userid = ?1")
    List<ForumAnswer> findByUserid (Long UserId);
}
