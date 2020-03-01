package vinwork.resolver;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import vinwork.model.Greeting;
import vinwork.repository.GreetingRepository;

@Component
public class GreetingQuery implements GraphQLQueryResolver {

  @Autowired
  private GreetingRepository greetingRepository;

  public Greeting getGreeting(String id) {
    return greetingRepository.find(id);
  }
  
  public List<Greeting> getAllGreetings() {
	  return greetingRepository.getAllGreetings();
  }
}