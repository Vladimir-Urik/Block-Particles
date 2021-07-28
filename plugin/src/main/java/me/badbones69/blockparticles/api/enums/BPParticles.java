package me.badbones69.blockparticles.api.enums;

public enum BPParticles {
    
    LOVEWELL(),
    BIGLOVEWELL(),
    LOVETORNADO(),
    WITCHTORNADO(),
    FLAMEWHEEL(),
    SOULWELL(),
    BIGSOULWELL(),
    SANTAHAT(),
    SNOWBLAST(),
    RAINBOW(),
    ENDERSIGNAL(),
    MOBSPAWNER(),
    ANGRYVILLAGER(),
    HAPPYVILLAGER(),
    FOOTPRINT(),
    FIRESPEW(),
    SNOWSTORM(),
    DOUBLEWITCH(),
    WITCH(),
    MAGIC(),
    SPEW(),
    RED_HALO(),
    ORANGE_HALO(),
    PURPLE_HALO(),
    GREEN_HALO(),
    HALO(),
    MUSIC(),
    POTION(),
    SNOW(),
    FIRESTORM(),
    WATER(),
    CHAINS(),
    ENCHANT(),
    FOG(),
    STORM(),
    BIGFLAME(),
    FLAME(),
    VOLCANO(),
    SPIRAL(),
    DOUBLESPIRAL(),
    CRIT(),
    BIGCRIT();
    
    public static BPParticles getFromName(String name) {
        for (BPParticles fountain : values()) {
            if (fountain.name().equalsIgnoreCase(name.replace(" ", ""))) {
                return fountain;
            }
        }
        return null;
    }
    
}