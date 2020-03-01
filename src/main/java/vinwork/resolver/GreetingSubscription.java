package vinwork.resolver;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;

import graphql.schema.DataFetchingEnvironment;
import vinwork.publisher.GreetingPublisher;
import vinwork.publisher.GreetingUpdate;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

@Component
class GreetingSubscription implements GraphQLSubscriptionResolver {

    private GreetingPublisher greetingPublisher;

    public void Subscription(GreetingPublisher greetingPublisher) {
        this.greetingPublisher = greetingPublisher;
    }

    public Publisher<GreetingUpdate> greetings(DataFetchingEnvironment env) {
        return greetingPublisher.getPublisher();
    }
}