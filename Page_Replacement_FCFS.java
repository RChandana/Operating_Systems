import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
class Test{
    static int page_Faults(int pages[], int n, int capacity){
        HashSet<Integer> s = new HashSet<>(capacity);
        Queue<Integer> indexes = new LinkedList<>() ;
        int page_faults = 0;
        for (int i = 0; i < n; i++){
            if (s.size() < capacity){
                if (!s.contains(pages[i])){
                    s.add(pages[i]);
                    page_faults++;
                    indexes.add(pages[i]);
                }
            }
