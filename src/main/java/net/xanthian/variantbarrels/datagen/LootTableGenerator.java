package net.xanthian.variantbarrels.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;

import net.minecraft.block.Block;
import net.minecraft.loot.LootTable;

import net.xanthian.variantbarrels.block.Vanilla;
import net.xanthian.variantbarrels.block.compatability.*;

import java.util.List;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        for (Block block : Vanilla.MOD_BARRELS.values()){
            addDrop(block, this::nameableContainerDrops);
        }

        // Ad Astra
        for (Block block : AdAstra.AA_BARRELS.values()){
            addDrop(block, addConditions(nameableContainerDrops(block),List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));
        }

        // Beach Party (Lets Do)
        addDrop(BeachParty.LDBP_PALM_BARREL, addConditions(nameableContainerDrops(BeachParty.LDBP_PALM_BARREL), List.of(DefaultResourceConditions.allModsLoaded("beachparty"))));
        
        // Better Archeology
        addDrop(BetterArcheology.BA_ROTTEN_BARREL, addConditions(nameableContainerDrops(BetterArcheology.BA_ROTTEN_BARREL), List.of(DefaultResourceConditions.allModsLoaded("betterarcheology"))));
        
        // Bewitchment
        for (Block block : Bewitchment.BW_BARRELS.values()){
            addDrop(block, addConditions(nameableContainerDrops(block),List.of(DefaultResourceConditions.allModsLoaded("bewitchment"))));
        }

        // Deeper & Darker
        addDrop(DeeperAndDarker.DAD_ECHO_BARREL, addConditions(nameableContainerDrops(DeeperAndDarker.DAD_ECHO_BARREL), List.of(DefaultResourceConditions.allModsLoaded("deeperdarker"))));
        
        // MineCells
        addDrop(MineCells.MC_PUTRID_BARREL, addConditions(nameableContainerDrops(MineCells.MC_PUTRID_BARREL), List.of(DefaultResourceConditions.allModsLoaded("minecells"))));
        
        // Natures Spirit
        for (Block block : NaturesSpirit.NS_BARRELS.values()){
            addDrop(block, addConditions(nameableContainerDrops(block),List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        }

        // Promenade
        for (Block block : Promenade.PROM_BARRELS.values()){
            addDrop(block, addConditions(nameableContainerDrops(block),List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        }

        // Regions Unexplored
        addDrop(RegionsUnexplored.RU_ALPHA_OAK_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_ALPHA_OAK_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BAOBAB_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_BAOBAB_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BLACK_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_BLACK_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BLACKWOOD_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_BLACKWOOD_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BLUE_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_BLUE_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BROWN_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_BROWN_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_CYAN_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_CYAN_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_CYPRESS_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_CYPRESS_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_DEAD_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_DEAD_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_EUCALYPTUS_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_EUCALYPTUS_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_GREEN_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_GREEN_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_GRAY_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_GRAY_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_JOSHUA_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_JOSHUA_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LARCH_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_LARCH_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LIME_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_LIME_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_MAGENTA_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_MAGENTA_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_MAPLE_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_MAPLE_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_MAUVE_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_MAUVE_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_ORANGE_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_ORANGE_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PALM_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_PALM_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PINE_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_PINE_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PINK_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_PINK_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PURPLE_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_PURPLE_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_RED_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_RED_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_REDWOOD_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_REDWOOD_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));

        addDrop(RegionsUnexplored.RU_WHITE_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_WHITE_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_WILLOW_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_WILLOW_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_YELLOW_PAINTED_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_YELLOW_PAINTED_BARREL), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        //addDrop(RegionsUnexplored.RU_CHERRY_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_CHERRY_BARREL), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:cherry_planks")))))));
        //addDrop(RegionsUnexplored.RU_SCULKWOOD_BARREL, addConditions(nameableContainerDrops(RegionsUnexplored.RU_SCULKWOOD_BARREL), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:sculkwood_planks")))))));
        addDrop(RegionsUnexplored.RU_BRIMWOOD_BARREL, addConditions(drops(RegionsUnexplored.RU_BRIMWOOD_BARREL), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored")))));
        addDrop(RegionsUnexplored.RU_COBALT_BARREL, addConditions(drops(RegionsUnexplored.RU_COBALT_BARREL), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored")))));
        addDrop(RegionsUnexplored.RU_KAPOK_BARREL, addConditions(drops(RegionsUnexplored.RU_KAPOK_BARREL), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored")))));
        addDrop(RegionsUnexplored.RU_MAGNOLIA_BARREL, addConditions(drops(RegionsUnexplored.RU_MAGNOLIA_BARREL), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored")))));
        addDrop(RegionsUnexplored.RU_SOCOTRA_BARREL, addConditions(drops(RegionsUnexplored.RU_SOCOTRA_BARREL), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored")))));
        addDrop(RegionsUnexplored.RU_YELLOW_BIOSHROOM_BARREL, addConditions(drops(RegionsUnexplored.RU_YELLOW_BIOSHROOM_BARREL), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored")))));


        // SnifferPlus
        addDrop(SnifferPlus.SP_STONE_PINE_BARREL, addConditions(nameableContainerDrops(SnifferPlus.SP_STONE_PINE_BARREL), List.of(DefaultResourceConditions.allModsLoaded("snifferplus"))));

        // Tech reborn
        addDrop(TechReborn.TR_RUBBER_BARREL, addConditions(nameableContainerDrops(TechReborn.TR_RUBBER_BARREL), List.of(DefaultResourceConditions.allModsLoaded("techreborn"))));

        // Vinery (Lets Do)
        addDrop(Vinery.LDV_CHERRY_BARREL, addConditions(nameableContainerDrops(Vinery.LDV_CHERRY_BARREL), List.of(DefaultResourceConditions.allModsLoaded("vinery"))));
    }

    private LootTable.Builder addConditions(LootTable.Builder builder, List<ConditionJsonProvider> conditions) {
        if (!conditions.isEmpty())
            FabricDataGenHelper.addConditions(builder, conditions.toArray(ConditionJsonProvider[]::new));
        return builder;
    }
}