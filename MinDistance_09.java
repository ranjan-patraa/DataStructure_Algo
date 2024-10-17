package gs;

public class MinDistance_09 {
    public static void main(String[] args) {
      String str = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";

      String str1 = "geeks for geeks contribute practice";
      String w1 = "geeks";
      String w2 = "practice";
        System.out.println(minDistance(str1, w1, w2));

      int minDis = minDistance(str, word2, word1);
        System.out.println(minDis);
    }

    private static int minDistance(String str, String word1, String word2) {
        String[] words = str.split(" ");
        int minDistance = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;
        for(int i= 0; i < words.length; i++) {
            if(words[i].equals(word1)){
                index1 = i;
                if(index2 != -1){
                    minDistance = Math.min(minDistance, index1-index2-1);
                }
            }else if(words[i].equals(word2)) {
                index2 = i;
                if(index1 != -1){
                    minDistance = Math.min(minDistance, index2-index1-1);
                }
            }
        }
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }

}
