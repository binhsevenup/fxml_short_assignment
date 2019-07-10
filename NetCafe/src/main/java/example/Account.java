package example;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Account {

    private String username;
    private String password;
    private String fullName;
    private String avatar;
    private int remainTime;
    private ImageView imageAvatar;

    public Account() {
    }

    public Account(String username, String password, String fullName, String avatar, int remainTime, ImageView imageAvatar) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.avatar = avatar;
        this.remainTime = remainTime;
        this.imageAvatar = new ImageView(new Image(this.avatar, true)); // đưa ảnh vào image view.
        this.imageAvatar.setFitWidth(50); // set kích thước.
        this.imageAvatar.setFitHeight(50);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(int remainTime) {
        this.remainTime = remainTime;
    }

    public ImageView getImageAvatar() {
        return imageAvatar;
    }

    public void setImageAvatar(ImageView imageAvatar) {
        this.imageAvatar = imageAvatar;
    }
}
