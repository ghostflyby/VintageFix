package org.embeddedt.vintagefix.mixin.dynamic_resources;

import net.minecraft.block.state.BlockStateBase;
import net.minecraft.client.renderer.block.model.IBakedModel;
import org.embeddedt.vintagefix.annotation.ClientOnlyMixin;
import org.embeddedt.vintagefix.dynamicresources.IModelHoldingBlockState;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BlockStateBase.class)
@ClientOnlyMixin
public class MixinBlockStateBase implements IModelHoldingBlockState {
    private volatile IBakedModel vfix$model;

    @Override
    public IBakedModel vfix$getModel() {
        return vfix$model;
    }

    @Override
    public void vfix$setModel(IBakedModel model) {
        vfix$model = model;
    }
}
