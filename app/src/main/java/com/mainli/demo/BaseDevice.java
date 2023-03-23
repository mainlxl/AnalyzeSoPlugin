package com.mainli.demo;



import java.io.Serializable;

import androidx.annotation.Keep;

/**
 * 描述一个设备 - 基类
 * <p>
 * 提示：
 * 1. 所有设备类型 (蓝牙, DMA, Show, etc) 需继承该类，可被统一管理
 * 2. 所有子类成员需可序列化，用于被持久化
 *
 * @author longyin01
 * @since 2018/11/20
 */
@Keep
public class BaseDevice implements Serializable {

    /**
     * 设备类型，{@link DeviceTypes}
     */
    private String type;

    /**
     * 连接状态
     */
    private int connectionState;

    /**
     * 选中状态
     */
    private boolean isSelected;

    /**
     * 设备名称
     */
    private String name;

    /**
     * 设备描述
     */
    private String description;

    /**
     * ClientId
     */
    private String clientId;

    /**
     * SN，一般指Show设备的DeviceId、蓝牙设备的SN
     */
    private String sn;


    /**
     * 语音PID
     */
    private int pid;

    /**
     * 语音 ASR 的 key，一般和 pid 对应
     */
    private String asrKey;

    /**
     * 产品Logo
     */
    private String image;

    /**
     * 产品Logo - 小
     */
    private String icon;

    /**
     * 设备互联，默认输出设备
     */
    private boolean defaultInterconectSource;

    public BaseDevice() {
        pid = 708;
        type = DeviceTypes.BASE;
        clientId = NetworkConstants.XIAODUAPP_CLIENT_ID;
        sn = CommonUtil.getDeviceUniqueID();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 当前设备是否属于某个DeviceType，比如 BLUETOOTH_DMA 属于 BLUETOOTH
     *
     * @param deviceType
     * @return
     */
    public boolean containsType(String deviceType) {
        return getType().startsWith(deviceType);
    }

    public int getConnectionState() {
        return connectionState;
    }


    public boolean isSelected() {
        return isSelected;
    }

    public String getName() {
        return name;
    }

    public void setConnectionState(int connectionState) {
        this.connectionState = connectionState;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClientId() {
        if (clientId == null) {
            return NetworkConstants.XIAODUAPP_CLIENT_ID;
        } else {
            return clientId;
        }
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }


    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setAsrKey(String asrKey) {
        this.asrKey = asrKey;
    }

    public String getAsrKey() {
        return asrKey;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isDefaultInterconnectSource() {
        return defaultInterconectSource;
    }

    public void setDefaultInterconectSource(boolean defaultInterconectSource) {
        this.defaultInterconectSource = defaultInterconectSource;
    }


    public String getRealDeviceId() {
        if (this instanceof UnderControlDevice) {
            return ((UnderControlDevice) this).getApplianceId();
        } else {
            return this.sn;
        }
    }

}
