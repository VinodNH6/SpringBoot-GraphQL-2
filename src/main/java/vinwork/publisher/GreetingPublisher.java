package vinwork.publisher;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.observables.ConnectableObservable;
import vinwork.model.Greeting;

import org.springframework.stereotype.Component;

@Component
public class GreetingPublisher {

    private final Flowable<GreetingUpdate> publisher;

    private ObservableEmitter<GreetingUpdate> emitter;

    public GreetingPublisher() {
        Observable<GreetingUpdate> commentUpdateObservable = Observable.create(emitter -> {
            this.emitter = emitter;
        });

        ConnectableObservable<GreetingUpdate> connectableObservable = commentUpdateObservable.share().publish();
        connectableObservable.connect();

        publisher = connectableObservable.toFlowable(BackpressureStrategy.BUFFER);
    }

    public void publish(final Greeting greeting) {
        emitter.onNext(new GreetingUpdate(greeting.getMessage(), "vinod", "today"));
    }


    public Flowable<GreetingUpdate> getPublisher() {
        return publisher;
    }

}