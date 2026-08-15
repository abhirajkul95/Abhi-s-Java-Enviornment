import java.util.ArrayList;
import java.util.List;
public class duplicatemissing {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,5};
        System.out.println(duplimissing(arr));
    }

 static List<Integer> duplimissing(int[] arr) {
    int i = 0;
    List<Integer> ans = new ArrayList<>();
    
    while (i < arr.length) {
        int correct = arr[i] - 1;
        
        // Check if the current element is within bounds and not at its correct position
        if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
            swap(arr, i, correct);
        } else {
            i++;
        }
    }
    
    // After sorting, find the missing and duplicate numbers
    for (int index = 0; index < arr.length; index++) {
        if (arr[index] != index + 1) {
            ans.add(arr[index]); // Duplicate
            ans.add(index + 1);  // Missing
        }
    }
    
    return ans;
}

    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
    

