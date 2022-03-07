package rsb.internal.globval;

public class WidgetIndices {
    /**
     * Describes bank widgets
     * Last reviewed: 2/3/2022 1:57 am UTC+1
     */
    public static class Bank {
        public static final int GROUP_INDEX = 12;
        public static final int PARENT_CONTAINER = 0;
        public static final int CONTAINER = 1;
        public static final int FRAME_DYNAMIC_CONTAINER = 2; // Contains stone border sprites 0-11, 11 is close button
        public static final int TITLE_LABEL = 3;
        public static final int BUTTON_SHOW_TUTORIAL_CONTAINER = 4;
        public static final int ITEM_SLOTS_USED_LABEL = 5;
        public static final int ITEM_SLOTS_SEPARATOR_LINE = 6;
        public static final int ITEM_SLOTS_CONTAINER= 7;
        public static final int BUTTON_GROUP_STORAGE_CONTAINER = 8;
        public static final int ITEM_SLOTS_MAX_LABEL = 9;
        public static final int INNER_FRAME_DYNAMIC_CONTAINER = 10; // Contains 0 sprite tab add
        public static final int TABS_DYNAMIC_CONTAINER = 11; // Contains TAB sprites 0-19
        public static final int TABS_SEPARATOR_LINE = 12;
        public static final int ITEMS_DYNAMIC_CONTAINER = 13; // Contains 0-x bank items
        public static final int SCROLLBAR_DYNAMIC_CONTAINER = 14; // Contains 0-5 sprites
        public static final int FOOTER_CONTAINER = 15;
        public static final int REARRANGE_MODE_LABEL = 16;
        public static final int BUTTON_SWAP_CONTAINER = 17;
        public static final int BUTTON_SWAP_LABEL = 18;
        public static final int BUTTON_INSERT_CONTAINER = 19;
        public static final int BUTTON_INSERT_LABEL = 20;
        public static final int WITHDRAW_AS_LABEL = 21;
        public static final int BUTTON_ITEM_CONTAINER = 22;
        public static final int BUTTON_ITEM_LABEL = 23;
        public static final int BUTTON_NOTE_CONTAINER = 24;
        public static final int BUTTON_NOTE_LABEL = 25;
        public static final int BOTTOM_BAR_CONTAINER = 26;
        public static final int QUANTITY_LABEL = 27;
        public static final int BUTTON_WITHDRAWAL_QUANTITY_1_CONTAINER = 28;
        public static final int BUTTON_WITHDRAWAL_QUANTITY_1_LABEL = 29;
        public static final int BUTTON_WITHDRAWAL_QUANTITY_5_CONTAINER = 30;
        public static final int BUTTON_WITHDRAWAL_QUANTITY_5_LABEL = 31;
        public static final int BUTTON_WITHDRAWAL_QUANTITY_10_CONTAINER = 32;
        public static final int BUTTON_WITHDRAWAL_QUANTITY_10_LABEL = 33;
        public static final int BUTTON_WITHDRAWAL_QUANTITY_X_CONTAINER = 34;
        public static final int BUTTON_WITHDRAWAL_QUANTITY_X_LABEL = 35;
        public static final int BUTTON_WITHDRAWAL_QUANTITY_ALL_CONTAINER = 36;
        public static final int BUTTON_WITHDRAWAL_QUANTITY_ALL_LABEL = 37;
        public static final int BUTTON_PLACEHOLDERS_SPRITE = 38;
        public static final int BUTTON_PLACEHOLDERS_ICON_SPRITE = 39;
        public static final int BUTTON_SEARCH_SPRITE = 40;
        public static final int BUTTON_SEARCH_ICON_SPRITE = 41;
        public static final int BUTTON_DEPOSIT_CARRIED_ITEMS_SPRITE = 42;
        public static final int BUTTON_DEPOSIT_CARRIED_ITEMS_ICON_SPRITE = 43;
        public static final int BUTTON_DEPOSIT_WORN_ITEMS_SPRITE = 44;
        public static final int BUTTON_DEPOSIT_WORN_ITEMS_ICON_SPRITE = 45;
        public static final int INCINERATOR_DYNAMIC_CONTAINER = 46;
        // 47-48
        public static final int SETTINGS_CONTAINER = 49;
        // 50 - 111
        public static final int BUTTON_SETTINGS_DYNAMIC_CONTAINER = 112; // Contains 0-1 sprites
        public static final int BUTTON_EQUIPMENT_DYNAMIC_CONTAINER = 113; // Contains 0-1 sprites
        // 114 - 115
    }

