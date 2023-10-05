package algorithms.hard;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList();
        int i = 0;
        int j = 0;
        while(i < nums1.length || j < nums2.length) {
            if(i < nums1.length && j < nums2.length) {
                int a = nums1[i];
                int b = nums2[j];
                if(a > b) {
                    list.add(b);
                    j++;
                } else {
                    list.add(a);
                    i++;
                }
            } else if(i < nums1.length) {
                int a = nums1[i];
                list.add(a);
                i++;
            } else {
                int b = nums2[j];
                list.add(b);
                j++;
            }
        }
        int listSize = list.size();
        if(listSize % 2 == 0) {
            int mid = listSize / 2;
            int a = list.get(mid);
            int b = list.get(mid - 1);
            return (a + b) / 2.0;
        } else {
            int mid = listSize / 2;
            return list.get(mid);
        }
    }

}
