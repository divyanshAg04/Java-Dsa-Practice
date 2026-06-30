public class findPoisonedDuration {

    public int calculatePoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] <= timeSeries[i] + duration - 1) {
                total += timeSeries[i + 1] - timeSeries[i];
            } else {
                total += duration;
            }
        }

        total += duration;

        return total;
    }

    public static void main(String[] args) {
        findPoisonedDuration solution = new findPoisonedDuration();

        int[] timeSeries = {1, 4};
        int duration = 2;

        int result = solution.calculatePoisonedDuration(timeSeries, duration);

        System.out.println(result);
    }
}