    /**
     * Describes minimap widgets
     * Last reviewed: 28/2/2022 1:57 am UTC+1
     */
    public static class Minimap {
        public static final int GROUP_INDEX = 160;
        public static final int XP_ORB_SPRITE = 1; // Interactions: "Hide", "Setup"
        public static final int HEALTH_ORB_PARENT_CONTAINER = 2;
        public static final int HEALTH_ORB_PARENT_SPRITE = 3;
        public static final int HEALTH_ORB_CONTAINER = 4; // Interactions: "Cure"
        public static final int HEALTH_ORB_LABEL = 5;
        public static final int HEALTH_ORB_SPRITE = 6;
        // 7 - 8 gap
        public static final int HEALTH_ORB_ENERGY_CONSUMED_CONTAINER = 9;
        public static final int HEALTH_ORB_ENERGY_CONSUMED_SPRITE = 10;
        public static final int HEALTH_ORB_ICON_CONTAINER = 11;
        public static final int HEALTH_ORB_ICON_SPRITE = 12;
        public static final int QUICK_PRAYER_ORB_PARENT_CONTAINER = 13;
        public static final int QUICK_PRAYER_ORB_PARENT_SPRITE = 14;
        public static final int QUICK_PRAYER_ORB_CONTAINER = 15; // Interactions: "Activate", "Setup"
        public static final int QUICK_PRAYER_ORB_LABEL = 16;
        public static final int QUICK_PRAYER_ORB_SPRITE = 17;
        public static final int QUICK_PRAYER_ORB_ENERGY_CONSUMED_CONTAINER = 18;
        public static final int QUICK_PRAYER_ORB_ENERGY_CONSUMED_SPRITE = 19;
        public static final int QUICK_PRAYER_ORB_ICON_SPRITE = 20;
        public static final int RUN_ORB_PARENT_CONTAINER = 21;
        public static final int RUN_ORB_PARENT_SPRITE = 22;
        public static final int RUN_ORB_CONTAINER = 23; // Interactions: "Toggle"
        public static final int RUN_ORB_LABEL = 24;
        public static final int RUN_ORB_SPRITE = 25;
        public static final int RUN_ORB_ENERGY_CONSUMED_CONTAINER = 26;
        public static final int RUN_ORB_ENERGY_CONSUMED_SPRITE = 27;
        public static final int RUN_ORB_ICON_SPRITE = 28;
        public static final int SPEC_ORB_PARENT_CONTAINER = 29;
        public static final int SPEC_ORB_PARENT_SPRITE = 30;
        public static final int SPEC_ORB_CONTAINER = 31; // Interactions: "Use"
        public static final int SPEC_ORB_LABEL = 32;
        public static final int SPEC_ORB_ICON_SPRITE = 33;
        public static final int SPEC_ORB_ENERGY_CONSUMED_CONTAINER = 34;
        public static final int SPEC_ORB_ENERGY_CONSUMED_SPRITE = 35;
        public static final int SPEC_ORB_RECHARGE_CONTAINER = 36; // NOTE: unclear
        public static final int SPEC_ORB_SPRITE = 37;
        public static final int BOND_ORB_PARENT_CONTAINER = 38;
        public static final int BOND_ORB_PARENT_SPRITE = 39;
        public static final int BOND_ORB_ICON_SPRITE = 40;
        public static final int BOND_ORB_CONTAINER = 41; // Interactions: "Open Store", "Bond Pouch"
        public static final int BOND_ORB_SPRITE = 42;
        public static final int WORLDMAP_ORB_CONTAINER = 43;
        public static final int WIKI_BANNER_PARENT_CONTAINER = 44;
        public static final int WIKI_BANNER_CONTAINER = 45; // Interactions: ... 10 unknown
        public static final int WIKI_BANNER_SPRITE = 46;
        public static final int WORLDMAP_ORB_PARENT_SPRITE = 47;
        public static final int WORLDMAP_ORB_SPRITE = 48; // Interactions: "Floating World Map", "Fullscreen World Map"
    }

