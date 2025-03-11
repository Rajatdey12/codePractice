package test.basics.pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    private List<List<Integer>> combinationSum(int[] arr, int target) {

        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(arr);
        backtrack(arr, target, 0, new ArrayList<>(), resultList);
        return resultList;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> tempList, List<List<Integer>> resultList) {
        if (target == 0) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) break;
            tempList.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, tempList, resultList);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        CombinationSum cs = new CombinationSum();
        List<List<Integer>> combinations = cs.combinationSum(arr, target);
        System.out.println(combinations);
    }
}
