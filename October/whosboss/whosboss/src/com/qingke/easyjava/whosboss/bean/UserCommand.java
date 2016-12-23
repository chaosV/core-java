package com.qingke.easyjava.whosboss.bean;

/**
 * The value object for holding user's command information.
 * @author Qingke.me
 */
public class UserCommand {

    private String name;
    private String mode;
    private String[] params;
    
    public UserCommand(String name) {
        this.name = name;
    }

    public UserCommand(String name, String mode, String[] params) {
        this.name = name;
        this.mode = mode;
        this.params = params;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }
}
