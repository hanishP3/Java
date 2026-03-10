package day2;

public class ArraySampe {
    public static void main(String[] args) {
        int [] powerLevels = new int[5];
        powerLevels[0] = 100;
        powerLevels[1] = 500;
        powerLevels[2] = 900;
        powerLevels[2] = 1500;
        int totalPower = powerLevels[0] + powerLevels[1]+powerLevels[2];
        System.out.println("The total power"+totalPower);
        System.out.println("the power level 2 "+powerLevels[2]);
        System.out.println("the lenght of the power levels "+powerLevels.length);

    }
}
