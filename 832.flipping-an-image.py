class Solution:
    def lemonadeChange(self, bills):
        count5 = 0
        count10 = 0
        for i in bills:
            if i == 5:
                count5+=1
            elif i == 10:
                if count5 == 0:
                    return False
                else:
                    count5-=1
                    count10+=1
            else:
                if count5 >=1 and count10 >=1:
                    count5-=1
                    count10-=1
                elif count5 >= 3:
                    count5-=3
                else:
                    return False
        return True
                