    /**
     * Describes deposit box widgets
     * Last reviewed: 28/2/2022 2:51 am UTC+1
     */
    public static class DepositBox {
        public static final int GROUP_INDEX = 192;
        public static final int PARENT_CONTAINER = 0;
        public static final int DYNAMIC_CONTAINER = 1; // Contains stone border sprites 0-11
        public static final int ITEMS_DYNAMIC_CONTAINER = 2; // Contains sprites of items inside deposit box 0-27
        public static final int BOTTOM_BAR_RIGHT_SIDE_CONTAINER = 3;
        public static final int BUTTON_DEPOSIT_INVENTORY_SPRITE = 4;
        public static final int BUTTON_DEPOSIT_INVENTORY_ICON_SPRITE = 5;
        public static final int BUTTON_DEPOSIT_WORN_ITEMS_SPRITE = 6;
        public static final int BUTTON_DEPOSIT_WORN_ITEMS_ICON_SPRITE = 7;
        public static final int BUTTON_DEPOSIT_LOOT_SPRITE = 8;
        public static final int BUTTON_DEPOSIT_LOOT_ICON_SPRITE = 9;
        public static final int BOTTOM_BAR_LEFT_SIDE_CONTAINER = 10;
        public static final int BUTTON_DEFAULT_QUANTITY_1_DYNAMIC_CONTAINER = 11; // Contains button sprites 0-8
        public static final int BUTTON_DEFAULT_QUANTITY_1_LABEL = 12;
        public static final int BUTTON_DEFAULT_QUANTITY_5_DYNAMIC_CONTAINER = 13; // Contains button sprites 0-8
        public static final int BUTTON_DEFAULT_QUANTITY_5_LABEL = 14;
        public static final int BUTTON_DEFAULT_QUANTITY_10_DYNAMIC_CONTAINER = 15; // Contains button sprites 0-8
        public static final int BUTTON_DEFAULT_QUANTITY_10_LABEL = 16;
        public static final int BUTTON_DEFAULT_QUANTITY_X_DYNAMIC_CONTAINER = 17; // Contains button sprites 0-8
        public static final int BUTTON_DEFAULT_QUANTITY_X_LABEL = 18;
        public static final int BUTTON_DEFAULT_QUANTITY_ALL_DYNAMIC_CONTAINER = 19; // Contains button sprites 0-8
        public static final int BUTTON_DEFAULT_QUANTITY_ALL_LABEL = 20;
    }

    /**
     * Describes store widgets
     * Last reviewed: 2/3/2022 1:47 am UTC+1
     */
    public static class Store {
        public static final int GROUP_INDEX = 300;
        public static final int PARENT_CONTAINER = 0;
        public static final int DYNAMIC_CONTAINER = 1; // Contains stone border sprites 0-11
        public static final int ITEMS_DYNAMIC_CONTAINER = 16; // Contains items sold sprites 0-16
        public static final int BOTTOM_TEXT_LABEL = 18;
    }

