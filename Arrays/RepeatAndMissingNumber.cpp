// You are given a read only array of n integers from 1 to n.

// Each integer appears exactly once except A which appears twice and B which is missing.

// Return A and B.

// Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

// Note that in your output A should precede B.

// Example:

// Input:[3 1 2 5 3] 

// Output:[3, 4] 

// A = 3, B = 4

vector<int> Solution::repeatedNumber(const vector<int> &A) {
    long long int sum = 0, sumSq = 0, eSum = 0, eSumSq = 0;
    for(long long int i = 0; i< A.size(); i++){
        sum += (long long int)A[i];
        sumSq += (long long int)A[i]*A[i];
    }
    long long int n = A.size();
    eSum = (long long int)(n*(n+1))/2;
    eSumSq  = (long long int)(n*(n+1)*(2*n +1))/6;
    
    long long int sq_d = eSumSq - sumSq;
    long long int sum_d = eSum - sum;
    
    long long int AddB = sq_d/sum_d;
    
    long long int miss = (AddB + sum_d)/2;
    long long int rept = miss - sum_d;
    
    vector<int> res;
    res.push_back((int)rept);
    res.push_back((int)miss);

    return res;
}
