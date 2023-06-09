package com.fortlom.answer.application.service;
import com.fortlom.answer.application.exception.ResourceNotFoundException;
import com.fortlom.answer.application.exception.ResourcePerzonalized;
import com.fortlom.answer.domain.AnswerAggregate.entity.ForumComment;
import com.fortlom.answer.domain.AnswerAggregate.repository.ForumCommentRepository;
import com.fortlom.answer.domain.AnswerAggregate.service.ForumCommentService;
import com.fortlom.answer.domain.AnswerAggregate.valueobject.Forum;
import com.fortlom.answer.domain.AnswerAggregate.valueobject.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ForumCommentServiceImpl implements ForumCommentService {

    private static final String ENTITY = "ForumComment";

    @Autowired
    private ForumCommentRepository forumcommentRepository;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public List<ForumComment> getAll() {
        List<ForumComment>forumComments=forumcommentRepository.findAll();
        for(ForumComment forumComment:forumComments){
            //Forum forum=restTemplate.getForObject("https://fortlom-interaction.herokuapp.com/api/v1/forumservice/forums/"+forumComment.getForumid(),Forum.class);
            Forum forum = new Forum();
            forum.setId(Long.valueOf(1));
            forum.setForumdescription("Description forum n° " + 0);
            forum.setForumrules("Regla 1: awdawd\n Regla 2: awdasad\nRegla 3: awdasda2\n");
            forum.setForumname("Foro de prueba");
            forumComment.setForum(forum);


        }
        return forumComments;
    }

    @Override
    public Page<ForumComment> getAll(Pageable pageable) {
        Page<ForumComment>forumComments=forumcommentRepository.findAll(pageable);
        for(ForumComment forumComment:forumComments){
            //Forum forum=restTemplate.getForObject("https://fortlom-interaction.herokuapp.com/api/v1/forumservice/forums/"+forumComment.getForumid(),Forum.class);
            Forum forum = new Forum();
            forum.setId(Long.valueOf(1));
            forum.setForumdescription("Description forum n° " + 0);
            forum.setForumrules("Regla 1: awdawd\n Regla 2: awdasad\nRegla 3: awdasda2\n");
            forum.setForumname("Foro de prueba");
            forumComment.setForum(forum);


        }
        return forumComments;
    }

    @Override
    public ForumComment getById(Long forumcommentId) {
        ForumComment forumComment= forumcommentRepository.findById(forumcommentId).orElseThrow(() -> new ResourceNotFoundException(ENTITY, forumcommentId));
        //Forum forum=restTemplate.getForObject("https://fortlom-interaction.herokuapp.com/api/v1/forumservice/forums/"+forumComment.getForumid(),Forum.class);
        Forum forum = new Forum();
        forum.setId(Long.valueOf(1));
        forum.setForumdescription("Description forum n° " + 0);
        forum.setForumrules("Regla 1: awdawd\n Regla 2: awdasad\nRegla 3: awdasda2\n");
        forum.setForumname("Foro de prueba");
        forumComment.setForum(forum);
        return forumComment;
    }

    @Override
    public ForumComment create(Long userId, Long forumId, ForumComment request) {
//        boolean check1 = restTemplate.getForObject("https://fortlom-account.herokuapp.com/api/v1/userservice/artists/check/" + userId,boolean.class);
//        boolean check2 = restTemplate.getForObject("https://fortlom-account.herokuapp.com/api/v1/userservice/fanatics/check/" + userId,boolean.class);
//        boolean check3 = restTemplate.getForObject("https://fortlom-interaction.herokuapp.com/api/v1/forumservice/check/" + forumId,boolean.class);
        boolean check1 = true;
        boolean check2 = true;
        boolean check3 = true;
        if((check1 || check2) && check3) {
            request.setUserId(userId);
            request.setForumid(forumId);
            return forumcommentRepository.save(request);
        }else {
            throw  new ResourcePerzonalized("id inexistente");

        }

    }

    @Override
    public List<ForumComment> getForumCommentByForumId(Long forumId) {
        //boolean check = restTemplate.getForObject("https://fortlom-interaction.herokuapp.com/api/v1/forumservice/check/" + forumId,boolean.class);
        boolean check = true;
        if(check){
            List<ForumComment>forumComments=forumcommentRepository.findByForumid(forumId);
            for(ForumComment forumComment:forumComments){
                Forum forum = new Forum();
                forum.setId(Long.valueOf(1));
                forum.setForumdescription("Description forum n° " + 0);
                forum.setForumrules("Regla 1: awdawd\n Regla 2: awdasad\nRegla 3: awdasda2\n");
                forum.setForumname("Foro de prueba");

                //UserAccount userAccount=restTemplate.getForObject("https://fortlom-account.herokuapp.com/api/v1/userservice/users/"+forumComment.getUserid(),UserAccount.class);
                forumComment.setUserId(Long.valueOf(1));
                forumComment.setForum(forum);


            }
            return forumComments;
        }else {
            throw  new ResourcePerzonalized("id inexistente");

        }

    }

    @Override
    public ResponseEntity<?> delete(Long forumcommentId) {
        return forumcommentRepository.findById(forumcommentId).map(Forum -> {
            forumcommentRepository.delete(Forum);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException(ENTITY, forumcommentId));
    }
}
