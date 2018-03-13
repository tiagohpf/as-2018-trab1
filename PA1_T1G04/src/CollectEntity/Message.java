/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectEntity;

/**
 *
 * @author kanto
 */
public class Message {
      
    //Vars
    private String message;
    
    public Message(String message){
        this.message = message;
    }

    public  String getMessages() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }    
}
