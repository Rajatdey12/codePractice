package test;

public class SwitchCaseEg {

    public static String switchModeOfTravel(String mode) {

        switch (mode) {
            case "ROAD":
                return "BUS";

            case "AIR":
                return "AEROPLANE";

            case "WATER":
                return "SHIP";

            case "LOCAL":
                return "AUTO/CAB";

            default:
                return "WALK";
        }
    }

    public static void main(String[] args) {
        System.out.println(switchModeOfTravel("LOCAL"));
    }
}
