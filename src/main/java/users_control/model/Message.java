package users_control.model;

import com.fasterxml.jackson.annotation.JsonView;

import users_control.views.Views;

public class Message {

    @JsonView(Views.Public.class)
    private String title;

    @JsonView(Views.Public.class)
    private String content;

    public Message(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}