    /**
     * Describes skill tab widgets
     * Last reviewed: 28/2/2022 2:18 am UTC+1
     */
    public static class SkillsTab {
        public static final int GROUP_INDEX = 320;
        public static final int CONTAINER = 0;
        public static final int ATTACK_CONTAINER = 1;
        public static final int STRENGTH_CONTAINER = 2;
        public static final int DEFENCE_CONTAINER = 3;
        public static final int RANGED_CONTAINER = 4;
        public static final int PRAYER_CONTAINER = 5;
        public static final int MAGIC_CONTAINER = 6;
        public static final int RUNECRAFT_CONTAINER = 7;
        public static final int CONSTRUCTION_CONTAINER = 8;
        public static final int HITPOINTS_CONTAINER = 9;
        public static final int AGILITY_CONTAINER = 10;
        public static final int HERBLORE_CONTAINER = 11;
        public static final int THIEVING_CONTAINER = 12;
        public static final int CRAFTING_CONTAINER = 13;
        public static final int FLETCHING_CONTAINER = 14;
        public static final int SLAYER_CONTAINER = 15;
        public static final int HUNTER_CONTAINER = 16;
        public static final int MINING_CONTAINER = 17;
        public static final int SMITHING_CONTAINER = 18;
        public static final int FISHING_CONTAINER = 19;
        public static final int COOKING_CONTAINER = 20;
        public static final int FIREMAKING_CONTAINER = 21;
        public static final int WOODCUTTING_CONTAINER = 22;
        public static final int FARMING_CONTAINER = 23;
        public static final int TOTAL_LEVEL_CONTAINER = 24;
        public static final int TOTAL_LEVEL_LEFT_SIDE_SPRITE = 25;
        public static final int TOTAL_LEVEL_RIGHT_SIDE_SPRITE = 26;
        public static final int TOTAL_LEVEL_LABEL = 27;
        public static final int MOUSEOVER_TOOLTIP_CONTAINER = 28;
    }

    /**
     * Describes click to play screen widgets
     * Last reviewed: 2/3/2022 2:28 am UTC+1
     */
    static class ClickToPlayScreen {
        public static final int GROUP_INDEX = 378;
        public static final int PARENT_FIRST_CONTAINER = 0;
        public static final int PARENT_SECOND_CONTAINER = 1;
        public static final int INNER_FRAME_CONTAINER = 2;
        public static final int UNKNOWN_CONTAINER = 3;
        public static final int MOTW_CONTAINER = 4;
        public static final int UNKNOWN_MODEL = 5;
        public static final int MOTW_TITLE_LABEL = 6;
        public static final int MOTW_TEXT_LABEL = 7;
        // 8 - 55 gap
        public static final int MOTW_LEFT_SIDE_MODEL = 56;
        public static final int MOTW_RIGHT_SIDE_MODEL = 57;
        public static final int ABOVE_MOTW_CONTAINER = 58;
        public static final int SWITCH_STYLE_DYNAMIC_CONTAINER = 59; // Contains label[0]
        public static final int WELCOME_MSG_CONTAINER = 60;
        public static final int WELCOME_MSG_SPRITE = 61;
        public static final int WELCOME_MSG_TITLE_LABEL = 62;
        public static final int WELCOME_MSG_TEXT_LABEL = 63;
        // 64 - 73 gap
        public static final int BUTTON_MEMBERSHIP_SPRITE = 74;
        // 75
        public static final int BUTTON_MEMBERSHIP_ICON_SPRITE = 76;
        public static final int BUTTON_MEMBERSHIP_TEXT_LABEL = 77;
        public static final int BUTTON_CLICK_HERE_TO_PLAY_CONTAINER = 78;
        public static final int BUTTON_MEMBERSHIP_CONTAINER = 79;
        public static final int BUTTON_CLICK_HERE_TO_PLAY_SPRITE = 80;
        public static final int BUTTON_BANK_PIN_CONTAINER = 81;
        // 82
        public static final int BUTTON_UNREAD_MSG_CONTAINER = 83;
        public static final int BUTTON_CLICK_HERE_TO_PLAY_ICON_SPRITE = 84;
        public static final int BUTTON_PASSWORD_CONTAINER = 85;
        public static final int BANNER_CONTAINER = 86;
        public static final int BUTTON_CLICK_HERE_TO_PLAY_LABEL = 87;
    }

