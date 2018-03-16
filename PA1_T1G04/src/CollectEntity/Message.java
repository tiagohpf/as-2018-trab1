package CollectEntity;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author José Santos
 * @author Tiago Faria
 */
public class Message {
    private String message;

    public Message() {
    }
    
    public Message(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void enrichMessage() {
        StringBuilder enrichedMessage = new StringBuilder();
        String[] fields = this.message.split(";");
        // Add car_id and time
        enrichedMessage.append(fields[0]).append(";").append(fields[1]).append(";");
        enrichedMessage.append(generateRegist(fields[0])).append(";");
        for (int i = 2; i < fields.length; i++) {
            if (i < fields.length - 1) {
                enrichedMessage.append(fields[i]).append(";");
            } else {
                enrichedMessage.append(fields[i]);
            }
        }
        //append max speed
        if(fields[2].equals("01")){
            enrichedMessage.append(";100");
        }
        this.message = enrichedMessage.toString();
    }
            
    private String generateRegist(String car_id) {
        StringBuilder regist = new StringBuilder();
        Random random = new Random();
        // Regist XX-YY
        for (int i = 0; i < 5; i++) {
            if (i == 2)
                regist.append("-");
            else {
                char letter = (char) (random.nextInt(26) + 'A');
                regist.append(Character.toString(letter));
            }
        }
        String new_car_id = new DecimalFormat("00").format(Integer.parseInt(car_id));
        // Regist XX-YY-ZZ
        return regist.append("-").append(new_car_id).toString();
    }
}
