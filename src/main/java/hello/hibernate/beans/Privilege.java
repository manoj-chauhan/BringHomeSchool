/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.hibernate.beans;

/**
 *
 * @author manoj
 */
public class Privilege {
    
    private int privilegeID;
    private String name;
    private String description;

    public int getPrivilegeID() {
        return privilegeID;
    }

    public void setPrivilegeID(int privilegeID) {
        this.privilegeID = privilegeID;
    }

    public String getName() {
        return name;
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

   

    
}
