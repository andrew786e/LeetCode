class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> asteroidStack = new Stack<>() ;

        for(int incomingAsteroid : asteroids){
            if(asteroidStack.isEmpty()){
                asteroidStack.push(incomingAsteroid) ;
            }else{
                while(!asteroidStack.isEmpty() && asteroidStack.peek() > 0 && incomingAsteroid < 0 && (asteroidStack.peek() + incomingAsteroid) < 0){
                    asteroidStack.pop() ;
                }

                if(!asteroidStack.isEmpty() &&Math.abs(incomingAsteroid) == asteroidStack.peek() && asteroidStack.peek() > 0 && incomingAsteroid < 0){
                    asteroidStack.pop() ;
                    continue ;
                }

                if(asteroidStack.isEmpty()){
                    asteroidStack.push(incomingAsteroid) ;
                }else if(asteroidStack.peek() > 0 && incomingAsteroid > 0){
                    asteroidStack.push(incomingAsteroid) ;
                }else if(asteroidStack.peek() < 0 && incomingAsteroid < 0){
                    asteroidStack.push(incomingAsteroid) ;
                }else if(asteroidStack.peek() < 0 && incomingAsteroid  > 0){
                    asteroidStack.push(incomingAsteroid) ;
                }
            }
        }

        int[] arr = new int[asteroidStack.size()] ;
        int j = asteroidStack.size() - 1 ;

        while(!asteroidStack.isEmpty()){
            arr[j] = asteroidStack.pop() ;
            j-- ;
        }

        return arr ;
    }
}
