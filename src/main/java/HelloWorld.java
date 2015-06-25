import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.state.ServerStartedEvent;
import org.spongepowered.api.plugin.Plugin;

/**
 * Created by Rauca on 24.06.2015.
 */

@Plugin(id = "example", name = "Example Project", version = "1.0")
public class HelloWorld {
    @Inject
    Game game;
    @Inject
    Logger logger;

    @Subscribe
    public void onServerStart(ServerStartedEvent event) {
        // Hey! The server has started!
        // Try instantiating your logger in here.
        // (There's a guide for that)
        logger.info("Hello World!");
        logger.info("Ich bin deine APP");
    }

}
