package zd.zero.waifu.motivator.plugin.statistic;

import com.intellij.util.xmlb.annotations.MapAnnotation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MotivationEventStatisticsState {

    @MapAnnotation(surroundKeyWithTag = false, surroundValueWithTag = false, surroundWithTag = false, entryTagName = "Statistic", keyAttributeName = "Action")
    private final Map<String, Integer> statistics = Collections.synchronizedMap(new HashMap<>());

    public void regiseterEvent(String event) {
        synchronized(statistics) {

        }
    }

}
