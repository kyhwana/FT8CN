package com.bg7yoz.ft8cn;

public final class FT8Common {
    public static final int FT8_MODE=0;
    public static final int FT4_MODE=1;
    public static final int SAMPLE_RATE=12000;
    public static final int FT8_SLOT_TIME=15;
    public static final int FT8_SLOT_TIME_MILLISECOND=15000;//一个周期的毫秒数
    public static final int FT4_SLOT_TIME_MILLISECOND=7500;
    public static final int FT8_5_SYMBOLS_MILLISECOND=800;//5个符号所需的


    public static final float FT4_SLOT_TIME=7.5f;
    public static final int FT8_SLOT_TIME_M=150;//15秒
    public static final int FT8_5_SYMBOLS_TIME_M =8;//5个符号的时间长度0.8秒
    public static final int FT4_SLOT_TIME_M=75;//7.5秒
    public static final int FT8_TRANSMIT_DELAY=500;//默认发射延迟时长，毫秒
}
