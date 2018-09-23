package com.slf4j;

import org.slf4j.*;

public class App {

    static Logger logger = LoggerFactory.getLogger(App.class);
    Integer oldT;
    Integer t;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                logger.info("Hello {}", i);
            } else {
                logger.debug("I'm on index {}", i);
            }
        }

        App temp = new App();
        temp.setTemperature(10);
    }

    public void setTemperature(Integer temperature) {
        oldT = t;
        t = temperature;

        logger.info("Temperature is set to {}, old temperature was {}", t, oldT);
    }
}
