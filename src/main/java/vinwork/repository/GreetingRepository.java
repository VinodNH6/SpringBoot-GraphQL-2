package vinwork.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vinwork.model.Greeting;
import vinwork.publisher.GreetingPublisher;


@Component
public class GreetingRepository {

//	@Autowired
//	private GreetingPublisher greetingPublisher;

	private Map<String, Greeting> greetings;

	public GreetingRepository() {
		greetings = new HashMap<>();
	}

	public Greeting save(Greeting greeting) {
		String id = UUID.randomUUID().toString();

		greetings.put(id, greeting);
		greeting.setId(id);
		
		//**greetingPublisher.publish(greeting);  //publish events.

		return greeting;
	}

	public Greeting find(String id) {
		return greetings.get(id);
	}

	public List<Greeting> getAllGreetings() {
		return  greetings.values().stream().collect(Collectors.toList());
	}
}