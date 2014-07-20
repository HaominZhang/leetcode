//http://www.programcreek.com/2012/12/leetcode-word-ladder/
    public int ladderLength(String start, String end, Set<String> dict) {
     if (dict.size() == 0)  
        return 0; 
     
      LinkedList<String> wordQueue = new LinkedList<String>();
      //LinkedList<Integer> distanceQueue = new LinkedList<Integer>();
      //distanceQueue.add(1);
      int length=1;
     
        wordQueue.add(start);
        while(!wordQueue.isEmpty()){
            String currWord = wordQueue.pop();
            //Integer currDistance = distanceQueue.pop();
            int currLen = length--;
            if(currWord.equals(end)){
                return currLen;
            }
            for(int i=0; i<currWord.length(); i++){
                char[] currCharArr = currWord.toCharArray();
                for(char c='a'; c<='z'; c++){
                    currCharArr[i] = c;
 
                    String newWord = new String(currCharArr);
                    if(dict.contains(newWord)){
                        wordQueue.add(newWord);
                        length = currLen+1;
                        dict.remove(newWord);
                    }
                }
            }
        }
 
        return 0;
    }