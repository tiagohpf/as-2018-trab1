/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectEntity;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import org.apache.kafka.common.serialization.Serializer;

/**
 *
 * @author kanto
 */
public class MessagesSerializer implements Serializer<Messages> {

    @Override
    public void configure(Map<String, ?> map, boolean bln) {
    }

    @Override
    public byte[] serialize(String string, Messages m) {
        if (m == null) {
            return null;
        }
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(m).getBytes();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return null;
    }

    @Override
    public void close() {
    
    }

}
