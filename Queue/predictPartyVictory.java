class Solution {
  // Note in this problem any opposing party member can be removed not just adjacent
    public String predictPartyVictory(String senate) {
        Queue<Integer> rQueue = new LinkedList<>() ;
        Queue<Integer> dQueue = new LinkedList<>() ;
       

        for(int i = 0 ; i < senate.length() ; i++){
            // senateQueue.add(senate.charAt((i))) ;
            if(senate.charAt((i)) == 'R'){
                rQueue.add(i) ;
            }else{
                dQueue.add(i) ;
            }
        }

        while(!rQueue.isEmpty() && !dQueue.isEmpty()){
            int rPos = rQueue.poll()  ;
            int dPos = dQueue.poll() ;

            if(rPos < dPos){
                rQueue.add(rPos + senate.length()) ;
            }else{
                dQueue.add(dPos + senate.length()) ;
            }
        }

        return dQueue.isEmpty() ? "Radiant" : "Dire";
    }

  // Assumes that only adjacent opposing party members can be removed
  public String predictPartyVictory2(String senate) {
        Queue<Character> senateQueue = new LinkedList<>() ;
        Map<Character , Integer> numOfVotes = new HashMap<>() ;

        numOfVotes.put('R' , 0) ;
        numOfVotes.put('D' , 0) ;

        for(int i = 0 ; i < senate.length() ; i++){
            senateQueue.add(senate.charAt((i))) ;
        }

        Character currentVoter = senateQueue.poll() ;
        Character nextVoter = senateQueue.poll() ;

        while(!senateQueue.isEmpty() || currentVoter != null ){

            if((currentVoter == nextVoter) || (nextVoter == null)){
                numOfVotes.put(currentVoter , numOfVotes.get(currentVoter) + 1) ;
                currentVoter = nextVoter ;
                nextVoter = senateQueue.poll() ;
            }else{
                senateQueue.add(currentVoter) ;
                currentVoter = senateQueue.poll() ;
                nextVoter = senateQueue.poll() ;
            }
        }

        int numOfR = numOfVotes.get('R') ;
        int numOfD = numOfVotes.get('D') ;

        return numOfR > numOfD ? "Radiant" : "Dire";
    }
  
}
