package SPWeapons;

import legend.core.GameEngine;
import legend.game.characters.ElementSet;
import legend.game.inventory.Equipment;
import legend.game.inventory.EquipmentRegistryEvent;
import legend.game.inventory.ItemIcon;
import legend.game.types.EquipmentSlot;
import legend.lodmod.LodMod;
import org.legendofdragoon.modloader.registries.Registrar;
import org.legendofdragoon.modloader.registries.RegistryDelegate;

public class Weapons {
  private Weapons() { }

  private static final Registrar<Equipment, EquipmentRegistryEvent> EQUIPMENT_REGISTRAR = new Registrar<>(GameEngine.REGISTRIES.equipment, SPWeapons.MOD_ID);

  // DART
  public static final RegistryDelegate<Equipment> SPIRIT_BLADE = EQUIPMENT_REGISTRAR.register("spirit_blade", () -> new Equipment(25, 0x0, EquipmentSlot.WEAPON, 0x80, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 5, 0,0, 0, 0, 0, 0, 200, false, false, false, false, 0, 0, 0,0, 0, ItemIcon.SWORD, 0, 0, 0, 0, 0, 20, 20, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> BLAZING_SOUL = EQUIPMENT_REGISTRAR.register("blazing_soul", () -> new Equipment(5000, 0x0, EquipmentSlot.WEAPON, 0x80, LodMod.DIVINE_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 100, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 50, 10, 100, 500, 0, ItemIcon.SWORD, 20, 0, 100, 50, 50, 50, 50, 20, 20, 0, 0x0));
  // LAVITZ-ALBERT
  public static final RegistryDelegate<Equipment> SPIRIT_PIKE = EQUIPMENT_REGISTRAR.register("spirit_pike", () -> new Equipment(25, 0x0, EquipmentSlot.WEAPON, 0x40, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 5, 0, 0, 0, 0, 0, 0, 300, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.SPEAR, 0, 0, 0, 0, 0, 20, 20, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> TORNADIC_SOUL = EQUIPMENT_REGISTRAR.register("tornadic_soul", () -> new Equipment(5000, 0x0, EquipmentSlot.WEAPON, 0x40, LodMod.WIND_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 120, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 50, 10, 100, 500, 0, ItemIcon.SPEAR, 20, 0,80, 50, 50, 50, 50, 20, 20, 0, 0x0));
  // SHANA-MIRANDA
  public static final RegistryDelegate<Equipment> SPIRIT_BOW = EQUIPMENT_REGISTRAR.register("spirit_bow", () -> new Equipment(25,0x0, EquipmentSlot.WEAPON, 0x2, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 5, 0, 0, 0, 0, 0, 0, 200, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.BOW, 0, 0, 0, 0, 0, 20, 20, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> VIRTUOUS_SOUL = EQUIPMENT_REGISTRAR.register("virtuous_soul", () -> new Equipment(5000, 0x0, EquipmentSlot.WEAPON, 0x2, LodMod.LIGHT_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 75, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 50, 10, 100, 500, 0, ItemIcon.BOW, 15, 0, 125, 50, 50, 50, 50, 20, 20, 0,0x0));
  // ROSE
  public static final RegistryDelegate<Equipment> SPIRIT_ESTOC = EQUIPMENT_REGISTRAR.register("spirit_estoc", () -> new Equipment(25, 0x0, EquipmentSlot.WEAPON, 0x4, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 5, 0, 0, 0, 0, 0, 0, 300, false, false,false, false, 0, 0, 0, 0, 0, ItemIcon.SWORD, 0, 0, 0, 0, 0, 20, 20, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> BLACKENED_SOUL = EQUIPMENT_REGISTRAR.register("blackened_soul", ()-> new Equipment(5000, 0x0, EquipmentSlot.WEAPON, 0x4, LodMod.DARK_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 120, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 50, 10, 100, 500, 0, ItemIcon.SWORD, 25, 0, 200, 50, 50, 50, 50, 20, 20, 0, 0x0));
  // HASCHEL
  public static final RegistryDelegate<Equipment> SPIRIT_CAESTUS = EQUIPMENT_REGISTRAR.register("spirit_caestus", () -> new Equipment(50, 0x0, EquipmentSlot.WEAPON, 0x10, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 5, 0, 0, 0, 0, 0, 0, 300, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.KNUCKLE, 0, 0, 0, 0, 0, 20, 20, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> MARTIAL_SOUL = EQUIPMENT_REGISTRAR.register("martial_soul", () -> new Equipment(5000, 0x0, EquipmentSlot.WEAPON, 0x10, LodMod.THUNDER_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 130, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 50, 10, 100, 500, 0, ItemIcon.KNUCKLE, 20, 0, 60, 50, 50, 50, 50, 20, 20, 0, 0x0));
  // MERU
  public static final RegistryDelegate<Equipment> SPIRIT_MACE = EQUIPMENT_REGISTRAR.register("spirit_mace", () -> new Equipment(75, 0x0, EquipmentSlot.WEAPON, 0x1, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 5, 0, 0, 0, 0, 0, 0, 200, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.MACE, 0, 0, 0, 0, 0, 20, 20,0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> DANCERS_SOUL = EQUIPMENT_REGISTRAR.register("dancers_soul", () -> new Equipment(5000, 0x0, EquipmentSlot.WEAPON, 0x1, LodMod.WATER_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 80, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 50, 10, 100, 500, 0, ItemIcon.HAMMER, 40, 0, 125, 50, 50, 50, 50, 20, 20, 0, 0x0));
  // KONGOL
  public static final RegistryDelegate<Equipment> SPIRIT_AXE = EQUIPMENT_REGISTRAR.register("spirit_axe", () -> new Equipment(75, 0x0, EquipmentSlot.WEAPON, 0x20, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 5, 0, 0, 0, 0, 0, 0, 300, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.AXE, 25, 0, 0, 0, 0, 20, 20, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> EARTHEN_SOUL = EQUIPMENT_REGISTRAR.register("earthen_soul", () -> new Equipment(5000, 0x0, EquipmentSlot.WEAPON, 0x20, LodMod.EARTH_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 200, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 50, 10, 100, 500, 0, ItemIcon.AXE, 40, 0, 100, 50, 50, 50, 50, 20, 20, 0, 0x0));

  static void register(final EquipmentRegistryEvent event) {
    EQUIPMENT_REGISTRAR.registryEvent(event);
  }
}