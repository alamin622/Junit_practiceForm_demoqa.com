import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utils extends practiceForm {
    public void StudentInfo() throws IOException, ParseException {
        String filePath = "./src/test/resources/student.json";

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(filePath));
        JSONObject sObj = new JSONObject();

        sObj.put("First Name" , txtFirstName);
        sObj.put("Last Name" , txtLastName);
        sObj.put("Email" , txtEmail);
        sObj.put("Mobile" , txtMobileNumber);
        sObj.put("Date Of Birth" , txtDate);
        sObj.put("Subject" , txtSubject);
        JSONArray studentInfoArray = (JSONArray) obj;
        studentInfoArray.add(sObj);
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(studentInfoArray.toJSONString());
        fileWriter.flush();
        fileWriter.close();
        System.out.println("Saved!");
        System.out.print(studentInfoArray);
    }
}
