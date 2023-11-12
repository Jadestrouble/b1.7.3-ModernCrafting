package jadestrouble.moderncrafting.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.BlockBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.registry.Identifier;

public class RecipeListener {
    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        Identifier type = event.recipeId;
        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.BUTTON, 1), new ItemInstance(BlockBase.STONE));
            CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.flintAndSteel, 1), new ItemInstance(ItemBase.ironIngot), new ItemInstance(ItemBase.flint));
            CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.book, 1), new ItemInstance(ItemBase.paper), new ItemInstance(ItemBase.paper), new ItemInstance(ItemBase.paper), new ItemInstance(ItemBase.leather));
            CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.JACK_O_LANTERN, 1), new ItemInstance(BlockBase.TORCH), new ItemInstance(BlockBase.PUMPKIN));
            CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.mushroomStew, 1), new ItemInstance(ItemBase.bowl), new ItemInstance(BlockBase.RED_MUSHROOM), new ItemInstance(BlockBase.BROWN_MUSHROOM));
            CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.minecartChest, 1), new ItemInstance(ItemBase.minecart), new ItemInstance(BlockBase.CHEST));
            CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.minecartFurnace, 1), new ItemInstance(ItemBase.minecart), new ItemInstance(BlockBase.FURNACE));
        }
    }
}
