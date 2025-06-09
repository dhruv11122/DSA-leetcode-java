class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int start = 0, end = n - 1;

        // Find peak
        while (start < end) {
            int mid = (start + end) / 2;

            // Cache these values to avoid multiple calls
            int midVal = mountainArr.get(mid);
            int midNextVal = mountainArr.get(mid + 1);

            if (midVal < midNextVal) {
                start = mid + 1;
            } else if (midVal > midNextVal) {
                end = mid;
            }
        }

        int ans = -1;
        int peak = start;

        // Binary search in ascending part
        start = 0;
        end = peak;
        while (start <= end) {
            int mid = (start + end) / 2;

            // Cache get call
            int val = mountainArr.get(mid);

            if (val > target) {
                end = mid - 1;
            } else if (val < target) {
                start = mid + 1;
            } else {  // val == target
                ans = mid;
                break;
            }
        }

        // If not found in ascending part, search descending
        if (ans == -1) {
            start = peak + 1;
            end = n - 1;
            while (start <= end) {
                int mid = (start + end) / 2;

                // Cache get call
                int val = mountainArr.get(mid);

                // Descending array logic
                if (val > target) {
                    start = mid + 1;
                } else if (val < target) {
                    end = mid - 1;
                } else {  // val == target
                    ans = mid;
                    break;
                }
            }
        }

        return ans;
    }
}
