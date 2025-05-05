class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        for i in range(numRows):
            aux = []
            for j in range(i+1):
                if j == 0 or j == i:
                    aux.append(1)
                else:
                    aux.append(res[i-1][j-1] + res[i-1][j])
            res.append(aux)
        return res
        
