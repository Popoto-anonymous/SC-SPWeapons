package SPWeapons;

import legend.game.inventory.Equipment;
import legend.game.inventory.EquipmentRegistryEvent;
import legend.game.inventory.ItemRegistryEvent;
import legend.game.inventory.screens.ShopScreen;
import legend.game.modding.events.inventory.ShopContentsEvent;
import legend.lodmod.LodShops;
import org.legendofdragoon.modloader.Mod;
import org.legendofdragoon.modloader.events.EventListener;
import org.legendofdragoon.modloader.registries.RegistryId;

import static legend.core.GameEngine.EVENTS;

@Mod(id = SPWeapons.MOD_ID, version = "^3.0.0")
public class SPWeapons {
  public static final String MOD_ID = "spweapons";

  public SPWeapons() {
    EVENTS.register(this);
  }

  public static RegistryId id(final String entryId) {
    return new RegistryId(MOD_ID, entryId);
  }

  @EventListener
  public void registerEquipments(final EquipmentRegistryEvent event) {
    Weapons.register(event);
  }
  @EventListener
  public void shopEquipmentEvent(final ShopContentsEvent event) {
    if(event.shop == LodShops.BALE_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.SPIRIT_BLADE.get(), 50));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.SPIRIT_BOW.get(), 50));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.SPIRIT_PIKE.get(), 50));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.SPIRIT_ESTOC.get(), 50));
    }
    if(event.shop == LodShops.KAZAS_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.SPIRIT_CAESTUS.get(), 100));
    }
    if(event.shop == LodShops.FLETZ_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.SPIRIT_AXE.get(), 150));
    }
    if(event.shop == LodShops.FUENO_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.SPIRIT_MACE.get(), 150));
    }
    if(event.shop == LodShops.MOON_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.BLAZING_SOUL.get(), 10000));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.TORNADIC_SOUL.get(), 10000));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.VIRTUOUS_SOUL.get(), 10000));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.BLACKENED_SOUL.get(), 10000));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.MARTIAL_SOUL.get(), 10000));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.DANCERS_SOUL.get(), 10000));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.EARTHEN_SOUL.get(), 10000));
    }
   }
}
