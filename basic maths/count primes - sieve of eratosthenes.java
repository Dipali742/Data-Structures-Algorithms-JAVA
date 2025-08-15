class Solution { 
    public int countPrimes(int n) { 
        // ArrayList<Boolean> sieve = new ArrayList<>(Collections.nCopies(n, true)); 
        boolean[] sieve = new boolean[n]; 
        Arrays.fill(sieve, true);

        int cnt = 0; 
        for(int i = 2; i <= Math.sqrt(n); i++) {
            for(int j = i*2; j < n && sieve[i] == true; j = j+i) { 
                sieve[j]= false; 
            } 
        }
        for(int i = 2; i < n; i++) {
            if(sieve[i] == true) cnt++;
        } 
        return cnt; 
    }
}

/*
    O(n) + O(log(log(n)))
*/