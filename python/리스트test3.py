import random

'''
name=["김유신","이순신","어영담","이성계","장영실","홍길동","김지연","김춘추"]
job=["군인","국회의원","과학자","도둑","건설업자","밸리댄서","변호사"]
age=[24,35,37,21,28,41,29,35,42]

info=[]
age20=[]
avg=0

for i in range(10):
    info.append([random.choice(name), random.choice(job), random.choice(age)])

# info 리스트로 작업하기
# 1. 직업이 군인인 사람은 누구인지 이름출력
# 2. 직업이 과학자인 사람들의 평균 나이 출력
# 3. 나이가 이십대인 사람들의 직업은 무엇인지 출력하기

# 쌤 답안
# 1. 직업이 군인인 사람은 누구인지 이름출력
for people in info: 
    if "군인" in people:
        print("군인 : "+ people[0])

# 2. 직업이 과학자인 사람들의 평균 나이 출력
age=0
cnt=0
for people in info:
    if "과학자" in people:
        age += people[2] #하나하나 더하기

if cnt!=0:
    print("과학자 평균 나이", str(age/cnt))
else:
    print("과학자가 없다")

# 3. 나이가 이십대인 사람들의 직업은 무엇인지 출력하기
print("20대의 직업군======================")
for people in info:
    if int(int(people[2]) / 10 ) == 2 :
        print(people[1])

# 나의 풀이
# 1. 직업이 군인인 사람은 누구인지 이름출력
word = "군인"
for i in info:
    if word in i:
        print(name)

# 2. 직업이 과학자인 사람들의 평균 나이 출력
word2 = "과학자"
for i in info:
    if word2 in i:
        avg += i

print(int(avg / len(info)))

# 3. 나이가 이십대인 사람들의 직업은 무엇인지 출력하기
for 개인 in info:
    if int(int(개인[2])/10) == 2 :
        age20.append(개인[1])

print(age20) # for문이 끝나고 도출
'''

# 랜덤 사용방법
# random.randint(1,40) - > 1~40 중에서 랜덤

a=[] # 랜덤범위 1~20
b=[] # 랜덤범위 10~50
c=[] # 랜던범위 1~100

num=[]
# a,b,c 리스트에 각각 10개씩 랜덤 범위에 맞춰서 저장하기
# a,b,c 리스트의 값중에서 중복인 값만 찾아서 num 리스트에 저장하기

for i in range(15):
    a.append([random.randint(1,20)])
    b.append([random.randint(10,50)])
    a.append([random.randint(1,100)])

for x in a: # a리스트의 값을 하나씩 하나씩 x 변수에 저장
    if x in b: # x 변수의 값이 리스트 b에 있냐?
        if x in c: # x변수의 값이 리스트 b에는 있는데 리스트 c에도 있냐?
            num.append(x)

if len(num)  !=0:# len(num) -> num 리스트의 크기값 0이라면 없다. , not num -> num이 비었다면 false
    print(num)
else:
    print("num은 비었다.")

# 재영이가 알려준 답
for i in range(1, 16):
    a.append([random.randint(1,20)])
    b.append([random.randint(10,50)])
    c.append([random.randint(1,100)])
print(a)
print(b)
print(c)

for i in a:
    if i in b:
        num.append(i)
        if num in c:
            num.append(i)
print(num)