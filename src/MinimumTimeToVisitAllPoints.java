public class MinimumTimeToVisitAllPoints{

        public int minTimeToVisitAllPoints(int[][] points) {
            int startX = points[0][0];
            int startY = points[0][1];
            int count = 0;

            for(int i=1;i<points.length;i++){
                int targetX = points[i][0];
                int targetY = points[i][1];
                while(startX != targetX || startY != targetY){
                    if(startX < targetX || startY < targetY){
                        if(startX != targetX)
                            startX++;
                        if(startY != targetY)
                            startY++;
                    }
                    else if(startX > targetX || startY > targetY){
                        if(startX != targetX)
                            startX--;
                        if(startY != targetY)
                            startY--;
                    }
                    count++;
                }
            }
            return count;
        }


    public static void main(String[] args) {
        int[][] arr = {{1,1},{3,4},{-1,0}};
        MinimumTimeToVisitAllPoints minimumTimeToVisitAllPoints = new MinimumTimeToVisitAllPoints();
        System.out.println(minimumTimeToVisitAllPoints.minTimeToVisitAllPoints(arr));
    }
}