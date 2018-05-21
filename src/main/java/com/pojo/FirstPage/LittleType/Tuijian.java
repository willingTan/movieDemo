package com.pojo.FirstPage.LittleType;

import java.util.List;

public class Tuijian {
    List<Pictures> pics;
    List<Txtlist> txtlists;

    public Tuijian(List<Pictures> pics, List<Txtlist> txtlists) {
        this.pics = pics;
        this.txtlists = txtlists;
    }

    public List<Pictures> getPics() {
        return pics;
    }

    public void setPics(List<Pictures> pics) {
        this.pics = pics;
    }

    public List<Txtlist> getTxtlists() {
        return txtlists;
    }

    public void setTxtlists(List<Txtlist> txtlists) {
        this.txtlists = txtlists;
    }
}