    /**
     * Describes worn equipment tab widgets
     * Last reviewed: 1/3/2022 1:21 am UTC+1
     */
    public static class WornEquipmentTab {
        public static final int GROUP_INDEX = 387;
        public static final int PARENT_CONTAINER = 0;
        public static final int EQUIPMENT_STATS_DYNAMIC_CONTAINER = 1;     // Contains button sprites 0-8 Interactions: View equipment stats
        public static final int EQUIPMENT_STATS_ICON_SPRITE = 2;
        public static final int GUIDE_PRICES_DYNAMIC_CONTAINER = 3;        // Contains button sprites 0-8 Interactions: View guide prices
        public static final int GUIDE_PRICES_ICON_SPRITE = 4;
        public static final int ITEMS_KEPT_ON_DEATH_DYNAMIC_CONTAINER = 5; // Contains button sprites 0-8 Interactions  View items kept on death
        public static final int ITEMS_KEPT_ON_DEATH_SPRITE = 6;
        public static final int CALL_FOLLOWER_DYNAMIC_CONTAINER = 7;       // Contains button sprites 0-8 Interactions  Call follower
        public static final int CALL_FOLLOWER_SPRITE = 8;
        public static final int MIDDLE_STRAIGHT_LINE_SPRITE = 9;
        public static final int LEFT_STRAIGHT_LINE_SPRITE = 10;
        public static final int RIGHT_STRAIGHT_LINE_SPRITE = 11;
        public static final int MIDDLE_HORIZONTAL_STRAIGHT_LINE_SPRITE = 12;
        public static final int TOP_HORIZONTAL_STRAIGHT_LINE_SPRITE = 13;
        // 14
        public static final int HEAD_DYNAMIC_CONTAINER = 15;  // Contains slot[0] sprite and item[1] sprite which has itemID
        public static final int BACK_DYNAMIC_CONTAINER = 16;  // Contains slot[0] sprite and item[1] sprite which has itemID
        public static final int NECK_DYNAMIC_CONTAINER = 17; // Contains slot[0] sprite and item[1] sprite which has itemID
        public static final int WEAPON_DYNAMIC_CONTAINER = 18; // Contains slot[0] sprite and item[1] sprite which has itemID
        public static final int CHEST_DYNAMIC_CONTAINER = 19; // Contains slot[0] sprite and item[1] sprite which has itemID
        public static final int SHIELD_DYNAMIC_CONTAINER = 20; // Contains slot[0] sprite and item[1] sprite which has itemID
        public static final int LEGS_DYNAMIC_CONTAINER = 21; // Contains slot[0] sprite and item[1] sprite which has itemID
        public static final int HANDS_DYNAMIC_CONTAINER = 22; // Contains slot[0] sprite and item[1] sprite which has itemID
        public static final int FEET_DYNAMIC_CONTAINER = 23; // Contains slot[0] sprite and item[1] sprite which has itemID
        public static final int RING_DYNAMIC_CONTAINER = 24; // Contains slot[0] sprite and item[1] sprite which has itemID
        public static final int AMMUNITION_DYNAMIC_CONTAINER = 25; // Contains slot[0] sprite and item[1] sprite which has itemID
        public static final int UNKNOWN1_CONTAINER = 26;
        public static final int UNKNOWN2_CONTAINER = 27;
    }

