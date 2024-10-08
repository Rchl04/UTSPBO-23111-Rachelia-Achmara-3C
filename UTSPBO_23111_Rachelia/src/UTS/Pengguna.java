/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo
 */
public class Pengguna implements LoginInterface {
    protected String id;
    protected String nama;
    protected String password;
    
    public Pengguna(String id, String nama, String password){
        this.id = id;
        this. nama = nama;
        this. password = password;
    }
    
    @Override
    public boolean login(String id, String password){
        return this.id.equals(id) && this.password.equals(password);
    }
    
    public void MenuProgram(){
        System.out.println("Menu Utama");
    }
}