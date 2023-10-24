package algorithms.medium;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int size = height.length;
        int potentialMaxArea = height.length*10000;
        int maxArea = 0;
        int area = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < size && maxArea < potentialMaxArea; i++) {
            for(int j = i + 1; j < size; j++) {
                x = j - i;
                y = Math.min(height[i], height[j]);
                area = x * y;
                if(area > maxArea)
                    maxArea = area;
            }
            potentialMaxArea=potentialMaxArea - 10000;
        }
        return maxArea;
    }

}
