package com.fortlom.answer.interfaces.mapping.configuration;

import com.fortlom.answer.interfaces.mapping.entity.ForumCommentMapper;
import com.fortlom.answer.interfaces.mapping.entity.PublicationCommentMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("enhancedModelMapperConfiguration")
public class MappingConfiguration {
    @Bean
    public EnhancedModelMapper modelMapper() {
        return new EnhancedModelMapper();
    }
    @Bean
    public PublicationCommentMapper PublicationCommentMapper() {
        return new PublicationCommentMapper();
    }
    @Bean
    public ForumCommentMapper ForumCommentMapper() {
        return new ForumCommentMapper();
    }
}
