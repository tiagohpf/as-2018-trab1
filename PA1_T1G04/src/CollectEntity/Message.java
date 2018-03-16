package CollectEntity;

import java.text.DecimalFormat;

/**
 *
 * @author José Santos
 * @author Tiago Faria
 */
public class Message {

    private String message;

    public Message() {
    }

    public Message(String message) {
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
        // Add car register
        enrichedMessage.append(generateRegist(fields[0])).append(";");
        // Add other fields
        for (int i = 2; i < fields.length; i++) {
            if (i < fields.length - 1)
                enrichedMessage.append(fields[i]).append(";");
            else
                enrichedMessage.append(fields[i]);
        }
        // Append max speed when msg_id is 01
        if (fields[2].equals("01"))
            enrichedMessage.append(";100");
        this.message = enrichedMessage.toString();
    }

    private String generateRegist(String car_id) {
        String new_car_id = new DecimalFormat("00").format(Integer.parseInt(car_id));
        // Regist XX-YY-ZZ
        return "XX-YY-" + new_car_id;
    }
}
