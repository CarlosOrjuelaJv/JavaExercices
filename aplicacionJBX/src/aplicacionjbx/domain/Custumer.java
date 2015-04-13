/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionjbx.domain;

/**
 *
 * @author lp_02
 */
public class Custumer {
    String name;
    int age;
    int id;

    public Custumer() {
    
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String toString(){
        String s="name: "+this.name+",Age: "+this.age+",Id: "+this.id;
        return s;
    }
    
    
}
