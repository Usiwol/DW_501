import random

# 각 도시의 신생아, 초등학생, 중학생, 고등학생, 대학생, 노년층의 인구수를 입력하시오.
# 딕셔너리에 저장하시오.
# 어떤 것이 키이고 어떤 것이 value로 들어가야할지 생각해보기

city = ("서울","대전","대구","광주","부산,""울산","세종");

# 쌤 답안 
kind=("신생아", "초등학생", "중학생", "고등학생", "대학생", "노년층");

population = dict()
for cname in city: # 도시 수만큼 입력하기
    temp=dict()
    print("===== {0} 지역 인구수 =====".format(cname))
    for k in kind: #랜덤 돌리기
        i = random.randint(1000,300000)
        print("{0} : {1}".format(k,i))
        temp[kind] = i # 신생아, 초등학생, 중학생... 인구수를 딕셔너리에 저장
        # 키 - 신생아, 초딩, 중딩 ...  value - 인구수
    population[cname] = temp #위에서 만들어진 딕셔너리를 value로, 도시이름을 key

for k in population:
    print("{0} : {1}".format(k,population[k]))

'''
# 지연이가 알려준 답안
city = ("서울",'대전','대구','광주','부산','울산','세종')
keys = ["신생아", "초등학생","중학생", "고등학생", "대학생", "노년층"]
values = list() 
dicCity = dict()

for i in range(len(city)):
    temp = list() 
    for k in keys: 
       temp.append(input(city[i] + k))
    values.append(temp)

for v in city:
    for i in values:
        dicCity[v] = dict(zip(keys,i))
print(dicCity)
'''