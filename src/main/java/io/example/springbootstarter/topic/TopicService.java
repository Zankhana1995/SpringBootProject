package io.example.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(new Topic("1", "java", "Description of java"),
			new Topic("2", "Spring", "Description of Spring"),
			new Topic("3", "Algorithms", "Description of algorithm"));

	public List<Topic> getAllTopics() {
		return topics;
	}
}
