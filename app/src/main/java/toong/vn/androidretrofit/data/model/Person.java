package toong.vn.androidretrofit.data.model;

import com.google.gson.annotations.Expose;

public class Person {
    @Expose
    private String name;
    @Expose
    private int age;
    @Expose
    private String about;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}