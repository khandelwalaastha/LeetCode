class Solution {
public:
    vector<int> twoSum(vector<int>& A, int x) {
        map<int,int> mp;
        vector<int> B;
        int n = A.size();
        for(int i=0;i<n;i++) {
            if(mp[x-A[i]] != 0) {
                B.push_back(i);
                B.push_back(mp[x-A[i]] - 1);
                return B;
            }
            mp[A[i]] = i+1;
        }
        return B;
    }
};
