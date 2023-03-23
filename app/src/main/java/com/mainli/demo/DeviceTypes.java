package com.mainli.demo;

import androidx.annotation.Keep;

/**
 * 设备类型常量
 *
 * @author longyin01
 * @since 2018/11/27
 */
@Keep
public class DeviceTypes {

    /**
     * 所有设备
     */
    public static final String BASE = "";

    /**
     * 蓝牙设备
     */
    public static final String BLUETOOTH = "bluetooth";

    /**
     * 经典蓝牙设备 eg. 普通蓝牙耳机, Jabra etc.
     */
    //public static final String BLUETOOTH_CLASSICAL = "bluetooth_classical";

    /**
     * 支持的经典蓝牙设备，eg. Jabra设备 etc.
     */
    //public static final String BLUETOOTH_CLASSICAL_SUPPORTED = "bluetooth_classical_supported";

    /**
     * 不支持的经典蓝牙设备，eg. 普通蓝牙耳机、音箱 etc.
     */
    //public static final String BLUETOOTH_CLASSICAL_UNSUPPORTED = "bluetooth_classical_unsupported";

    /**
     * DMA设备
     */
    public static final String BLUETOOTH_DMA = "bluetooth_dma";

    /**
     * 通用设备（可以被设备列表获取的）
     */
    public static final String GENERAL = "general";
    /**
     * Show设备（1s、Pad）
     */
    public static final String GENERAL_SHOW = "general_show";
    /**
     * 小度音箱
     */
    public static final String GENERAL_SPEAKER = "general_speak";
    /**
     * 儿童故事机
     */
    public static final String GENERAL_STORY = "general_story";

    /**
     * 车机
     */
    public static final String GENERAL_SHOW_VEHICLE = "general_show_vehicle";

    /**
     * 小度路由器
     */
    public static final String GENERAL_ROUTER = "general_router";

    /**
     * 词典笔
     */
    public static final String GENERAL_DICT_PEN = "general_dict_pen";

    /**
     * 电视
     */
    public static final String GENERAL_TV = "general_tv";

    /**
     * 健身镜
     */
    public static final String GENERAL_MIRROR = "general_mirror";

    /**
     * 闹钟音箱
     */
    public static final String GENERAL_CLOCK = "general_clock";

    /**
     * 所有三方设备的公共前缀
     */
    public static final String GENERAL_THIRD_PARTY = "general_third_party";

    /**
     * 三方：类音箱设备,如故事机等
     */
    public static final String GENERAL_THIRD_PARTY_SPEAKER = "general_third_party_speaker";

    /**
     * 小度手表
     */
    public static final String GENERAL_WATCH = "general_watch";

    /**
     * Air costdown设备 clientid
     */
    public static final String AIR_COSTDOWN_CLIENT_ID = "QRqdMIqrMNsMCx6TvwQ4Hx42OIAw8lFF";

    /**
     * 小度智能屏 SE 设备 clientid
     */
    public static final String SHOW_SE_CLIENT_ID = "UMpdlYLDNHTKaBBzBlRRvgtNCuvUK5MU";

    public static final String IOT_DOOR_LOCK = "DOOR_LOCK";

    public static final String IOT_BODY_FAT_SCALE = "BODY_FAT_SCALE";

}
