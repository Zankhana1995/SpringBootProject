package io.example.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1", "java", "Description of java"),
			new Topic("2", "Spring", "Description of Spring"),
			new Topic("3", "Algorithms", "Description of algorithm")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {

		topics.add(topic);
		System.out.println(topics);
	}
}
