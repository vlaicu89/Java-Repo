package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("----Deploying etsy app to AWS zones-----");
        String[] zonesToDeploy = zones.split(",");
        for(String each : zonesToDeploy){
            System.out.println(each);
        }

    }
}
