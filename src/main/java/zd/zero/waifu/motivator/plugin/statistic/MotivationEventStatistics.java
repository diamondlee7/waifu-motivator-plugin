package zd.zero.waifu.motivator.plugin.statistic;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.RoamingType;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(
    name = "WaifuMotivatorPluginSettings",
    storages = @Storage(
        value = "waifu-motivator-plugin-statistics.xml",
        roamingType = RoamingType.DISABLED
    )
)
public class MotivationEventStatistics implements PersistentStateComponent<MotivationEventStatisticsState> {

    private final MotivationEventStatisticsState state = new MotivationEventStatisticsState();

    @Nullable
    @Override
    public MotivationEventStatisticsState getState() {
        return state;
    }

    @Override
    public void loadState( @NotNull MotivationEventStatisticsState state ) {
        XmlSerializerUtil.copyBean( state, this.state );
    }

}
