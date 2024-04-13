package utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class US_20_MeetUpdateJsonPlaceHolderMapper {
    public static Map<String, Object> jsonPlaceHolderMapper(String date, String description, String startTime, String stopTime, List<String> studentId){

        Map<String, Object> map = new HashMap<>();
        if (date != null){
            map.put("date", date);
        }
        if (description != null){
            map.put("description", description);
        }

        if (startTime != null){
            map.put("startTime", startTime);
        }
        if (stopTime != null){
            map.put("stopTime", stopTime);
        }
        if (studentId != null){
            map.put("studentId", studentId);
        }
        return map;
    }

    public static String stringBody(String date, String description, String startTime, String stopTime, List<String> studentId){

        return  "{\"date\": "+date+",\"description\": \""+description+"\",\"startTime\": "+startTime+"\"stopTime\": \""+stopTime+"\"studentId\": \""+studentId+"}";

    }
}