    /**
     * Describes grand exchange widgets
     * Last reviewed: 3/3/2022 0:14 am UTC+1
     */
    public static class GrandExchange {
        public static final int GROUP_INDEX = 465;
        public static final int PARENT_CONTAINER = 0;
        public static final int CONTAINER = 1;
        public static final int DYNAMIC_CONTAINER = 2; // Contains stone borders close button 0-11
        public static final int BUTTON_HISTORY_DYNAMIC_CONTAINER = 3; // Contains sprites, label 0-9
        public static final int OFFER_STATUS_BUTTON_BACK_SPRITE = 4;
        public static final int INNER_FRAME_CONTAINER = 5;
        public static final int TITLE_DYNAMIC_CONTAINER = 6; // Contains label[0]
        public static final int FIRST_SLOT_DYNAMIC_CONTAINER = 7; // Contains 0-4 icon layers, 5-15 steel borders, 16 title label, 26 left icon sprite, 27 right icon sprite
        public static final int SECOND_SLOT_DYNAMIC_CONTAINER = 8; // Contains 0-4 icon layers, 5-15 steel borders, 16 title label, 26 left icon sprite, 27 right icon sprite
        public static final int THIRD_SLOT_DYNAMIC_CONTAINER = 9; // Contains 0-4 icon layers, 5-15 steel borders, 16 title label, 26 left icon sprite, 27 right icon sprite
        public static final int FOURTH_SLOT_DYNAMIC_CONTAINER = 10; // Contains 0-4 icon layers, 5-15 steel borders, 16 title label, 26 left icon sprite, 27 right icon sprite
        public static final int FIFTH_SLOT_DYNAMIC_CONTAINER = 11; // Contains 0-4 icon layers, 5-15 steel borders, 16 title label, 26 left icon sprite, 27 right icon sprite
        public static final int SIXTH_SLOT_DYNAMIC_CONTAINER = 12; // Contains 0-4 icon layers, 5-15 steel borders, 16 title label, 26 left icon sprite, 27 right icon sprite
        public static final int SEVENTH_SLOT_DYNAMIC_CONTAINER = 13; // Contains 0-4 icon layers, 5-15 steel borders, 16 title label, 26 left icon sprite, 27 right icon sprite
        public static final int EIGHT_SLOT_DYNAMIC_CONTAINER = 14; // Contains 0-4 icon layers, 5-15 steel borders, 16 title label, 26 left icon sprite, 27 right icon sprite
        public static final int OFFER_STATUS_DYNAMIC_CONTAINER = 15;
        public static final int OFFER_STATUS_ITEM_DESCRIPTION_LABEL = 16;
        public static final int OFFER_STATUS_ABOVE_PRICE_TEXT_LABEL = 17;
        public static final int OFFER_STATUS_INFO_ICON_DYNAMIC_CONTAINER = 18; // 0 icon sprite
        public static final int OFFER_STATUS_COLLECTION_AREA_SPRITE = 19;
        public static final int OFFER_STATUS_STEEL_BORDER_SEPARATOR_LINE = 20;
        public static final int OFFER_STATUS_STEEL_BORDER_VERTICAL_SEPARATOR_LINE = 21;
        public static final int UNKNOWN_SPRITE = 22;
        public static final int OFFER_STATUS_BOTTOM_BAR_DYNAMIC_CONTAINER = 23; // 0 cancel button sprite, 1 sold text
        public static final int OFFER_STATUS_COLLECTION_AREA_DYNAMIC_CONTAINER = 24; // 0 bg sprite left item, 1 bg sprite right item, 2 item sprite, 3 item sprite
    }

