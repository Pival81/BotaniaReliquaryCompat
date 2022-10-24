package org.pival81.botaniareliquarycompat;

import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.Arrays;
import java.util.List;

public class ModLateMixinLoader implements ILateMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        return Arrays.asList("botaniareliquarycompat.mixins.json");
    }

    @Override
    public boolean shouldMixinConfigQueue(String mixinConfig) {
        return true;
    }

    @Override
    public void onMixinConfigQueued(String mixinConfig) {
    }
}
