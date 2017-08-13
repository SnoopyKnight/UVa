dragon = []
fighter = []
cur = 0 #目前要砍的龍
cost = 0 #雇用戰士總花費

n = input("How many dragon: ") 
m = input("How many fighter: ")  

for i in range(int(n)):
	size = input("dragon size:")
	dragon.append(size)
#print(dragon)

for j in range(int(m)):
	ability = input("fighter ability:")
	fighter.append(ability)

dragon.sort()    #由小到大排序強弱
fighter.sort()

for k in range(int(m)):
	if fighter[k] >= dragon[cur]:
		cost += int(fighter[k])       #雇用戰士
		cur += 1
		if ( cur == int(n) ):
			break;               #若砍完龍則及時退出(一個戰士只能砍一隻龍)
if( cur < int(n) ):
	print("Loowater is doomed!")
else:
	print("cost",cost)