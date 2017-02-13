package tr.cd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.LogLevel;

/**
 * Created by coskun.deniz on 13.02.2017.
 */
class ExampleService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ExampleService.class);

  static void exampleFunction() {
    LOGGER.trace(getMsg(LogLevel.TRACE));
    LOGGER.debug(getMsg(LogLevel.DEBUG));
    LOGGER.info(getMsg(LogLevel.INFO));
    LOGGER.warn(getMsg(LogLevel.WARN));
    LOGGER.error(getMsg(LogLevel.ERROR));
  }

  private static String getMsg(LogLevel level) {
    return "********* I am a " + level.toString() + " message.";
  }

}
