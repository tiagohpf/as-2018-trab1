/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectEntity;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.kafka.common.serialization.Deserializer;

/**
 *
 * @author kanto
 */
public class MessagesDeserializer implements Deserializer<Message>{

    @Override
    public void configure(Map<String, ?> map, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message deserialize(String string, byte[] bytes) {
        ObjectMapper mapper = new ObjectMapper();
        Message m = null;
        try{
            m = mapper.readValue(bytes, Message.class);
        } catch (IOException ex) {
            Logger.getLogger(MessagesDeserializer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(m == null){
            System.exit(2);
        }
        return m;
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
