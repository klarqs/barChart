public class BarChart {
    public static void main(String[] args) {
        
        int[] marks = {95, 87, 97, 93, 85};
        int[] frequency = {3, 1, 7, 2, 5};
        for (int i = 0; i < frequency.length; i++) {
            int count = frequency[i];
            System.out.print(marks[i]+ ": ");
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
