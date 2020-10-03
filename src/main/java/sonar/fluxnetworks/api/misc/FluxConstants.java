package sonar.fluxnetworks.api.misc;

import java.util.UUID;

//TODO add things
public class FluxConstants {

    public static final int INVALID_NETWORK_ID = -1;
    public static final int INVALID_NETWORK_COLOR = 0xb2b2b2;

    public static UUID DEFAULT_UUID = new UUID(-1, -1);

    // NBT masks
    public static final int FLAG_SAVE_ALL = 0x1;
    public static final int FLAG_NET_BASIS = 0x2;
    public static final int FLAG_NET_MEMBERS = 0x4;
    public static final int FLAG_NET_DEVICES = 0x8;
    public static final int FLAG_NET_STATS = 0x10;
    public static final int FLAG_NET_REMOVE = 0x20;
}