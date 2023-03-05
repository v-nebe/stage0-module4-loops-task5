package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i<height; i++){
            for (int j=0; j<height; j++) {
                if (i <= j && i < height - j || i >= j && i >= height - j - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
