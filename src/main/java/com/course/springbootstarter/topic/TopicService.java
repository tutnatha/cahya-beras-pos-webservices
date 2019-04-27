package com.course.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//        return topicRepository.findOne(id);
        return null; //err
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    void deleteTopic(String id) {
//        topicRepository.delete(id);   //err
    }

}
