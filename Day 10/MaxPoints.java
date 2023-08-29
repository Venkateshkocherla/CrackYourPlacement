class MaxPoints {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = Arrays.stream(cardPoints).sum();
        int w = n - k;
        int ws = 0;
        for (int i = 0; i < w; i++) {
            ws += cardPoints[i];
        }
        int min = ws;
        for (int i = w; i < n; i++) {
            ws += cardPoints[i] - cardPoints[i - w];
            min = Math.min(min, ws);
        }
        return sum - min;
    }
}