    /**
     * Describes combat options tab widgets
     * Last reviewed: 1/3/2022 0:31 am UTC+1
     */
    public static class CombatOptionsTab {
        public static final int GROUP_INDEX = 593;
        public static final int PARENT_CONTAINER = 0;
        public static final int WEAPON_NAME_LABEL = 1;
        public static final int WEAPON_CATEGORY_LABEL = 2;
        public static final int COMBAT_LEVEL_LABEL = 3;
        public static final int WEAPON_STYLE_ONE_CONTAINER = 4;
        public static final int WEAPON_STYLE_ONE_DYNAMIC_CONTAINER = 5; // Contains button sprites 0-8
        public static final int WEAPON_STYLE_ONE_SPRITE = 6;
        public static final int WEAPON_STYLE_ONE_LABEL = 7;
        public static final int WEAPON_STYLE_TWO_CONTAINER = 8;
        public static final int WEAPON_STYLE_TWO_DYNAMIC_CONTAINER = 9;
        public static final int WEAPON_STYLE_TWO_SPRITE = 10;
        public static final int WEAPON_STYLE_TWO_LABEL = 11;
        public static final int WEAPON_STYLE_THREE_CONTAINER = 12;
        public static final int WEAPON_STYLE_THREE_DYNAMIC_CONTAINER = 13;
        public static final int WEAPON_STYLE_THREE_SPRITE = 14;
        public static final int WEAPON_STYLE_THREE_LABEL = 15;
        public static final int WEAPON_STYLE_FOUR_CONTAINER = 16;
        public static final int WEAPON_STYLE_FOUR_DYNAMIC_CONTAINER = 17;
        public static final int WEAPON_STYLE_FOUR_SPRITE = 18;
        public static final int WEAPON_STYLE_FOUR_LABEL = 19;
        public static final int AUTO_CAST_SPELL_PARENT_CONTAINER = 20;
        public static final int AUTO_CAST_DEFENSIVE_SPELL_DYNAMIC_CONTAINER = 21; // Contains button sprites 0-8
        public static final int AUTO_CAST_DEFENSIVE_SPELL_CONTAINER = 22;
        public static final int AUTO_CAST_DEFENSIVE_SPELL_ICON_SPRITE = 23;
        public static final int AUTO_CAST_DEFENSIVE_SPELL_SHIELD_SPRITE = 24;
        public static final int AUTO_CAST_DEFENSIVE_SPELL_LABEL = 25;
        public static final int AUTO_CAST_SPELL_DYNAMIC_CONTAINER = 26;  // Contains button sprites 0-8
        public static final int AUTO_CAST_SPELL_CONTAINER = 27;
        public static final int AUTO_CAST_SPELL_ICON_SPRITE = 28;
        public static final int AUTO_CAST_SPELL_LABEL = 29;
        public static final int AUTO_RETALIATE_CONTAINER = 30;
        public static final int AUTO_RETALIATE_ICON_LABEL = 31;
        public static final int AUTO_RETALIATE_DYNAMIC_CONTAINER = 32;  // Contains button sprites 0-8
        public static final int AUTO_RETALIATE_SPRITE = 33;
        public static final int AUTO_RETALIATE_LABEL = 34;
        public static final int SPECIAL_ATTACK_CONTAINER = 35;
        public static final int SPECIAL_ATTACK_DYNAMIC_CONTAINER = 36;  // Contains button sprites 0-8
        public static final int SPECIAL_ATTACK_BAR = 37;
        public static final int SPECIAL_ATTACK_GREEN_BAR_CONTAINER = 38;
        public static final int SPECIAL_ATTACK_GREEN_BAR_GREEN_BOX = 39;
        public static final int SPECIAL_ATTACK_LABEL = 40;
        public static final int SPECIAL_ATTACK_BROWN_GREEN_BOX = 41;
        public static final int MOUSEOVER_TOOLTIP_CONTAINER = 42;
    }

    /**
     * Describes dynamic widgets
     * Last reviewed: 3/3/2022 0:37 am UTC+1
     */
    public static class DynamicComponents {
        public static class GrandExchangeOfferTittle {
            public static final int BUTTON_COLLECT_SPRITE = 0;
            public static final int BUTTON_COLLECT_LABEL = 1;
            public static final int TITLE_LABEL = 2;
        }
        public static class GrandExchangeSlot {
            public static final int BUTTON_BUY_BG_BOX = 1;
            public static final int BUTTON_SELL_BG_BOX = 2;
            public static final int BUTTON_BUY_ICON_BOX = 3;
            public static final int BUTTON_SELL_ICON_BOX = 4;
            // 5-15 steel border sprites
            public static final int TITLE_LABEL = 16;
            public static final int ITEM_SPRITE = 17;
            public static final int ITEM_ID_SPRITE = 18; // id, quantity, quantity mode
            public static final int ITEM_NAME_LABEL = 19;
            public static final int PROGRESS_BAR_BOX = 20;
            public static final int ITEM_EACH_PRICE_LABEL = 25;
            public static final int BUY_ICON_SPRITE = 26;
            public static final int SELL_ICON_SPRITE = 27;
        }
        public static class GrandExchangeOfferDetails {
            public static final int ITEM_QUANTITY_LABEL = 18;
            public static final int ITEM_EACH_PRICE_LABEL = 25;
            public static final int ITEM_TOTAL_PRICE_LABEL = 29;
        }
        public static class GrandExchangeCollectionArea {
            public static final int LEFT_ITEM_BG_SPRITE = 0;
            public static final int RIGHT_ITEM_BG_SPRITE = 1;
            public static final int LEFT_ITEM_SPRITE = 2;
            public static final int RIGHT_ITEM_SPRITE = 3;
        }
    }
}
