package arrnclctn.basic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Software {
    private  String serverName;
    private String softwareType;
    private String softwareTypeName;
    private String versionNumber;
    public String toString(){
        return String.format("%s %s %s %s", serverName, softwareType, softwareTypeName, versionNumber);
    }

}

