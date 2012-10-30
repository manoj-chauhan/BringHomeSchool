/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.hibernate.beans;

/**
 *
 * @author manoj
 */
public class Role {
    
    private int roleID;
    private String title;
    private String description;

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
