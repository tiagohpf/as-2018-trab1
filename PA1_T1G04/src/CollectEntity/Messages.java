/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectEntity;

import java.util.ArrayList;

/**
 *
 * @author kanto
 */
public class Messages {
      
    //Vars
    private ArrayList<String> messages;
    
    public Messages(){
        messages = new ArrayList<>();
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    public String toString() {
        String output = "";
        for (String s : messages){
            output+=s + "\n";
        }
        return output;
    }
    
    
}
