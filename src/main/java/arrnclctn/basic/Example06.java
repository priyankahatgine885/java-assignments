package arrnclctn.basic;
import arrnclctn.basic.model.Software;
import arrnclctn.basic.model.SoftwareStatus;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Out of Date Software :
Consider the file input.txt which contains all information about software installed on various servers in a data center:

Server1, Database, MySQL, 5.5
Server2, Database, MySQL, 5.1
Server3, OS, Ubuntu, 12.04
Server1, OS, Ubuntu, 12.04
Server2, OS, Ubuntu, 18.04
Server3, Language, Python, 2.6.3

This file indicates that Server1 has version 5.5 of MySQL installed, and Server2 has version 5.1 installed, and Server3 has version 12.04 of Ubuntu installed. For the purposes of this program, assume that all version numbers are of the form X.Y or X.Y.Z where X, Y, and Z are made up of only digits.

Write a program that reads this file (input.txt in the current directory), and prints to file output.txt  (in the current directory) a list of software package names for which an out-of-date version  (i.e. a version which is not the latest version) is installed on at least 2 different servers.
Thus, in this case, the output of your program should be:
Ubuntu
Because Ubuntu 12.04 is an out-of-date version (the latest version is 18.04), and it is installed on two servers (Server 3, and Server 1).
 */
public class Example06 {
    public static void main(String[] args) {
        List<String> stringList = readFileData("./src/main/java/arrnclctn/basic/SoftwareData");
        List<Software> softWaresList = prepareData(stringList);
        Map<String, SoftwareStatus> softwareMap = getLatestSoftwareTypeNameVersionMap(softWaresList);
        printSoftwareMap(softwareMap);
        System.out.println("-----------------------------");
        List<Software> outDatedSoftware = getOutOfDateVersionIsInstalledOnAtLeastTwoDiiferentServers(softWaresList, softwareMap);
        for (Software software : outDatedSoftware) {
            System.out.println(software);
        }
    }

    public static List<String> readFileData(String path) {
        String filePath = path;
        List<String> stringList = new ArrayList<>();
        try {
            BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
            String lineText = null;
            while ((lineText = lineReader.readLine()) != null) {
                stringList.add(lineText);
            }
            lineReader.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
        return stringList;
    }

    private static List<Software> prepareData(List<String> stringList) {
        List<Software> softWares = new ArrayList<>();
        for (String str : stringList) {
            if (!str.isEmpty()) {
                String[] columns = str.split(",");
                System.out.println(columns[3]);
                Software softWare = new Software(columns[0], columns[1], columns[2], columns[3]);
                softWares.add(softWare);
            }
        }
        return softWares;
    }

    private static Map<String, SoftwareStatus> getLatestSoftwareTypeNameVersionMap(Iterable<Software> softWares) {
        Map<String, SoftwareStatus> softwareMap = new HashMap<>();
        for (Software softWare : softWares) {
            String softWareTypename = softWare.getSoftwareTypeName();
            String currentVersion = softWare.getVersionNumber();
            if (softwareMap.containsKey(softWareTypename)) {
                SoftwareStatus softwareStatus = softwareMap.get(softWareTypename);
                int SoftwareCount = softwareStatus.getInstalledCount();
                SoftwareCount++;
                softwareStatus.setInstalledCount(SoftwareCount);
                String latestVersion = softwareStatus.getLatestVersion();
                if (currentVersion.compareTo(latestVersion) > 0) {
                    latestVersion = currentVersion;
                    softwareStatus.setLatestVersion(latestVersion);
                    softwareMap.put(softWareTypename, softwareStatus);
                }
            } else {
                SoftwareStatus softwareStatus = new SoftwareStatus(currentVersion, 1);
                softwareMap.put(softWareTypename, softwareStatus);
            }
        }
        return softwareMap;
    }

    private static List<Software> getOutOfDateVersionIsInstalledOnAtLeastTwoDiiferentServers(Iterable<Software> softWares, Map<String, SoftwareStatus> latestSoftwareVersion) {
        List<Software> softWareList = new ArrayList<>();
        for (Software softWare : softWares) {
            String softwareTypeName = softWare.getSoftwareTypeName();
            String currentVersion = softWare.getVersionNumber();
            SoftwareStatus softwareStatus = latestSoftwareVersion.get(softwareTypeName);
            String softwareStatusLatestVersiont = softwareStatus.getLatestVersion();
            int softwareCount = softwareStatus.getInstalledCount();
            if (softwareCount > 2) {
                if (currentVersion.compareTo(softwareStatusLatestVersiont) < 0) {
                    softWareList.add(softWare);
                }
            }
        }
        return softWareList;
    }

    public static void printSoftwareMap(Map<String, SoftwareStatus> softwareMap) {
        for (Map.Entry<String, SoftwareStatus> entry : softwareMap.entrySet()) {
            String key = entry.getKey();
            SoftwareStatus version = entry.getValue();
            System.out.println("Key: " + key + " " + "Value: " + version);
        }
    }
}
