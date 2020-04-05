package com.example.comex.settings_page;

public class Settings_Provider {
    private int img_res;
    private String settings_title;

    public Settings_Provider(int img_res, String settings_title) {
        this.setImg_res(img_res);
        this.setSettings_title(settings_title);
    }

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getSettings_title() {
        return settings_title;
    }

    public void setSettings_title(String settings_title) {
        this.settings_title = settings_title;
    }
}
