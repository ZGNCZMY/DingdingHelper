package com.ucmap.dingdinghelper.entity;

/**
 * <b>@项目名：</b> dingdinghelper<br>
 * <b>@包名：</b>com.ucmap.dingdinghelper<br>
 * <b>@创建者：</b> cxz --  just<br>
 * <b>@创建时间：</b> &{DATE}<br>
 * <b>@公司：</b> 宝诺科技<br>
 * <b>@邮箱：</b> cenxiaozhong.qqcom@qq.com<br>
 * <b>@描述</b><br>
 */

public class MessageEvent {

    private int flag_bit;

    public MessageEvent(int flag_bit) {
        this.flag_bit = flag_bit;
    }

    public int getFlag_bit() {
        return flag_bit;
    }

    public void setFlag_bit(int flag_bit) {
        this.flag_bit = flag_bit;
    }
}
